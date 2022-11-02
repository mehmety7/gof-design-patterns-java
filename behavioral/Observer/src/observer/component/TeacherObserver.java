package observer.component;

public class TeacherObserver implements Observer {

    String lastMessage;

    @Override
    public void update(Object obj) {
        this.lastMessage = obj.toString();
        System.out.println("[Teacher Observer] Got it!");
    }
}
