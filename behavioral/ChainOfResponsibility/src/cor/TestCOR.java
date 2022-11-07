package cor;

import cor.component.ShippingTypeDefiner;
import cor.component.chains.ShippingTypeDefinitionChain;
import cor.model.Shipment;

import java.util.Arrays;
import java.util.List;

public class TestCOR {

    public static void main(String[] args) {

        Shipment dailyShipment = new Shipment(1, "Istanbul", "XYZ");
        Shipment normalShipment = new Shipment(2, "Istanbul");
        Shipment intercityShipment = new Shipment(3, "Ankara");

        List<Shipment> shipments = Arrays.asList(dailyShipment, normalShipment, intercityShipment);

        ShippingTypeDefinitionChain definer = ShippingTypeDefiner.createShippingTypeDefiner();

        for (Shipment shipment : shipments) {
            definer.defineShippingType(shipment);
        }
    }

}
