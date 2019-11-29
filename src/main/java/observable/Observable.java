package observable;

import registrator.Observer;

public interface Observable {
    void attachObserver(Observer observer);
    void removeObserver(Observer observer);
}
