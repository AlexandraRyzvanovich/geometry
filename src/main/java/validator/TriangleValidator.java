package validator;

import java.util.List;

@FunctionalInterface
public interface TriangleValidator {
        Boolean isTriangleValid(List<Double> trianglePoints);

}
