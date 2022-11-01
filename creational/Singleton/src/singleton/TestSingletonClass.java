package singleton;

public class TestSingletonClass {

    public static void main(String[] args) {
        ProductService productService1 = ProductService.getInstance();
        ProductService productService2 = ProductService.getInstance();
        ProductService productService3 = ProductService.getInstance();

        System.out.printf(
                "1: %s %n2: %s %n3: %s %n",
                productService1.toString(),
                productService2.toString(),
                productService3.toString());
    }

}
