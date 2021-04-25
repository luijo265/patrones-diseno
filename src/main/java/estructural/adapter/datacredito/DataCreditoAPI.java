package estructural.adapter.datacredito;

import java.util.List;

public class DataCreditoAPI {

    public DataCreditoResponse getReportesDataCredito(DataCreditoRequest dataCreditoRequest){

        String num = dataCreditoRequest.getNumeroIdentificacion();
        String tipo = dataCreditoRequest.getTipoIdentificacion();

        if (num.equalsIgnoreCase("4127621366") &&
                tipo.equalsIgnoreCase("PAS") ){
            return DataCreditoResponse.builder()
                    .reportes(List.of())
                    .numeroIdentificacion(num)
                    .tipoIdentificacion(tipo)
                    .build();
        }else{
            return DataCreditoResponse.builder()
                    .reportes(List.of("12dm1i2n", "xsaxas22"))
                    .numeroIdentificacion(num)
                    .tipoIdentificacion(tipo)
                    .build();
        }

    }

}
