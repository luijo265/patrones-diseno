package estructural.bridge;

import estructural.bridge.Score.*;
import estructural.bridge.domain.Usuario;

public class App {

    public static void main(String[] args) {
        App app = new App();
        Usuario usuario = app.cargarUsuario();

        System.out.println("Usuario antes de ganar logro");
        System.out.println(usuario);

        IScoreBridge scoreBridge = new ScoreBridge();
//        ELogros logro = ELogros.ARMADOR;
//        ELogros logro = ELogros.COLERICO;
        ELogros logro = ELogros.DEFENSOR;
        scoreBridge.setScoreUsuario(new ExperienciaUsuario());
        usuario = scoreBridge.sumarPorLogro(usuario, logro);
        scoreBridge.setScoreUsuario(new DineroUsuario());
        usuario = scoreBridge.sumarPorLogro(usuario, logro);

        System.out.println("Usuario obtuvo el logro "+logro.toString());
        System.out.println(usuario);


    }

    public  Usuario cargarUsuario(){
        return Usuario.builder()
                .name("Dayana")
                .experiencia(5000)
                .dinero(3000)
                .build();
    }

}
