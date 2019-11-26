package TriangleRepository;

import TriangleSpecification.TriangleSpecification;
import entity.TriangleIdentifiable;
import entity.TriangleObservable;

import java.util.List;

public interface TriangleDataRepository {
    void addTriangle(TriangleObservable triangle);
    void removeTriangle(TriangleObservable triangle);
    void updateTriangle(TriangleObservable triangle);
    List query(TriangleSpecification triangleSpecification);
}
