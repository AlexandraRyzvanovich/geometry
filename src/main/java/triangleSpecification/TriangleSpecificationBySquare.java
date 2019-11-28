package triangleSpecification;

import entity.TriangleIdentifiable;
import utils.TriangleCalculator;

public class TriangleSpecificationBySquare implements TriangleSpecification {
    private final double minSquare;
    private final double maxSquare;
    private final TriangleCalculator calculator;

    public TriangleSpecificationBySquare(double minSquare, double maxSquare) {
        this.minSquare = minSquare;
        this.maxSquare = maxSquare;
        this.calculator = new TriangleCalculator();
    }

    @Override
    public boolean specified(TriangleIdentifiable triangle) {
        double square = calculator.calculateSquare(triangle);

        return square > minSquare && square < maxSquare;
    }
}
