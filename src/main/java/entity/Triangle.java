package entity;

import entity.Point;

import java.util.Objects;

public class Triangle {
    private Point firstPoint;
    private Point secondPoint;
    private Point thirdPoint;
    private double firstSide;
    private double secondSide;
    private double thirdSide;


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

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return getFirstPoint().equals(triangle.getFirstPoint()) &&
                getSecondPoint().equals(triangle.getSecondPoint()) &&
                getThirdPoint().equals(triangle.getThirdPoint());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstPoint(), getSecondPoint(), getThirdPoint());
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
