package adapter.externalapi;

public class ExternalPlayerImpl implements ExternalPayer {

    @Override
    public void takePayment(String moneyInEuro) {
        System.out.println("Payment received: " + moneyInEuro + " euro");
    }
}
