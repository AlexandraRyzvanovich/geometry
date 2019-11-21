package utils;

import entity.Point;
import entity.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public Double getPerimeter(Triangle triangle){
        List<Double> allTriangleSides = getSides(triangle);
        double firstSide = allTriangleSides.get(0);
        double secondSide = allTriangleSides.get(1);
        double thirdSide = allTriangleSides.get(2);

        return (firstSide + secondSide + thirdSide);
    }

    public Double getSquare(Triangle triangle){
        double perimeter  = getPerimeter(triangle);
        List<Double> allTriangleSides = getSides(triangle);
        double firstSide = allTriangleSides.get(0);
        double secondSide = allTriangleSides.get(1);
        double thirdSide = allTriangleSides.get(2);

        return Math.pow((perimeter*(perimeter-firstSide)
                *(perimeter-secondSide)*(perimeter-thirdSide)),1.0/2.0);
    }

    public Boolean isRightAngled(){

       return true;
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

    public Boolean isObtuseAngle(){

        return true;
    }

    private List<Double> getSides(Triangle triangle){

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
        listSides.add(firstSide);
        double secondSide = Math.pow(Math.pow((x1-x3),2)+Math.pow((y1-y3),2),1.0/2.0);
        listSides.add(secondSide);
        double thirdSide = Math.pow(Math.pow((x2-x3),2)+Math.pow((y2-y3),2),1.0/2.0);
        listSides.add(thirdSide);

        return listSides;
    }
}
