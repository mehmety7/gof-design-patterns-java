package abstractfactory.creator;

import abstractfactory.entity.Product;
import abstractfactory.entity.sale.SaleProductA;
import abstractfactory.entity.sale.SaleProductB;

public class SaleProductFactory implements AbstractProductFactory {

    @Override
    public Product getProductInstance(String productType) {
        return productType.equals("A") ? new SaleProductA() : new SaleProductB();
    }
}
