package creacional.factorymethod;

import creacional.factorymethod.domain.ParametrosNotificacionDTO;
import creacional.factorymethod.notification.ENotificationType;
import creacional.factorymethod.notification.FactoryNotification;
import creacional.factorymethod.notification.IFactoryNotificacion;
import creacional.factorymethod.notification.INotification;

public class App {

    public static void main(String[] args) {
        IFactoryNotificacion factory = new FactoryNotification();

        // Enviar mensaje de texto
        ParametrosNotificacionDTO parametrosSMS = ParametrosNotificacionDTO.builder()
                                                    .cuerpo("Hola es un maravilloso día")
                                                    .usuario("Luis")
                                                    .build();
        INotification notificationSMS = factory.getNotificacion(ENotificationType.SMS);
        notificationSMS.setParametros(parametrosSMS);
        notificationSMS.enviarNotificacion();

        // Enviar mensaje de NotificationPush
        ParametrosNotificacionDTO parametrosPush = ParametrosNotificacionDTO.builder()
                .cuerpo("Hola es un maravilloso día")
                .titulo("Buenos días")
                .usuario("Luis")
                .build();
        INotification notificationPush = factory.getNotificacion(ENotificationType.PUSH);
        notificationPush.setParametros(parametrosPush);
        notificationPush.enviarNotificacion();

    }

}
