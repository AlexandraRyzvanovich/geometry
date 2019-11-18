import reader.DataReader;
import validator.TriangleDataValidator;

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
                    validatedList.add(line);
                }
            }

    }

}
