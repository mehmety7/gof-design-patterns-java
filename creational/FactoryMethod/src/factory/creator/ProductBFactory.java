package factory.creator;

import factory.entity.Product;
import factory.entity.ProductB;

public class ProductBFactory implements ProductFactory {

    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
