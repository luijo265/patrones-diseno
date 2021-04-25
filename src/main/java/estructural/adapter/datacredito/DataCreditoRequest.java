package estructural.adapter.datacredito;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DataCreditoRequest {

    private String tipoIdentificacion;
    private String numeroIdentificacion;

}
