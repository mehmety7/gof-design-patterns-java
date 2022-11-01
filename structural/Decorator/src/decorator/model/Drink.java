package decorator.model;

public abstract class Drink {

    protected String name;
    protected int unitPrice;
    protected int portion;

    public abstract int getCost();
}
