package template.model;

public class StoneHouse extends House {
    @Override
    protected void buildWalls() {
        System.out.println("add Stone walls..");
    }

    @Override
    protected void buildRooms() {
        System.out.println("add Stone rooms..");
    }
}
