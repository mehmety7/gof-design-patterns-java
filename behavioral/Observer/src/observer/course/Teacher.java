package observer.course;

import observer.core.Observer;
import observer.core.Topic;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements Observer {

    List<String> messages = new ArrayList<>();
    Topic topic;


    @Override
    public void updateState() {
        this.messages.add(topic.getUpdate().toString());
        System.out.println("[Student Observer] Got it!");
    }

    @Override
    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
