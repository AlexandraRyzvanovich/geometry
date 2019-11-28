package triangleSpecification;

import entity.Point;
import entity.TriangleIdentifiable;

import java.util.ArrayList;
import java.util.List;

public class TriangleSpecificationByPoints implements TriangleSpecification {
    private final double minPoint;
    private final double maxPoint;

    public TriangleSpecificationByPoints(double minPoint, double maxPoint) {
        this.minPoint = minPoint;
        this.maxPoint = maxPoint;
    }

    @Override
    public boolean specified(TriangleIdentifiable triangle) {
        Point firstPoint = triangle.getFirstPoint();
        List<Double> points = new ArrayList<>();
        points.add(firstPoint.getX());
        points.add(firstPoint.getY());
        Point secondPoint = triangle.getSecondPoint();
        points.add(secondPoint.getX());
        points.add(secondPoint.getY());
        Point thirdPoint = triangle.getThirdPoint();
        points.add(thirdPoint.getX());
        points.add(thirdPoint.getY());
        for (double point: points) {
            if(point < minPoint || point > maxPoint ){
                return false;
            }
        }
        return true;
    }
}
