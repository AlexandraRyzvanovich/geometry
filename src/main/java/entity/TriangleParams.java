package entity;

public class TriangleParams {
    TriangleIdentifiable triangle;
    private double perimeter;
    private double square;

    public TriangleParams(TriangleIdentifiable triangle, double perimeter, double square) {
        this.triangle = triangle;
        this.perimeter = perimeter;
        this.square = square;
    }
}
