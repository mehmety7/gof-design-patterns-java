package bridge;

public class SaleFromSeller extends ProductSale {

    public SaleFromSeller(Cargo cargo) {
        super(cargo);
    }

    @Override
    public void sale() {
        System.out.println("Added sale from seller..");
        cargo.addCargo();
    }
}
