package estructural.adapter.datacredito;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class DataCreditoResponse {

    private String tipoIdentificacion;
    private String numeroIdentificacion;
    private List<String> reportes;

}
