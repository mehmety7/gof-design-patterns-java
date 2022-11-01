import facade.BuyProductFacade;

public class TestFacade {
    public static void main(String[] args) {
        BuyProductFacade buyProductFacade = new BuyProductFacade();
        buyProductFacade.buyProduct("customer 1", "red", "M");
    }
}
