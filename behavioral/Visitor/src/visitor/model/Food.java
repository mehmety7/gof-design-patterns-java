package visitor.model;

import visitor.visitor.Visitor;

public class Food implements BaseModel {

    private String name;
    private Integer stockInKg;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Food(String name, Integer stockInKg) {
        this.name = name;
        this.stockInKg = stockInKg;
    }

    public String getName() {
        return name;
    }

    public Integer getStockInKg() {
        return stockInKg;
    }
}
