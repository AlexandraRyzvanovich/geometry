package triangleSpecification;

import entity.TriangleIdentifiable;

import java.util.UUID;

public class TriangleSpecificationById implements TriangleSpecification {
    private final long id;

    public TriangleSpecificationById(long id) {
        this.id = id;
    }

    @Override
    public boolean specified(TriangleIdentifiable triangle) {
        return triangle.getId() == id;
    }
}
