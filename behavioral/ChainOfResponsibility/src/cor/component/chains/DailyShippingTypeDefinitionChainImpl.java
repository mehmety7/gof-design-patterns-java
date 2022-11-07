package cor.component.chains;

import cor.model.Shipment;

public class DailyShippingTypeDefinitionChainImpl implements ShippingTypeDefinitionChain {

    private ShippingTypeDefinitionChain chain;

    @Override
    public void setNextChain(ShippingTypeDefinitionChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void defineShippingType(Shipment shipment) {
        if (!shipment.getCourier().equals("")) {
            System.out.println("The shipment's type is delivery in the same day..");
        } else {
            this.chain.defineShippingType(shipment);
        }
    }
}
