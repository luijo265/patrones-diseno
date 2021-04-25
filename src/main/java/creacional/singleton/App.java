package creacional.singleton;

import creacional.singleton.service.GestionarRol;
import creacional.singleton.service.AccionEstante;

public class App {

    public static void main(String[] args) {
        AccionEstante accionEstante = new AccionEstante();
        GestionarRol gestionarRol = new GestionarRol();

        accionEstante.moverEstante();
        gestionarRol.cambiarRol();
        accionEstante.moverEstante();

    }

}
