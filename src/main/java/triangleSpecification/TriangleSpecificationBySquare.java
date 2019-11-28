package triangleSpecification;

import entity.TriangleIdentifiable;
import utils.TriangleCalculator;

public class TriangleSpecificationBySquare implements TriangleSpecification {
    private double minSquare;
    private double maxSquare;
    private TriangleCalculator calculator;

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
