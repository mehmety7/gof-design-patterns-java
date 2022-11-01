package decorator;

import decorator.decorators.BiggerSizeDecorator;
import decorator.decorators.ExtraCreamDecorator;
import decorator.decorators.ExtraSugarDecorator;
import decorator.model.Coffee;
import decorator.model.Drink;
import decorator.model.Tea;

public class TestDecorator {

    public static void main(String[] args) {
        Drink justCoffee = new Coffee(1);
        Drink justTea = new Tea(1);

        Drink teaWithExtraSugar = new ExtraSugarDecorator(justTea);
        Drink bigCoffeeWithExtraCream = new BiggerSizeDecorator(new ExtraCreamDecorator(justCoffee));

        System.out.println(justCoffee.getCost()); // 10
        System.out.println(justTea.getCost()); // 5
        System.out.println(teaWithExtraSugar.getCost()); // 7
        System.out.println(bigCoffeeWithExtraCream.getCost());  // 21

        Drink bigCoffeeWithExtraCreamAndExtraSugar = new ExtraSugarDecorator(bigCoffeeWithExtraCream);

        System.out.println(bigCoffeeWithExtraCreamAndExtraSugar.getCost()); // 23

    }

}
