package singleton;

public class TestSingletonEnum {

    public static void main(String[] args) {
        ProductName productName1 = ProductName.MILK.getInstance(ProductName.MILK);
        ProductName productName2 = ProductName.MILK.getInstance(ProductName.MILK);

        productName2.setExpression("Milk info has changed");

        System.out.printf(
                "productName1: %s %nproductName2: %s",
                productName1.getExpression(),
                productName2.getExpression());
    }

}
