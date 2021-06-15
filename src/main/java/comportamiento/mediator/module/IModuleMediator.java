package comportamiento.mediator.module;

import comportamiento.mediator.module.impl.ModuleMediator;

public interface IModuleMediator {

    static ModuleMediator getInstance() {
        return null;
    }

    void registModule(AbstractModule module);

    Object mediate(ModuleMessage mediateEvent);

}
