package template.model;

public abstract class House {

    public final void buildHouse() {
        System.out.println("Starting new building operation..");
        buildSkeleton();
        buildWalls();
        buildRooms();
        buildWindows();
        System.out.println("It's ready..");
    }

    private void buildSkeleton() {
        System.out.println("add skeleton..");
    }

    protected abstract void buildWalls();
    protected abstract void buildRooms();

    protected void buildWindows(){
        System.out.println("add windows..");
    }


}
