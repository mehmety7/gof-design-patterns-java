package decorator.decorators;

import decorator.model.Drink;

import static constant.ProductDefinitions.EXTRA_CREAM_COST;

public class ExtraCreamDecorator extends DrinkDecorator {

    public ExtraCreamDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public int getCost() {
        return drink.getCost() + EXTRA_CREAM_COST;
    }

}
