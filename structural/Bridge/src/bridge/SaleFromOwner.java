package bridge;

public class SaleFromOwner extends ProductSale {

    public SaleFromOwner(Cargo cargo) {
        super(cargo);
    }

    @Override
    public void sale() {
        System.out.println("Added sale from owner..");
        cargo.addCargo();
    }
}
