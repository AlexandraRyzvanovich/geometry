package utils;

import exception.ConverterException;
import entity.Point;
import entity.Triangle;
import validator.CheckTriangle;
import validator.TrianglePointsValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TriangleCreator {
    CheckTriangle validator;

    public TriangleCreator(CheckTriangle validator) {
        this.validator = validator;
    }

    public Optional<Triangle> create(String line){
        List<Double> trianglePoints = parseToDouble(line);
        //if(validator.isTriangleValid(trianglePoints)){
            double x1 = trianglePoints.get(0);
            double y1 = trianglePoints.get(1);
            double x2 = trianglePoints.get(2);
            double y2 = trianglePoints.get(3);
            double x3 = trianglePoints.get(4);
            double y3 = trianglePoints.get(5);
          return Optional.of(new Triangle(new Point(x1,y1), new Point(x2,y2), new Point(x3,y3)));
       // }
        //return Optional.empty();
   }

    public List<Double> parseToDouble(String line) {

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
