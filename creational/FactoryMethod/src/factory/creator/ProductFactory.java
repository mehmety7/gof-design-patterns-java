package factory.creator;

import factory.entity.Product;

// It may be abstract class and has abstract creation method
public interface ProductFactory {

    Product createProduct();

    default void display() {
        Product product = createProduct();
        System.out.println(product.getName());
    }

}
