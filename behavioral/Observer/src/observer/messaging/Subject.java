package observer.messaging;

import observer.component.Observer;

public interface Subject {

    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
    void setUpdate(Object obj);

}
