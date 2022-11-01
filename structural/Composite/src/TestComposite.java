import composite.Category;
import composite.Market;
import composite.Product;

import java.util.ArrayList;
import java.util.List;

public class TestComposite {

    public static void main(String[] args) {
        Market categoryA = new Category("Category A", new ArrayList<>());
        Market categoryB = new Category("Category B", new ArrayList<>());

        List<Product> products = new ArrayList<>();
        for (char i = 'A'; i < 'D'; i++) {
            products.add(new Product("Product " + i));
        }

        ((Category) categoryA).addProduct(products.get(0));
        ((Category) categoryA).addProduct(products.get(1));
        ((Category) categoryB).addProduct(products.get(2));

        ((Category) categoryA).printProducts();
        ((Category) categoryA).removeProduct(products.get(0));
        ((Category) categoryA).printProducts();
        ((Category) categoryB).printProducts();
    }
}
