package abstractfactory.creator;

public final class ProductFactoryProducer {

    public static final String SALE = "sale";
    public static final String RENT = "rent";

    private ProductFactoryProducer() {}

    public static AbstractProductFactory getProductFactory(String buyingType) {
        if (buyingType.equals(SALE)) {
            return new SaleProductFactory();
        } else if (buyingType.equals(RENT)) {
            return new RentProductFactory();
        } else {
            throw new UnsupportedOperationException();
        }
    }

}
