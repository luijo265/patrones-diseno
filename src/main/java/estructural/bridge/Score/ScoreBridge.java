package estructural.bridge.Score;

import estructural.bridge.domain.Usuario;

public class ScoreBridge implements IScoreBridge{

    private IScoreUsuario scoreUsuario;

    public ScoreBridge(){}

    @Override
    public void setScoreUsuario(IScoreUsuario scoreUsuario) {
        this.scoreUsuario = scoreUsuario;
    }

    @Override
    public Usuario sumarPorLogro(Usuario usuario, ELogros logro) {
        return scoreUsuario.sumarPorLogro(usuario, logro);
    }
}
