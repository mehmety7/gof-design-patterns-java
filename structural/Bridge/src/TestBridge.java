import bridge.*;

public class TestBridge {

    public static void main(String[] args) {
        ProductSale productSale1 = new SaleFromOwner(new ACargo());
        productSale1.sale();

        ProductSale productSale2 = new SaleFromSeller(new BCargo());
        productSale2.sale();
    }
}
