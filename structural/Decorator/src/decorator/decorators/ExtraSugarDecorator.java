package decorator.decorators;

import decorator.model.Drink;

import static constant.ProductDefinitions.EXTRA_SUGAR_COST;

public class ExtraSugarDecorator extends DrinkDecorator {

    public ExtraSugarDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public int getCost() {
        return drink.getCost() + EXTRA_SUGAR_COST;
    }

}
