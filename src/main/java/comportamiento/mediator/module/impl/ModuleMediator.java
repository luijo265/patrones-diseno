package comportamiento.mediator.module.impl;

import comportamiento.mediator.module.AbstractModule;
import comportamiento.mediator.module.IModuleMediator;
import comportamiento.mediator.module.ModuleMessage;

import java.util.HashMap;
import java.util.Map;

public class ModuleMediator implements IModuleMediator {

    private static ModuleMediator mediator;

    private static final Map<String, AbstractModule> modules = new HashMap<>();

    private ModuleMediator() {
    }

    public static synchronized ModuleMediator getInstance() {
        if (mediator == null) {
            mediator = new ModuleMediator();
        }
        return mediator;
    }

    @Override
    public void registModule(AbstractModule module) {
        modules.put(module.getModulName(), module);
    }

    @Override
    public Object mediate(ModuleMessage mediateEvent) {
        if (!modules.containsKey(mediateEvent.getTarget())) {
            throw new RuntimeException("The module '"
                    + mediateEvent.getTarget() + "' it's not registered");
        }
        System.out.println("Mediate source > '" + mediateEvent.getSource()
                + "', target > '" + mediateEvent.getTarget() 
                + "', messagetType > '"+mediateEvent.getMessageType()+"'");
        AbstractModule module = modules.get(mediateEvent.getTarget());
        return module.notifyMessage(mediateEvent);
    }
}
