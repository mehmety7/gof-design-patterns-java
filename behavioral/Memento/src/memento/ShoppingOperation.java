package memento;

import java.util.ArrayList;
import java.util.List;

public class ShoppingOperation {

    List<String> items = new ArrayList<>();

    Integer state;

    public void addItem(String item) {
        items.add(item);
        System.out.printf("List after new item added: %s%n", String.join(", ", items));
    }

    public void saveBasket() {
        state = items.size() - 1;
        System.out.printf("List saved: %s%n", String.join(", ", items));
    }

    public void undoBasket() {
        items = items.subList(0, state + 1);
        System.out.printf("List after undo: %s%n", String.join(", ", items));
    }

}
