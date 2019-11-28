package observer;

import observable.TriangleObservable;

public interface Observer<T> {
    void update(TriangleObservable triangle);
}
