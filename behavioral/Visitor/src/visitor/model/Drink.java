package visitor.model;

import visitor.visitor.Visitor;

public class Drink implements BaseModel {

    private String name;
    private Integer stockInL;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Drink(String name, Integer stockInL) {
        this.name = name;
        this.stockInL = stockInL;
    }

    public String getName() {
        return name;
    }

    public Integer getStockInL() {
        return stockInL;
    }
}
