package memento;

public class Main {
    public static void main(String[] args) {
        ShoppingOperation shoppingOperation = new ShoppingOperation();
        shoppingOperation.addItem("banana");
        shoppingOperation.addItem("orange");
        shoppingOperation.saveBasket();
        shoppingOperation.addItem("apple");
        shoppingOperation.addItem("grape");
        shoppingOperation.undoBasket();
    }
}