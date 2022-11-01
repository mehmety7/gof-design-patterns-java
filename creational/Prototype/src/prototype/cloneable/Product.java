package prototype.cloneable;

public class Product implements Cloneable {

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

    @Override
    public Product clone() {
        Product product;
        try {
            product = (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            product = new Product(this.id, this.brand, this.price, this.item);
        }
        product.item = this.item.clone();
        return product;
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
