package factorymethod.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ParametrosNotificacionDTO {

    private String titulo;
    private String cuerpo;
    private String usuario;

}
