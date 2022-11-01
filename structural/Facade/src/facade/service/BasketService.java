package facade.service;

import java.util.ArrayList;
import java.util.List;

public class BasketService {

    List<ProductService.Product> products = new ArrayList<>();

    public void addProduct(ProductService.Product product) {
        System.out.println("Product added to basket..");
        products.add(product);
    }

}
