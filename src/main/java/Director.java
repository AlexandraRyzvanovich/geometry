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
    static DataReader reader;
    static TriangleDataValidator dataValidator;
    static Calculator calculator;
    static TrianglePointsValidator validator;
    static TriangleCreator creator;
    static CheckTriangle checkTriangle;

    public Director(DataReader reader, TriangleDataValidator dataValidator, Calculator calculator) {
        this.reader = reader;
        this.dataValidator = dataValidator;
        this.calculator = calculator;
    }

    public static void main(String[] args) {
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
                        calculator.getPerimeter(triangle);
                        calculator.getSquare(triangle);
                        calculator.isAcuteAngled();
                        calculator.isEqualSides();
                        calculator.isEquilateral();
                        calculator.isObtuseAngle();
                        calculator.isRightAngled();
                     }
                }
            }
    }
}
