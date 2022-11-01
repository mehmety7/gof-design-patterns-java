package abstractfactory.entity.sale;

import abstractfactory.entity.Product;

public class SaleProductA implements SaleProduct {

    @Override
    public String getProductName() {
        return Product.ROOT_NAME + ROOT_NAME + "A";
    }
}
