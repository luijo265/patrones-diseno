package estructural.adapter.bankadapter;

import estructural.adapter.credibank.CrediBankAPI;
import estructural.adapter.credibank.CrediBankRequest;

public class CrediBankAdapter implements IBankAdapter{
    @Override
    public ResponseBankAdapterDTO isUsuarioValido(String tipoIdentificacion, String numIdenficacion) {

        CrediBankAPI crediBankAPI = new CrediBankAPI();
        boolean isValido = crediBankAPI.isUsuarioValido(
                CrediBankRequest.builder().identificacion(tipoIdentificacion+numIdenficacion).build()
        );

        return ResponseBankAdapterDTO.builder().usuarioValido(isValido).build();
    }
}
