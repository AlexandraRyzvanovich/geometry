import entity.Triangle;
import reader.DataReader;
import utils.Calculator;
import utils.TriangleCreator;
import validator.CheckTriangle;
import validator.TriangleDataValidator;
import validator.TrianglePointsValidator;

import javax.xml.crypto.Data;
import java.io.Reader;
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
                    creator = new TriangleCreator(checkTriangle);
                    List<Double> doubleList =  creator.parseToDouble(line);
                    checkTriangle = trianglePoints -> validator.isValidTriangle(doubleList) && validator.isPointsInRange(doubleList);
                    creator.create(line);
                    Optional<Triangle> optionalTriangle = creator.create(line);
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
