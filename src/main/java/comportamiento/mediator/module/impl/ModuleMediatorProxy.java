package comportamiento.mediator.module.impl;

import comportamiento.mediator.module.AbstractModule;
import comportamiento.mediator.module.IModuleMediator;
import comportamiento.mediator.module.ModuleMessage;

import java.util.HashMap;
import java.util.Map;

public class ModuleMediatorProxy implements IModuleMediator {

    private static ModuleMediator mediator;

    private static ModuleMediatorProxy proxy;

    private static final Map<String, AbstractModule> modules = new HashMap<>();

    private ModuleMediatorProxy() {
    }

    public static synchronized ModuleMediatorProxy getInstance() {
        if (mediator == null) {
            mediator = ModuleMediator.getInstance();
        }
        if (proxy == null)
            proxy = new ModuleMediatorProxy();
        return proxy;
    }

    @Override
    public void registModule(AbstractModule module) { mediator.registModule(module); }

    @Override
    public Object mediate(ModuleMessage mediateEvent) {
        long TInicio, TFin;
        TInicio = System.currentTimeMillis();

        Object result = mediator.mediate(mediateEvent);

        TFin = System.currentTimeMillis();
        System.out.println("TIME-"+mediateEvent.getMessageType()+": " + (TFin - TInicio));
        return result;
    }
}
