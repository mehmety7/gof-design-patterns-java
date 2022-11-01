package factory.entity;

public class ProductB implements Product {

    @Override
    public String getName() {
        return Product.ROOT_NAME + "B";
    }

}
