package visitor.visitor;

import visitor.model.Drink;
import visitor.model.Food;

public interface Visitor {
    void visit(Drink drink);
    void visit(Food food);
}
