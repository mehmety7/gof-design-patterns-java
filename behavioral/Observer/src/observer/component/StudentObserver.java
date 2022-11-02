package observer.component;

import java.util.ArrayList;
import java.util.List;

public class StudentObserver implements Observer {
    List<String> messages = new ArrayList<>();

    @Override
    public void update(Object obj) {
        this.messages.add(obj.toString());
        System.out.println("[Student Observer] Got it!");
    }

}
