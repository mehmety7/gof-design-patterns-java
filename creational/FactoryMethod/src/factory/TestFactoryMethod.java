package factory;

import factory.creator.ProductAFactory;
import factory.creator.ProductBFactory;
import factory.creator.ProductFactory;

public class TestFactoryMethod {

    public static void main(String[] args) {
        ProductFactory productFactory;

        productFactory = new ProductAFactory();
        productFactory.display();

        productFactory = new ProductBFactory();
        productFactory.display();
    }

}
