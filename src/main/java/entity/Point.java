package entity;

import java.util.Objects;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
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
        Point point = (Point) o;
        if(x != point.x){
            return false;
        }
        if(y != point.y){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (int) (prime * result + x);
        result = (int) (prime * result + y);
        return result;
    }

    @Override
    public String toString() {
        return "Point {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
