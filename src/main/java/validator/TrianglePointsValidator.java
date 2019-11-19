package validator;

import utils.Axis;

import java.util.List;

public class TrianglePointsValidator implements CheckTriangle {

    @Override
    public Boolean isTriangleValid(List<Double> listPoints){
        double x1 = listPoints.get(0);
        double y1 = listPoints.get(1);
        double x2 = listPoints.get(2);
        double y2 = listPoints.get(3);
        double x3 = listPoints.get(4);
        double y3 = listPoints.get(5);
        double square = (((x1 - x3)*(y2 - y3)) - (x2 - x3)*(y1 - y3))/2;
        for(int i = 0; i < listPoints.size(); i++){
            if(!(isPointsInRange(listPoints.indexOf(i), listPoints.indexOf(i+1)))){
                return false;
            }
        }
        return square > 0 ? true : false;
    }

    private Boolean isPointsInRange(double x, double y){
        double xMin = Axis.X_AXIS_MIN.getValue();
        double xMax = Axis.Y_AXIS_MAX.getValue();
        double yMin = Axis.Y_AXIS_MIN.getValue();
        double yMax = Axis.X_AXIS_MAX.getValue();

            return ((xMin >= x && x <= xMax) && (yMin >= y && y <= yMax));
    }


}
