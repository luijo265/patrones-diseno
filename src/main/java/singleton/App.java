package singleton;

import singleton.service.GestionarRol;
import singleton.service.AccionEstante;

public class App {

    public static void main(String[] args) {
        AccionEstante accionEstante = new AccionEstante();
        GestionarRol gestionarRol = new GestionarRol();

        accionEstante.moverEstante();
        gestionarRol.cambiarRol();
        accionEstante.moverEstante();

    }

}
