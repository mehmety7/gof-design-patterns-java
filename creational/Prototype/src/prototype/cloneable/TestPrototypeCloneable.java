package prototype.cloneable;

public class TestPrototypeCloneable {

    public static void main(String[] args) {
        Item item = new Item("Item has created");

        Product product = new Product(1, "Test Brand", 10, item);
        Product deepCopy = product.clone();

        product.item.expression = "Item has changed";

        System.out.println(product.item);
        System.out.println(deepCopy.item);
    }

}
