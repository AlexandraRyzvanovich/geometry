package comparator;

import entity.Point;
import entity.TriangleIdentifiable;

import java.util.Comparator;

public class TriangleComparatorByPoint implements Comparator<TriangleIdentifiable> {
    @Override
    public int compare(TriangleIdentifiable firstTriangle, TriangleIdentifiable secondTriangle) {
        Point firstTrianglePoint = firstTriangle.getFirstPoint();
        Point secondTrianglePoint = secondTriangle.getFirstPoint();
        if(firstTrianglePoint.getX() == secondTrianglePoint.getX()){
            return 0;
        }
        if(firstTriangle.getFirstPoint().getX() > secondTriangle.getFirstPoint().getX()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
