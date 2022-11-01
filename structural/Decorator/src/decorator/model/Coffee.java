package decorator.model;

import static constant.ProductDefinitions.COFFEE_COST;
import static constant.ProductDefinitions.COFFEE_NAME;

public class Coffee extends Drink{

    public Coffee(int portion) {
        super.name = COFFEE_NAME;
        super.unitPrice = COFFEE_COST;
        super.portion = portion;
    }

    @Override
    public int getCost() {
        return unitPrice * portion;
    }

}
