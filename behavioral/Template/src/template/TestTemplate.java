package template;

import template.model.House;
import template.model.StoneHouse;
import template.model.WoodHouse;

public class TestTemplate {

    public static void main(String[] args) {
        House woodHouse = new WoodHouse();
        woodHouse.buildHouse();

        House stoneHouse = new StoneHouse();
        stoneHouse.buildHouse();
    }

}
