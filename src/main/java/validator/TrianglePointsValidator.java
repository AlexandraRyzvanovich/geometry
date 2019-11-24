package validator;

import java.util.List;

public class TrianglePointsValidator implements TriangleValidator{

    public Boolean isTriangleValid(List<Double> listPoints){
        double x1 = listPoints.get(0);
        double y1 = listPoints.get(1);
        double x2 = listPoints.get(2);
        double y2 = listPoints.get(3);
        double x3 = listPoints.get(4);
        double y3 = listPoints.get(5);
        double square = (((x1 - x3)*(y2 - y3)) - (x2 - x3)*(y1 - y3))/2;

        return square > 0;
    }
}
