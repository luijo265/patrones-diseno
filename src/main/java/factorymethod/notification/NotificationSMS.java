package factorymethod.notification;

import factorymethod.domain.ParametrosNotificacionDTO;

public class NotificationSMS implements INotification{

    private ParametrosNotificacionDTO parametrosNotificacionDTO;

    @Override
    public void setParametros(ParametrosNotificacionDTO parametrosNotificacionDTO) {
        this.parametrosNotificacionDTO = parametrosNotificacionDTO;
    }

    @Override
    public boolean enviarNotificacion() {
        System.out.println("cuerpo: "+parametrosNotificacionDTO.getCuerpo());
        System.out.println("destinatario: "+getDestinario());
        System.out.println("Enviado por SMS");
        return true;
    }

    private String getDestinario(){
        return "32054615864";
    }
}
