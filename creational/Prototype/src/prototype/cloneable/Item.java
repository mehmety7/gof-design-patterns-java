package prototype.cloneable;

public class Item implements Cloneable {
    public String expression;

    public Item(String expression) {
        this.expression = expression;
    }

    @Override
    public Item clone() {
        Item item;
        try {
            item = (Item) super.clone();
        } catch (CloneNotSupportedException e) {
            item = new Item(this.expression);
        }
        return item;
    }

    @Override
    public String toString() {
        return "Item{" +
                "expression='" + expression + '\'' +
                '}';
    }
}
