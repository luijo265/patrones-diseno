package estructural.bridge.Score;

import estructural.bridge.domain.Usuario;

public interface IScoreBridge {

    void setScoreUsuario(IScoreUsuario scoreUsuario);
    Usuario sumarPorLogro(Usuario usuario, ELogros logro);

}
