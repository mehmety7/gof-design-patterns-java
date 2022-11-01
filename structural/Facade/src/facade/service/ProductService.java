package facade.service;

public class ProductService {

    public Product buildProduct(String color, String size) {
        System.out.println("Product is built..");
        return new Product(color, size);
    }

    class Product {
        String color;
        String size;

        public Product(String color, String size) {
            this.color = color;
            this.size = size;
        }
    }

}
