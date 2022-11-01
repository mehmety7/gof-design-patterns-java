package singleton;

public enum ProductName {

    MILK("This product is a initial milk"),
    TEA("This product is a initial tea");

    private String expression;

    ProductName(String expression) {
        this.expression = expression;
    }

    public ProductName getInstance(ProductName productName) {
        return productName;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
}
