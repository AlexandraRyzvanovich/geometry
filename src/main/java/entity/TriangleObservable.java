package entity;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

public class TriangleObservable extends TriangleIdentifiable implements Observable {
    public TriangleObservable(Point firstPoint, Point secondPoint, Point thirdPoint, long id) {
        super(firstPoint, secondPoint, thirdPoint, id);
    }

    @Override
    public void addListener(InvalidationListener listener) {

    }

    @Override
    public void removeListener(InvalidationListener listener) {

    }
}
