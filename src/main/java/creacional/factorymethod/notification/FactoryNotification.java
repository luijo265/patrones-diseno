package creacional.factorymethod.notification;

public class FactoryNotification implements IFactoryNotificacion{

    @Override
    public INotification getNotificacion(ENotificationType eNotificationType) {
        switch (eNotificationType){
            case SMS:
                return new NotificationSMS();
            case PUSH:
                return new NotificationPUSH();
            default:
                throw new RuntimeException("No existe");
        }
    }

}
