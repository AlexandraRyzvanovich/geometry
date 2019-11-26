import entity.Triangle;
import entity.TriangleIdentifiable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TriangleRepository implements TriangleDataRepository {
    Map<UUID, TriangleIdentifiable> store;

    @Override
    public void addTriangle(TriangleIdentifiable triangle){
        UUID id = UUID.randomUUID();
        store.put(id, triangle);
    }

    @Override
    public void removeTriangle(TriangleIdentifiable triangle){
        store.remove(triangle.getId());
    }

    @Override
    public void updateTriangle(TriangleIdentifiable triangle){
        store.replace(triangle.getId(), triangle);

    }

    @Override
    public List query(TriangleSpecification triangleSpecification) {
        List<Triangle> triangleSpecified = new ArrayList<>();
        for (TriangleIdentifiable triangle : store.values()) {
            if(triangleSpecification.specified(triangle)){
                triangleSpecified.add(triangle);
            }
        }
        return triangleSpecified;
    }
}
