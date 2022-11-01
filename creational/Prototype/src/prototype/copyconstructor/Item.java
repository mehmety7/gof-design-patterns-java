package prototype.copyconstructor;

public class Item {
    public String expression;

    public Item(String name) {
        this.expression = name;
    }

    public Item(Item item) {
        expression = item.expression;
    }

    @Override
    public String toString() {
        return "Item{" +
                "expression='" + expression + '\'' +
                '}';
    }
}
