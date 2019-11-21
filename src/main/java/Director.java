import entity.Triangle;
import reader.DataReader;
import utils.Calculator;
import utils.TriangleCreator;
import validator.TriangleDataValidator;
import validator.TrianglePointsValidator;

import java.util.List;
import java.util.Optional;

public class Director {
    public static void main(String[] args) {

            DataReader reader = new DataReader();
            TriangleDataValidator dataValidator = new TriangleDataValidator();
            Calculator calculator = new Calculator();
            List<String> list = reader.readLines("C:\\Users\\sasha\\IdeaProjects\\geometry\\src\\main\\resources\\triangleData");
            for (String line: list) {
                if(dataValidator.isValidLine(line)){
                    TrianglePointsValidator validator = new TrianglePointsValidator();
                    TriangleCreator creator = new TriangleCreator(validator);
                    Optional<Triangle> triangle = creator.create(line);

                }
            }
    }
}
