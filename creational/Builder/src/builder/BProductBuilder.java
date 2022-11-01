package builder;

public class BProductBuilder implements ProductBuilder {

    private Product product;

    public BProductBuilder() {
        product = new Product();
    }

    @Override
    public void id(int id) {
        product.setId(id);
    }

    @Override
    public void name(String name) {
        product.setName(name);
    }

    @Override
    public Product getProduct() {
        return this.product;
    }
}
