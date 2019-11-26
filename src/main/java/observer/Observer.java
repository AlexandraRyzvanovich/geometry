package observer;

import entity.TriangleObservable;

public interface Observer {
    void update(TriangleObservable triangle);
}
