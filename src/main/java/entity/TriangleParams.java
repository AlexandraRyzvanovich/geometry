package entity;

import java.util.Objects;

public class TriangleParams {
    private double perimeter;
    private double square;

    public TriangleParams(double perimeter, double square) {
        this.perimeter = perimeter;
        this.square = square;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
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
        TriangleParams params = (TriangleParams) o;
        if(square != params.square){
            return false;
        }
        return perimeter == params.perimeter;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = (int)(prime * result + square);
        result = (int)(prime * result + perimeter);
        return result;
    }
}
