package decorator.decorators;

import decorator.model.Drink;

import static constant.ProductDefinitions.BIGGER_SIZE_COST;

public class BiggerSizeDecorator extends DrinkDecorator {

    public BiggerSizeDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public int getCost() {
        return drink.getCost() + BIGGER_SIZE_COST;
    }

}
