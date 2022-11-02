package observer.messaging;

import observer.component.Observer;

import java.util.ArrayList;
import java.util.List;

public class CourseSubject implements Subject {
    List<Observer> observers = new ArrayList<>();
    Object message;

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(message));
    }

    @Override
    public void setUpdate(Object obj) {
        message = obj;
        System.out.println("[Course Subject] There is new operation: " + message);
        notifyObservers();
    }
}
