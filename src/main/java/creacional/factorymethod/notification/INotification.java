package creacional.factorymethod.notification;


import creacional.factorymethod.domain.ParametrosNotificacionDTO;

public interface INotification {

    void setParametros(ParametrosNotificacionDTO parametrosNotificacionDTO);

    boolean enviarNotificacion();

}
