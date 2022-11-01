package builder;

import java.util.logging.Logger;

public class TestBuilder {

    public static void main(String[] args) {

        Logger logger = Logger.getAnonymousLogger();

        ProductBuilder productBuilder = new AProductBuilder();
        ProductDirector director = new ProductDirector(productBuilder);

        director.constructProduct(5, "test1");
        Product product1 = director.getProduct();

        logger.info(product1.toString());

        productBuilder = new BProductBuilder();
        director = new ProductDirector(productBuilder);

        director.constructProduct(10, "test2");
        Product product2 = director.getProduct();

        logger.info(product2.toString());

    }

}
