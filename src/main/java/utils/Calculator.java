package utils;

import entity.Point;
import entity.Side;
import entity.Triangle;


public class Calculator {

    public Double calculatePerimeter(Triangle triangle){
        Side sides = calculateSides(triangle);
        double firstSide = sides.getFirstSide();
        double secondSide = sides.getSecondSide();
        double thirdSide = sides.getThirdSide();

        return (firstSide + secondSide + thirdSide);
    }

    public Double getSquare(Triangle triangle){
        Side sides = calculateSides(triangle);
        double firstSide = sides.getFirstSide();
        double secondSide = sides.getSecondSide();
        double thirdSide = sides.getThirdSide();
        double perimeter  = calculatePerimeter(triangle);

        return Math.pow((perimeter*(perimeter-firstSide)
                *(perimeter-secondSide)*(perimeter-thirdSide)),1.0/2.0);
    }

    public Boolean isRightAngled(Triangle triangle){ //прямоугольный
        Side sides = calculateSides(triangle);
        double firstSide = sides.getFirstSide();
        double secondSide = sides.getSecondSide();
        double thirdSide = sides.getThirdSide();

        return firstSide*firstSide == secondSide*secondSide+thirdSide*thirdSide ||
                secondSide*secondSide == firstSide*firstSide+thirdSide*thirdSide ||
                thirdSide*thirdSide == secondSide*secondSide+firstSide*firstSide;

    }

    public Boolean isEqualSides(){

        return true;
    }

    public Boolean isEquilateral(){

        return true;
    }

    public Boolean isAcuteAngled(){

        return true;
    }

    public Boolean isObtuseAngle(Triangle triangle ){

        return true;
    }

    private Side calculateSides(Triangle triangle){

        Point firstPoint = triangle.getFirstPoint();
        double x1 = firstPoint.getX();
        double y1 = firstPoint.getY();
        Point secondPoint = triangle.getSecondPoint();
        double x2 = secondPoint.getX();
        double y2 = secondPoint.getY();
        Point thirdPoint = triangle.getThirdPoint();
        double x3 = thirdPoint.getX();
        double y3 = thirdPoint.getY();
        double firstSide = Math.pow(Math.pow((x1-x2),2)+Math.pow((y1-y2),2),1.0/2.0);
        double secondSide = Math.pow(Math.pow((x1-x3),2)+Math.pow((y1-y3),2),1.0/2.0);
        double thirdSide = Math.pow(Math.pow((x2-x3),2)+Math.pow((y2-y3),2),1.0/2.0);
        Side side = new Side(firstSide, secondSide, thirdSide);

        return side;
    }
}
