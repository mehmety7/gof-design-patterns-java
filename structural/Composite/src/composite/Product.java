package composite;

public class Product implements Market{

    private String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        System.out.println("Viewed product: " + name);
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
