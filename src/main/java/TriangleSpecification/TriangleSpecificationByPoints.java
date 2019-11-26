package TriangleSpecification;

import TriangleSpecification.TriangleSpecification;
import entity.Point;
import entity.TriangleIdentifiable;

import java.util.ArrayList;
import java.util.List;

public class TriangleSpecificationByPoints implements TriangleSpecification {

    private final double MIN_POINT = 10;
    private final double MAX_POINT = 100;

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
            if(point < MIN_POINT || point > MAX_POINT ){
                return false;
            }
        }
        return true;
    }
}
