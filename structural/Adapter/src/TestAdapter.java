import adapter.PaymentAdapter;
import adapter.PaymentAdapterImpl;
import adapter.externalapi.ExternalPayer;
import adapter.externalapi.ExternalPlayerImpl;
import adapter.internalapi.InternalPayer;
import adapter.internalapi.InternalPlayerImpl;

public class TestAdapter {

    public static void main(String[] args) {
        InternalPayer internalPayer = new InternalPlayerImpl();
        PaymentAdapter paymentAdapter = new PaymentAdapterImpl();
        ExternalPayer externalPayer = new ExternalPlayerImpl();

        externalPayer.takePayment(paymentAdapter.getMoney(internalPayer.pay("10.15")));
    }
}
