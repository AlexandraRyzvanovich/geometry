import entity.Triangle;
import exception.DataReaderException;
import reader.DataReader;
import utils.TriangleCreator;
import validator.TriangleDataValidator;
import validator.TrianglePointsValidator;
import validator.TriangleValidator;

import java.util.List;
import java.util.Optional;

public class Director {
    private final DataReader reader;
    private final TriangleDataValidator dataValidator;
    private final TrianglePointsValidator validator;
    private final TriangleCreator creator;
    private final TriangleValidator triangleValidator;

    public Director() {
        this.reader = new DataReader();;
        this.dataValidator = new TriangleDataValidator();
        this.validator =  new TrianglePointsValidator();
        this.triangleValidator = new TrianglePointsValidator();
        this.creator = new TriangleCreator(triangleValidator);
    }

    public void runner(String path) throws DataReaderException {

            List<String> list = reader.readLines("C:\\Users\\sasha\\IdeaProjects\\geometry\\src\\main\\resources\\triangleData");
            for (String line: list) {
                if(dataValidator.isValidLine(line)){
                    creator.create(line);
                    Optional<Triangle> optionalTriangle = creator.create(line);
                    if(optionalTriangle.isPresent()) {
                        Triangle triangle = optionalTriangle.get();
                     }
                }
            }

    }
}
