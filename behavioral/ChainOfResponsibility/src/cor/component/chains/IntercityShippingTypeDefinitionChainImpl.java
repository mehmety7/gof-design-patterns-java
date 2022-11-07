package cor.component.chains;

import cor.model.Shipment;

import java.util.Objects;

public class IntercityShippingTypeDefinitionChainImpl implements ShippingTypeDefinitionChain {

    private ShippingTypeDefinitionChain chain;

    @Override
    public void setNextChain(ShippingTypeDefinitionChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void defineShippingType(Shipment shipment) {
        if (!shipment.getCity().equals("Istanbul")) {
            System.out.println("The shipment's type is delivery to out of town..");
        } else {
            if (Objects.isNull(this.chain)) {
                System.out.println("The shipment's type is normal delivery");
                return;
            }
            this.chain.defineShippingType(shipment);
        }
    }
}
