package TriangleRepository;

import TriangleSpecification.TriangleSpecification;
import entity.Triangle;
import entity.TriangleObservable;

import java.util.*;

public class TriangleRepository implements TriangleDataRepository {
    public Map<UUID, TriangleObservable> store = new HashMap<>();

    @Override
    public void addTriangle(TriangleObservable triangle){
        UUID id = triangle.getId();

        store.put(id, triangle);
    }

    @Override
    public void removeTriangle(TriangleObservable triangle){
        store.remove(triangle.getId());
    }

    @Override
    public void updateTriangle(TriangleObservable triangle){
        store.replace(triangle.getId(), triangle);

    }

    @Override
    public List query(TriangleSpecification triangleSpecification) {
        List<Triangle> triangleSpecified = new ArrayList<>();
        for (TriangleObservable triangle : store.values()) {
            if(triangleSpecification.specified(triangle)){
                triangleSpecified.add(triangle);
            }
        }
        return triangleSpecified;
    }
}
