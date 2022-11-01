package builder;

public class ProductDirector {

    private ProductBuilder productBuilder;

    public ProductDirector(ProductBuilder productBuilder) {
        this.productBuilder = productBuilder;
    }

    public void constructProduct(int id, String name) {
        this.productBuilder.id(id);
        this.productBuilder.name(name);
    }

    public Product getProduct() {
        return this.productBuilder.getProduct();
    }
}
