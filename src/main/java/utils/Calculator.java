package utils;

import entity.Point;
import entity.Triangle;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public Double getPerimeter(double firstSide, double secondSide, double thirdSide){

        return (firstSide + secondSide + thirdSide);
    }

    public Double getSquare(double firstSide, double secondSide, double thirdSide){
        double perimeter  = getPerimeter(firstSide, secondSide, thirdSide );

        return Math.pow((perimeter*(perimeter-firstSide)
                *(perimeter-secondSide)*(perimeter-thirdSide)),1.0/2.0);
    }

    public Boolean isRightAngled(double firstSide, double secondSide, double thirdSide){ //прямоугольный

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

    public Triangle getSides(Triangle triangle){

        Point firstPoint = triangle.getFirstPoint();
        double x1 = firstPoint.getX();
        double y1 = firstPoint.getY();
        Point secondPoint = triangle.getSecondPoint();
        double x2 = secondPoint.getX();
        double y2 = secondPoint.getY();
        Point thirdPoint = triangle.getThirdPoint();
        double x3 = thirdPoint.getX();
        double y3 = thirdPoint.getY();
        List<Double> listSides = new ArrayList<>();
        double firstSide = Math.pow(Math.pow((x1-x2),2)+Math.pow((y1-y2),2),1.0/2.0);
        triangle.setFirstSide(firstSide);
        double secondSide = Math.pow(Math.pow((x1-x3),2)+Math.pow((y1-y3),2),1.0/2.0);
        triangle.setFirstSide(secondSide);
        double thirdSide = Math.pow(Math.pow((x2-x3),2)+Math.pow((y2-y3),2),1.0/2.0);
        triangle.setFirstSide(thirdSide);

        return triangle;
    }
}
