package creacional.factorymethod.notification;

import creacional.factorymethod.domain.ParametrosNotificacionDTO;

public class NotificationPUSH implements INotification{

    private ParametrosNotificacionDTO parametrosNotificacionDTO;

    @Override
    public void setParametros(ParametrosNotificacionDTO parametrosNotificacionDTO) {
        this.parametrosNotificacionDTO = parametrosNotificacionDTO;
    }

    @Override
    public boolean enviarNotificacion() {
        System.out.println("titulo: "+parametrosNotificacionDTO.getTitulo());
        System.out.println("cuerpo: "+parametrosNotificacionDTO.getCuerpo());
        System.out.println("destinatario: "+getDestinario());
        System.out.println("Enviado por Push");
        return true;
    }

    private String getDestinario(){
        return "cdscasd-casdc-casdc-sadc-adc";
    }
}
