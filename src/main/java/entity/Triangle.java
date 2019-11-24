package entity;

import entity.Point;

import java.util.Objects;

public class Triangle {
    private Point firstPoint;
    private Point secondPoint;
    private Point thirdPoint;


    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public Point getThirdPoint() {
        return thirdPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if(o == null){
            return false;
        }
        if(getClass() != o.getClass()){
            return false;
        }
        Triangle triangle = (Triangle) o;
        if(firstPoint != triangle.firstPoint){
            return false;
        }
        if(secondPoint != triangle.secondPoint){
            return false;
        }
        if(thirdPoint != triangle.thirdPoint){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + firstPoint.hashCode();
        result = prime * result + secondPoint.hashCode();
        result = prime * result + thirdPoint.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstPoint=" + firstPoint +
                ", secondPoint=" + secondPoint +
                ", thirdPoint=" + thirdPoint +
                '}';
    }
}
