package bridge;

public abstract class ProductSale {

    protected Cargo cargo;

    public ProductSale(Cargo cargo) {
        this.cargo = cargo;
    }

    abstract public void sale();
}
