package visitor.visitor.impl;

import visitor.model.Drink;
import visitor.model.Food;
import visitor.visitor.Visitor;

public class StockVisitor implements Visitor {
    @Override
    public void visit(Drink drink) {
        System.out.printf("%s stock is: %d L%n", drink.getName(), drink.getStockInL());
    }

    @Override
    public void visit(Food food) {
        System.out.printf("%s stock is: %d Kg%n", food.getName(), food.getStockInKg());
    }
}
