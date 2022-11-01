package decorator.model;

import static constant.ProductDefinitions.TEA_COST;
import static constant.ProductDefinitions.TEA_NAME;

public class Tea extends Drink{

    public Tea(int portion) {
        super.name = TEA_NAME;
        super.unitPrice = TEA_COST;
        super.portion = portion;
    }

    @Override
    public int getCost() {
        return unitPrice * portion;
    }

}
