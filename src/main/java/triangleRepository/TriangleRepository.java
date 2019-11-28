package triangleRepository;

import triangleSpecification.TriangleSpecification;
import entity.Triangle;
import entity.TriangleIdentifiable;
import java.util.Comparator;

import java.util.*;

public class TriangleRepository implements TriangleDataRepository {
    public Map<Long, TriangleIdentifiable> store = new HashMap<>();

    @Override
    public void addTriangle(TriangleIdentifiable triangle){
        long id = triangle.getId();
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

    @Override
    public List sorted(Comparator<TriangleIdentifiable> comparator) {
        List<TriangleIdentifiable> triangleList = new ArrayList<>(store.values());
        triangleList.sort(comparator);

        return triangleList;
    }
}
