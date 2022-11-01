import flyweight.Product;
import flyweight.ProductFlyweightFactory;
import flyweight.Size;

public class TestFlyweight {

    public static void main(String[] args) {
        Size size = new Size("XL");

        Product product1 = ProductFlyweightFactory.createProduct("product1", size);
        System.out.println(product1);

        Product product2 = ProductFlyweightFactory.createProduct("product2", size);
        System.out.println(product2);
    }
}
