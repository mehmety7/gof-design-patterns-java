package abstractfactory;

import abstractfactory.creator.AbstractProductFactory;
import abstractfactory.creator.ProductFactoryProducer;
import abstractfactory.entity.Product;

public class TestAbstractFactory {

    public static void main(String[] args) {

        AbstractProductFactory productFactory;
        Product product;

        productFactory = ProductFactoryProducer.getProductFactory("sale");

        product = productFactory.getProductInstance("A");
        System.out.println(product.getProductName());

        product = productFactory.getProductInstance("B");
        System.out.println(product.getProductName());

        productFactory = ProductFactoryProducer.getProductFactory("rent");

        product = productFactory.getProductInstance("A");
        System.out.println(product.getProductName());

        product = productFactory.getProductInstance("B");
        System.out.println(product.getProductName());

    }

}
