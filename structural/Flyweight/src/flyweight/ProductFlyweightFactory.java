package flyweight;

import java.util.HashMap;
import java.util.Map;

public class ProductFlyweightFactory {

    private static final Map<ProductType, Product> productCache = new HashMap<>();

    public static Product createProduct(ProductType productType) {
        return productCache.computeIfAbsent(productType, Product::new);
    }

}
