package adapter;

public class PaymentAdapterImpl implements PaymentAdapter {

    private final Double DOLLAR_EURO_RATE = 0.98;

    @Override
    public String getMoney(String moneyInDollar) {
        return exchangeDollarFromEuro(moneyInDollar);
    }

    private String exchangeDollarFromEuro(String moneyInDollar) {
        Double dollar = Double.parseDouble(moneyInDollar);
        return String.valueOf(dollar * DOLLAR_EURO_RATE);
    }
}
