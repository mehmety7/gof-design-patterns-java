package builder;

public interface ProductBuilder {

    void id(int id);
    void name(String name);

    Product getProduct();
}
