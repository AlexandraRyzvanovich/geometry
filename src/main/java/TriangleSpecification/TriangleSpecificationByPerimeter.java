package TriangleSpecification;

import com.sun.javafx.css.CalculatedValue;
import entity.TriangleIdentifiable;
import utils.TriangleCalculator;

public class TriangleSpecificationByPerimeter  implements TriangleSpecification {
    private final double MIN_PERIMETER = 1;
    private final double MAX_PERIMETER = 10;
    private TriangleCalculator calculator;

    @Override
    public boolean specified(TriangleIdentifiable triangle) {
        calculator = new TriangleCalculator();
        double perimeter = calculator.calculatePerimeter(triangle);

        return perimeter > MIN_PERIMETER && perimeter < MAX_PERIMETER;
    }
}
