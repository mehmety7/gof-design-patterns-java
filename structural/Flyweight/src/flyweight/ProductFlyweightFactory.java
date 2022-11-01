package flyweight;

import java.util.HashMap;
import java.util.Map;

public class ProductFlyweightFactory {

    private static Map<Size, Product> productCache = new HashMap<>();

    public static Product createProduct(String name, Size size) {
        return productCache.computeIfAbsent(size, newSize -> new Product(name, newSize));
    }

}
