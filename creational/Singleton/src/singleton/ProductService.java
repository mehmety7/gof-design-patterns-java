package singleton;

import java.util.Objects;

public class ProductService {

    public static ProductService productService;

    private ProductService() {}

    public static ProductService getInstance() {
        if (Objects.isNull(productService)) {
            productService = new ProductService();
        }
        return productService;
    }

    public Product createProduct(String name, String price) {
        return new Product(name, price);
    }
}
