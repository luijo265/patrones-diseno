package comportamiento.mediator.module;

import comportamiento.mediator.module.impl.ModuleMediator;
import comportamiento.mediator.module.impl.ModuleMediatorProxy;

public abstract class AbstractModule {

    protected IModuleMediator mediator;

    public abstract String getModulName();

    public void activate() {
        mediator = ModuleMediatorProxy.getInstance();
        mediator.registModule(this);
    }

    public abstract Object notifyMessage(ModuleMessage message);
}