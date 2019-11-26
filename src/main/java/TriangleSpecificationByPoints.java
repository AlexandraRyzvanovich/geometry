import entity.Point;
import entity.TriangleIdentifiable;

public class TriangleSpecificationByPoints implements TriangleSpecification {

    private double minPoint;
    private double maxPoint;

    @Override
    public boolean specified(TriangleIdentifiable triangle) {
        Point firstPoint = triangle.getFirstPoint();
        return false;
    }
}
