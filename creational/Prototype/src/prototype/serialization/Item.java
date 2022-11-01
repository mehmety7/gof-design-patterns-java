package prototype.serialization;

import java.io.Serializable;

public class Item implements Serializable {

    private static final long serialVersionUID = -5764490321901621632L;

    public String info;

    public Item(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Item{" +
                "info='" + info + '\'' +
                '}';
    }
}
