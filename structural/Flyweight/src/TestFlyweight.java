import flyweight.Product;
import flyweight.ProductFlyweightFactory;
import flyweight.ProductType;

import java.util.Objects;

public class TestFlyweight {

    public static void main(String[] args) {

        Product food1 = ProductFlyweightFactory.createProduct(ProductType.FOOD);
        Product food2 = ProductFlyweightFactory.createProduct(ProductType.FOOD);
        Product drink1 = ProductFlyweightFactory.createProduct(ProductType.DRINK);
        Product drink2 = ProductFlyweightFactory.createProduct(ProductType.DRINK);

        System.out.println("Foods refer to same object: " + Objects.deepEquals(food1, food2) + " / " + food1.toString());
        System.out.println("Drinks refer to same object: " + Objects.deepEquals(drink1, drink2) + " / " + drink1.toString());
        System.out.println("Foods and drinks refer to same object: " + Objects.deepEquals(food1, drink1));

    }
}
