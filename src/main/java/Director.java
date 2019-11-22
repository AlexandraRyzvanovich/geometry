import entity.Triangle;
import reader.DataReader;
import utils.Calculator;
import utils.TriangleCreator;
import validator.CheckTriangle;
import validator.TriangleDataValidator;
import validator.TrianglePointsValidator;

import java.util.List;
import java.util.Optional;

public class Director {
    DataReader reader;
    TriangleDataValidator dataValidator;
    Calculator calculator;
    TrianglePointsValidator validator;
    TriangleCreator creator;
    CheckTriangle checkTriangle;

    public void runner() {
        reader = new DataReader();
        dataValidator = new TriangleDataValidator();
        calculator = new Calculator();
        validator = new TrianglePointsValidator();

            List<String> list = reader.readLines("C:\\Users\\sasha\\IdeaProjects\\geometry\\src\\main\\resources\\triangleData");
            for (String line: list) {
                if(dataValidator.isValidLine(line)){
                    checkTriangle = trianglePoints -> validator.isPointsInRange(trianglePoints) && validator.isValidTriangle(trianglePoints);
                    creator = new TriangleCreator(checkTriangle);
                    creator.create(line);
                    Optional<Triangle> optionalTriangle = creator.create(line);
                    if(optionalTriangle.isPresent()) {
                        Triangle triangle = optionalTriangle.get();
                        calculator.getSides(triangle);
                        double firstSide = triangle.getFirstSide();
                        double secondSide = triangle.getSecondSide();
                        double thirdSide = triangle.getThirdSide();
                        calculator.getPerimeter(firstSide, secondSide, thirdSide);
                        calculator.getSquare(firstSide, secondSide, thirdSide);
                        calculator.isAcuteAngled();
                        calculator.isEqualSides();
                        calculator.isEquilateral();
                     }
                }
            }
    }
}
