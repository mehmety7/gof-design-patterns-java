package prototype.serialization;

import java.io.Serializable;

public class Product implements Serializable {

    private static final long serialVersionUID = -2320813911500888447L;

    public String name;
    public String price;
    public transient int count;
    public transient String category;
    public Item item;

    public Product(String name, String price, String category, Item item, int count) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.item = item;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", count=" + count +
                ", category='" + category + '\'' +
                ", item=" + item +
                '}';
    }
}
