package utils;

import entity.Point;
import entity.Triangle;
import validator.TriangleValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TriangleCreator {
    private TriangleValidator validator;

    public TriangleCreator(TriangleValidator validator) {
        this.validator = validator;
    }

    public Optional<Triangle> create(String line){
        List<Double> trianglePoints = parseToDouble(line);
        if(validator.isTriangleValid(trianglePoints)){
            double x1 = trianglePoints.get(0);
            double y1 = trianglePoints.get(1);
            double x2 = trianglePoints.get(2);
            double y2 = trianglePoints.get(3);
            double x3 = trianglePoints.get(4);
            double y3 = trianglePoints.get(5);
          return Optional.of(new Triangle(new Point(x1,y1), new Point(x2,y2), new Point(x3,y3)));
        }
        return Optional.empty();
   }

    private List<Double> parseToDouble(String line) {

       List<Double> listDoubles = new ArrayList<>();
       String[] arr = line.split(" ");
           for (String item : arr) {
               double value = Double.parseDouble(item);
               listDoubles.add(value);
           }
       return listDoubles;
   }
}
