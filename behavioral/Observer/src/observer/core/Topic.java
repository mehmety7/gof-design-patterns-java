package observer.core;

public interface Topic {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

    Object getUpdate();
}
