package triangleSpecification;

import entity.TriangleIdentifiable;

public interface TriangleSpecification {
    boolean specified(TriangleIdentifiable triangle);
}
