package template.model;

public class WoodHouse extends House {

    @Override
    protected void buildWalls() {
        System.out.println("add Wood walls..");
    }
    @Override
    protected void buildRooms() {
        System.out.println("add Wood rooms");
    }
}
