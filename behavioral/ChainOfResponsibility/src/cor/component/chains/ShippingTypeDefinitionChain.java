package cor.component.chains;

import cor.model.Shipment;

public interface ShippingTypeDefinitionChain {

    void setNextChain(ShippingTypeDefinitionChain chain);

    void defineShippingType(Shipment shipment);
}
