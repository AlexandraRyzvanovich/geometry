import entity.Triangle;
import exception.DataReaderException;
import reader.DataReader;
import utils.Calculator;
import utils.TriangleCreator;
import validator.TriangleDataValidator;
import validator.TrianglePointsValidator;
import validator.TriangleValidator;

import java.util.List;
import java.util.Optional;

public class Director {
    DataReader reader;
    TriangleDataValidator dataValidator;
    Calculator calculator;
    TrianglePointsValidator validator;
    TriangleCreator creator;
    TriangleValidator checkTriangle;

    public void runner(String path) throws DataReaderException {
        reader = new DataReader();
        dataValidator = new TriangleDataValidator();
        calculator = new Calculator();
        validator = new TrianglePointsValidator();

            List<String> list = reader.readLines("C:\\Users\\sasha\\IdeaProjects\\geometry\\src\\main\\resources\\triangleData");
            for (String line: list) {
                if(dataValidator.isValidLine(line)){
                    creator = new TriangleCreator(checkTriangle);
                    creator.create(line);
                    Optional<Triangle> optionalTriangle = creator.create(line);
                    if(optionalTriangle.isPresent()) {
                        Triangle triangle = optionalTriangle.get();
                     }
                }
            }
    }
}
