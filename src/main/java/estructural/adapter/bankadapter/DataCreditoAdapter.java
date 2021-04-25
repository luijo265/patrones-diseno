package estructural.adapter.bankadapter;

import estructural.adapter.datacredito.DataCreditoAPI;
import estructural.adapter.datacredito.DataCreditoRequest;
import estructural.adapter.datacredito.DataCreditoResponse;

public class DataCreditoAdapter implements IBankAdapter{
    @Override
    public ResponseBankAdapterDTO isUsuarioValido(String tipoIdentificacion, String numIdenficacion) {

        DataCreditoAPI dataCreditoAPI = new DataCreditoAPI();
        DataCreditoRequest dataCreditoRequest = DataCreditoRequest.builder()
                .numeroIdentificacion(numIdenficacion)
                .tipoIdentificacion(tipoIdentificacion)
                .build();
        DataCreditoResponse response = dataCreditoAPI.getReportesDataCredito(dataCreditoRequest);
        return ResponseBankAdapterDTO.builder()
                .usuarioValido(response.getReportes().size() <= 0)
                .build();
    }
}
