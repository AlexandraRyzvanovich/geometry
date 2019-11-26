package entity;

import notifier.Notifier;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;


public class TriangleObservable extends TriangleIdentifiable implements Notifier {
    private List<Observer> observers;

    public TriangleObservable(Point firstPoint, Point secondPoint, Point thirdPoint) {
        super(firstPoint, secondPoint, thirdPoint);
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observers) {

        }


    }
}
