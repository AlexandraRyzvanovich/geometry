package utils;

import entity.Point;
import entity.Side;
import entity.Triangle;

import java.util.ArrayList;
import java.util.List;

public class TriangleCalculator {
    private final int rightAngle = 90;
    private Side sides;

    public Double calculatePerimeter(Triangle triangle) {
        Side sides = calculateSides(triangle);
        double firstSide = sides.getFirstSide();
        double secondSide = sides.getSecondSide();
        double thirdSide = sides.getThirdSide();

        return (firstSide + secondSide + thirdSide);
    }

    public Double calculateSquare(Triangle triangle) {
        Side sides = calculateSides(triangle);
        double firstSide = sides.getFirstSide();
        double secondSide = sides.getSecondSide();
        double thirdSide = sides.getThirdSide();
        double perimeter  = calculatePerimeter(triangle);

        return Math.pow((perimeter * (perimeter - firstSide)
                *(perimeter - secondSide) * (perimeter-thirdSide)), 1.0 / 2.0);
    }

    public Boolean isRectangular(Triangle triangle) { //прямоугольный
        List<Double> angles = calculateAngles(triangle);
        double firstAngle = angles.get(0);
        double secondAngle = angles.get(1);
        double thirdAngle = angles.get(2);
        return firstAngle == rightAngle || secondAngle == rightAngle || thirdAngle == rightAngle;

    }

    public Boolean isEqualSides(Triangle triangle) { //равнобедренный
        List<Double> angles = calculateAngles(triangle);
        double firstAngle = angles.get(0);
        double secondAngle = angles.get(1);
        double thirdAngle = angles.get(2);
        return firstAngle == secondAngle || firstAngle == thirdAngle || thirdAngle == secondAngle;

    }

    public Boolean isEquilateral(Triangle triangle) { // равносторонний
        Side sides = calculateSides(triangle);
        double firstSide = sides.getFirstSide();
        double secondSide = sides.getSecondSide();
        double thirdSide = sides.getThirdSide();

        return firstSide == secondSide && firstSide == thirdSide;
    }

    public Boolean isAcuteAngled(Triangle triangle) { // остроугольный
        List<Double> angles = calculateAngles(triangle);
        double firstAngle = angles.get(0);
        double secondAngle =angles.get(1);
        double thirdAngle = angles.get(2);

        return firstAngle < rightAngle && secondAngle < rightAngle && thirdAngle < rightAngle;
    }

    public Boolean isObtuseAngle(Triangle triangle) { // тупоугольный
        List<Double> angles = calculateAngles(triangle);
        double firstAngle = angles.get(0);
        double secondAngle = angles.get(1);
        double thirdAngle = angles.get(2);

        return firstAngle > rightAngle && secondAngle > rightAngle && thirdAngle > rightAngle;
    }

    private Side calculateSides(Triangle triangle) {

        Point firstPoint = triangle.getFirstPoint();
        double x1 = firstPoint.getX();
        double y1 = firstPoint.getY();
        Point secondPoint = triangle.getSecondPoint();
        double x2 = secondPoint.getX();
        double y2 = secondPoint.getY();
        Point thirdPoint = triangle.getThirdPoint();
        double x3 = thirdPoint.getX();
        double y3 = thirdPoint.getY();
        double firstSide = Math.pow(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2), 1.0 / 2.0);
        double secondSide = Math.pow(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2), 1.0 / 2.0);
        double thirdSide = Math.pow(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2), 1.0 / 2.0);

        return new Side(firstSide, secondSide, thirdSide);
    }

    private List<Double> calculateAngles(Triangle triangle) {
        Side sides = calculateSides(triangle);
        double firstSide = sides.getFirstSide();
        double secondSide = sides.getSecondSide();
        double thirdSide = sides.getThirdSide();
        double firstAngle = Math.cos(Math.pow(firstSide, 2)
               + Math.pow(thirdSide, 2) - Math.pow(secondSide, 2) / 2 * firstSide * thirdSide);
        double secondAngle = Math.cos(Math.pow(firstSide, 2)
               + Math.pow(secondSide, 2) - Math.pow(thirdSide, 2) / 2 * firstSide * secondSide);
        double thirdAngle = Math.cos(Math.pow(secondSide, 2)
               + Math.pow(thirdSide, 2) - Math.pow(firstSide, 2) / 2 * thirdSide * secondSide);
        List<Double> angles = new ArrayList<>();
        angles.add(firstAngle);
        angles.add(secondAngle);
        angles.add(thirdAngle);
        return angles;
    }
}
