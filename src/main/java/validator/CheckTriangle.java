package validator;

import java.util.List;

@FunctionalInterface
public interface CheckTriangle {
        Boolean isTriangleValid(List<Double> trianglePoints);

}
