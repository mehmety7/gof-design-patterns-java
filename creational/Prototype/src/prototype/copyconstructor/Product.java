package prototype.copyconstructor;

public class Product {

    public int id;
    public String brand;
    public int price;
    public Item item;

    public Product(int id, String brand, int price, Item item) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.item = item;
    }

    // Copy constructor
    public Product(Product product) {
        this.id = product.id;
        this.brand = product.brand;
        this.price = product.price;
        this.item = new Item(product.item);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", item=" + item +
                '}';
    }
}
