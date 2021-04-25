package estructural.adapter.bankadapter;

public interface IBankAdapter {

    ResponseBankAdapterDTO isUsuarioValido(String tipoIdentificacion, String numIdenficacion);

}
