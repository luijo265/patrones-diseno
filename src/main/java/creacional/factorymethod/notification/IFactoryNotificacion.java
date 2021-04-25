package creacional.factorymethod.notification;

public interface IFactoryNotificacion {

    INotification getNotificacion(ENotificationType eNotificationType);

}
