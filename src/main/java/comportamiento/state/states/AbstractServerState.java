package comportamiento.state.states;

import comportamiento.state.Server;

public abstract class AbstractServerState {

    public AbstractServerState() {
    }

    public abstract void handleMessage(
            Server server, String message);

}
