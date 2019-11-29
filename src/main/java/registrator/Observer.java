package registrator;

import observable.TriangleObservable;

public interface Observer<T> {
    void update(TriangleObservable triangle);
}
