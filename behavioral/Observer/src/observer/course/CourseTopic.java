package observer.course;

import observer.core.Observer;
import observer.core.Topic;

import java.util.ArrayList;
import java.util.List;

public class CourseTopic implements Topic {
    List<Observer> observers = new ArrayList<>();
    Object announcement;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        observer.setTopic(this);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        observer.setTopic(null);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::updateState);
    }

    @Override
    public Object getUpdate() {
        return this.announcement;
    }

    public void postAnnouncement(Object obj) {
        this.announcement = obj;
        System.out.println("[Course Topic] There is new announcement: " + announcement);
        notifyObservers();
    }
}
