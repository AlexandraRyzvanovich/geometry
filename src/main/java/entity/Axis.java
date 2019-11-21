package entity;

public enum Axis {
    X_AXIS_MIN(0), X_AXIS_MAX(200), Y_AXIS_MIN(0), Y_AXIS_MAX(200);
    private final double value;
    Axis(double value) {
        this.value = value;

    }
    public Double getValue(){
        return value;
    }
}
