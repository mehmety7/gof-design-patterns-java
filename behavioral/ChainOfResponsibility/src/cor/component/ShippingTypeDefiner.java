package cor.component;

import cor.component.chains.DailyShippingTypeDefinitionChainImpl;
import cor.component.chains.IntercityShippingTypeDefinitionChainImpl;
import cor.component.chains.ShippingTypeDefinitionChain;

public class ShippingTypeDefiner {

    private static final ShippingTypeDefinitionChain firstChain = new DailyShippingTypeDefinitionChainImpl();
    private static final ShippingTypeDefinitionChain secondChain = new IntercityShippingTypeDefinitionChainImpl();
    public static ShippingTypeDefinitionChain createShippingTypeDefiner() {
        firstChain.setNextChain(secondChain);
        return firstChain;
    }
}
