package estructural.bridge.Score;

import estructural.bridge.domain.Usuario;

public class ExperienciaUsuario implements IScoreUsuario{
    @Override
    public Usuario sumarPorLogro(Usuario usuario, ELogros logro) {

        Integer experiencia = 0;
        switch (logro){
            case ARMADOR:
                experiencia = 1000;
                break;
            case COLERICO:
                experiencia = 500;
                break;
            case DEFENSOR:
                experiencia = 5000;
                break;
        }

        usuario.setExperiencia( usuario.getExperiencia() + experiencia);
        return usuario;
    }
}
