package observable;

import observer.Observer;

public interface Observable {
    void attach(Observer observer);
    void remove(Observer observer);
}
