package abstractfactory.creator;

import abstractfactory.entity.Product;
import abstractfactory.entity.rent.RentProductA;
import abstractfactory.entity.rent.RentProductB;

public class RentProductFactory implements AbstractProductFactory {

    @Override
    public Product getProductInstance(String productType) {
        return productType.equals("A") ? new RentProductA() : new RentProductB();
    }
}
