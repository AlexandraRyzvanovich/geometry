import reader.DataReader;
import validator.TriangleDataValidator;
import validator.TrianglePointsValidator;

import java.util.ArrayList;
import java.util.List;

public class Director {
    public static void main(String[] args) {

            DataReader reader = new DataReader();
            TriangleDataValidator dataValidator = new TriangleDataValidator();
            List<String> list = reader.readLines("C:\\Users\\sasha\\IdeaProjects\\geometry\\src\\main\\resources\\triangleData");
            List<String> validatedList = new ArrayList<>();
            for (String line: list) {
                if(dataValidator.isValidLine(line)){
                    TrianglePointsValidator validator = new TrianglePointsValidator();
                    TriangleCreator creator = new TriangleCreator(validator);
                    creator.create(line);
                }
            }
    }
}
