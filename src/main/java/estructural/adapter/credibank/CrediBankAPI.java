package estructural.adapter.credibank;

public class CrediBankAPI {

    public boolean isUsuarioValido(CrediBankRequest crediBankRequest){

        // Aquí podría estar la comparación en una DB o llamada de API externa
        if (crediBankRequest.getIdentificacion().equalsIgnoreCase("CI834364"))
            return true;
        else
            return false;

    }

}
