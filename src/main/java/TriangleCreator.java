import utils.Triangle;
import validator.TrianglePointsValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TriangleCreator {
    TrianglePointsValidator validator;

    public TriangleCreator(TrianglePointsValidator validator) {
        this.validator = validator;
    }

public Optional<Triangle> create(String line){
        List<Double> triangleValues = parser(line);


   }
   private List<Double> parser(String line) {

       List<Double> listDoubles = new ArrayList<>();
       String[] arr = line.split(" ");
       try {
           for (String item : arr) {
               double value = Double.parseDouble(item);
               listDoubles.add(value);
           }
       }catch (NumberFormatException ex){
           throw new ConverterException("Impossible to convert string", ex);
       }
       return listDoubles;
   }
}
