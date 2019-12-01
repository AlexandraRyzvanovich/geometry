package triangleSpecification;

import entity.TriangleIdentifiable;
import utils.TriangleCalculator;

public class TriangleSpecificationByPerimeter  implements TriangleSpecification {
    private final double minPerimeter;
    private final double maxPerimeter;
    private final TriangleCalculator calculator = new TriangleCalculator();

    public TriangleSpecificationByPerimeter(double minPerimeter, double maxPerimeter){
        this.minPerimeter = minPerimeter;
        this.maxPerimeter = maxPerimeter;
    }

    @Override
    public boolean specified(TriangleIdentifiable triangle) {
        double perimeter = calculator.calculatePerimeter(triangle);

        return perimeter > minPerimeter && perimeter < maxPerimeter;
    }
}
