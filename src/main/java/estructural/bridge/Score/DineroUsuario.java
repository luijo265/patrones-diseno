package estructural.bridge.Score;

import estructural.bridge.domain.Usuario;

public class DineroUsuario implements IScoreUsuario{
    @Override
    public Usuario sumarPorLogro(Usuario usuario, ELogros logro) {

        Integer dinero = 0;
        switch (logro){
            case ARMADOR:
                dinero = 10000;
                break;
            case COLERICO:
                dinero = 7000;
                break;
            case DEFENSOR:
                dinero = 25000;
                break;
        }

        usuario.setDinero( usuario.getDinero() + dinero);
        return usuario;
    }
}
