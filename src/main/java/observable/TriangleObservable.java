package observable;

import entity.Point;
import entity.TriangleIdentifiable;
import registrator.Observer;

import java.util.ArrayList;
import java.util.List;

public class TriangleObservable extends TriangleIdentifiable implements Observable {
    private final List<Observer> observers;

    public TriangleObservable(long id, Point firstPoint, Point secondPoint, Point thirdPoint) {
        super(id, firstPoint, secondPoint, thirdPoint);
        observers = new ArrayList<>();
    }
    
    public void setFirstPoint(Point firstPoint){
        super.setFirstPoint(firstPoint);
        notifyObservers();
    }

    public void setSecondPoint(Point secondPoint){
        super.setSecondPoint(secondPoint);
        notifyObservers();
    }

    public void setThirdPoint(Point thirdPoint){
        super.setThirdPoint(thirdPoint);
        notifyObservers();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    @Override
    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observers.size() > 0) {
            observers.remove(observer);
        }
    }

    private void notifyObservers(){
        for (Observer observer: observers) {
            observer.update(this);
        }
    }
}
