package adapter.internalapi;

public class InternalPlayerImpl implements InternalPayer {

    @Override
    public String pay(String moneyInDollar) {
        System.out.println("Payment send: " + moneyInDollar + " dollar");
        return moneyInDollar;
    }
}
