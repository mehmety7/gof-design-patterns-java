package observer.core;

public interface Observer {

    void updateState();

    void setTopic(Topic topic);
}
