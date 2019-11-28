package triangleSpecification;

import entity.TriangleIdentifiable;
import utils.TriangleCalculator;

public class TriangleSpecificationByPerimeter  implements TriangleSpecification {
    private double minPerimeter;
    private double maxPerimeter;
    private TriangleCalculator calculator;

    public TriangleSpecificationByPerimeter(double minPerimeter, double maxPerimeter){
        this.minPerimeter = minPerimeter;
        this.maxPerimeter = maxPerimeter;
        this.calculator = new TriangleCalculator();

    }

    @Override
    public boolean specified(TriangleIdentifiable triangle) {
        double perimeter = calculator.calculatePerimeter(triangle);

        return perimeter > minPerimeter && perimeter < maxPerimeter;
    }
}
