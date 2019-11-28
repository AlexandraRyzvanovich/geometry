package entity;

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
        if (this == o) {
            return true;
        }
        if (o == null){
            return false;
        }
        if (getClass() != o.getClass()){
            return false;
        }
        Side side = (Side) o;
        if(firstSide != side.firstSide){
            return false;
        }
        if(secondSide != side.secondSide){
            return false;
        }
        return thirdSide == side.thirdSide;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (int)(prime * result + firstSide);
        result = (int) (prime * result + secondSide);
        result = (int) (prime * result + thirdSide);
        return result;
    }
}
