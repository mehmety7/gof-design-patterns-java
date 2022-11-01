package facade;

import facade.service.*;

public class BuyProductFacade {

    private final UserService userService;
    private final ProductService productService;
    private final BasketService basketService;
    private final PaymentService paymentService;
    private final CargoService cargoService;

    public BuyProductFacade() {
        this.userService = new UserService();
        this.productService = new ProductService();
        this.basketService = new BasketService();
        this.paymentService = new PaymentService();
        this.cargoService = new CargoService();
    }

    public void buyProduct(String username, String color, String size) {
        userService.login(username);
        basketService.addProduct(productService.buildProduct(color, size));
        paymentService.payTheBasket();
        cargoService.addCargo();
        System.out.println("Buying completed successfully..");
    }

}
