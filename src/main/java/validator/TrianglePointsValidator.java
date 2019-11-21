package validator;

import entity.Axis;

import java.util.List;

public class TrianglePointsValidator {

    public Boolean isValidTriangle(List<Double> listPoints){
        double x1 = listPoints.get(0);
        double y1 = listPoints.get(1);
        double x2 = listPoints.get(2);
        double y2 = listPoints.get(3);
        double x3 = listPoints.get(4);
        double y3 = listPoints.get(5);
        double square = (((x1 - x3)*(y2 - y3)) - (x2 - x3)*(y1 - y3))/2;

        return square > 0;
    }

    public Boolean isPointsInRange(List<Double> listPoints){
        double xMin = Axis.X_AXIS_MIN.getValue();
        double xMax = Axis.Y_AXIS_MAX.getValue();
        double yMin = Axis.Y_AXIS_MIN.getValue();
        double yMax = Axis.X_AXIS_MAX.getValue();
        double x = 0;
        double y = 0;
        for(int i = 0; i < listPoints.size(); i++){
            x = listPoints.indexOf(i);
            y = listPoints.indexOf(i+1);
        }

        return ((xMin >= x && x <= xMax) && (yMin >= y && y <= yMax));
    }
}
