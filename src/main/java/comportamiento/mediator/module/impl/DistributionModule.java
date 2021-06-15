package comportamiento.mediator.module.impl;

import comportamiento.mediator.module.AbstractModule;
import comportamiento.mediator.module.ModuleMessage;
import comportamiento.mediator.module.impl.dto.Product;
import comportamiento.mediator.module.impl.dto.Sale;
import comportamiento.mediator.module.impl.dto.SaleOrder;

public class DistributionModule extends AbstractModule {

    public static final String MODULE_NAME = "DISTRIBUTION";
    public static final String OPERATION_SEND_PRODUCTS = "DISTRIBUTION";

    @Override
    public String getModulName() { return MODULE_NAME; }

    @Override
    public Object notifyMessage(ModuleMessage message) {
        switch (message.getMessageType()) {
            case OPERATION_SEND_PRODUCTS:
                return sendProducts(message);
            default:
                throw new RuntimeException("Operation not supported '" +
                        message.getMessageType() + "'");
        }
    }

    private String sendProducts(ModuleMessage message){
        SaleOrder salePayload = (SaleOrder) message.getPayload();

        System.out.println("Enviando los productos: ");
        for (Product product: salePayload.getProductos()) {
            System.out.println("Producto: "+product.getName());
        }
        System.out.println("Con ID: "+ salePayload.getId());
        return salePayload.getId();
    }
}
