package abstractfactory.creator;

import abstractfactory.entity.Product;

public interface AbstractProductFactory {

    Product getProductInstance(String buyingType);

}
