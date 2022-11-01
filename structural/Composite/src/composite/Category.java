package composite;

import java.util.List;

public class Category implements Market {
    private String name;
    private List<Product> products;

    public Category(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    @Override
    public String getName() {
        System.out.println("Viewed category: " + name);
        return name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void printProducts() {
        System.out.println("Category " + name + " Products:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
