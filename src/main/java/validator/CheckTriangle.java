package validator;

import java.util.List;

@FunctionalInterface
public interface CheckTriangle {
    public Boolean isTriangleValid(List<Double> trianglePoints);
}
