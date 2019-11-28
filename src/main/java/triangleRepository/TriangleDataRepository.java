package triangleRepository;

import triangleSpecification.TriangleSpecification;
import entity.TriangleIdentifiable;

import java.util.List;

public interface TriangleDataRepository {
    void addTriangle(TriangleIdentifiable triangle);
    void removeTriangle(TriangleIdentifiable triangle);
    void updateTriangle(TriangleIdentifiable triangle);
    List query(TriangleSpecification triangleSpecification);
}
