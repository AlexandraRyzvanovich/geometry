package notifier;

import observer.Observer;

public interface Notifier {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();

}
