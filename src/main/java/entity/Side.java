package entity;

import java.util.Objects;

public class Side {
    private final double firstSide;
    private final double secondSide;
    private final double thirdSide;

    public Side(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Side)) return false;
        Side side = (Side) o;
        return Double.compare(side.firstSide, firstSide) == 0 &&
                Double.compare(side.secondSide, secondSide) == 0 &&
                Double.compare(side.thirdSide, thirdSide) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstSide, secondSide, thirdSide);
    }
}
