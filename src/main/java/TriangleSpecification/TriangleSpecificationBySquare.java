package TriangleSpecification;

import entity.TriangleIdentifiable;
import utils.TriangleCalculator;

public class TriangleSpecificationBySquare implements TriangleSpecification {
    private final double MIN_SQUARE = 10;
    private final double MAX_SQUARE = 100;
    private TriangleCalculator calculator;

    @Override
    public boolean specified(TriangleIdentifiable triangle) {
        calculator = new TriangleCalculator();
        double square = calculator.calculateSquare(triangle);

        return square > MIN_SQUARE && square < MAX_SQUARE;
    }
}
