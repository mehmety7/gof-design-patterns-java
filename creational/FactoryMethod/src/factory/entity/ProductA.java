package factory.entity;

public class ProductA implements Product {

    @Override
    public String getName() {
        return Product.ROOT_NAME + "A";
    }

}
