package visitor;

import visitor.model.Drink;
import visitor.model.Food;
import visitor.visitor.impl.StockVisitor;

public class Main {
    public static void main(String[] args) {
        Food food = new Food("apple", 10);
        Drink drink = new Drink("juice", 50);
        StockVisitor stockVisitor = new StockVisitor();
        food.accept(stockVisitor);
        drink.accept(stockVisitor);
    }
}