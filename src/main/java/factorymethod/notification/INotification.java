package factorymethod.notification;


import factorymethod.domain.ParametrosNotificacionDTO;

public interface INotification {

    void setParametros(ParametrosNotificacionDTO parametrosNotificacionDTO);

    boolean enviarNotificacion();

}
