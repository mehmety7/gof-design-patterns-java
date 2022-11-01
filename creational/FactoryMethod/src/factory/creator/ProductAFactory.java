package factory.creator;

import factory.entity.Product;
import factory.entity.ProductA;

public class ProductAFactory implements ProductFactory {

    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
