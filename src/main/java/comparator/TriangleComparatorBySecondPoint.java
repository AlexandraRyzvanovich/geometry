package comparator;

import entity.Point;
import entity.TriangleIdentifiable;

import java.util.Comparator;

public class TriangleComparatorBySecondPoint implements Comparator<TriangleIdentifiable> {
    @Override
    public int compare(TriangleIdentifiable firstTriangle, TriangleIdentifiable secondTriangle) {
        Point firstTrianglePoint = firstTriangle.getSecondPoint();
        Point secondTrianglePoint = secondTriangle.getSecondPoint();
        if (firstTrianglePoint.getX() == secondTrianglePoint.getX()
                && firstTrianglePoint.getY() == secondTrianglePoint.getY()) {
            return 0;
        }
        if (firstTrianglePoint.getX() > secondTrianglePoint.getX()
                && firstTrianglePoint.getY() > secondTrianglePoint.getY()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
