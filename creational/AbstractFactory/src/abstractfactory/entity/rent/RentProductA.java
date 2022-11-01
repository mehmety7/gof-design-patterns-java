package abstractfactory.entity.rent;

import abstractfactory.entity.Product;

public class RentProductA implements RentProduct {

    @Override
    public String getProductName() {
        return Product.ROOT_NAME + ROOT_NAME + "A";
    }
}
