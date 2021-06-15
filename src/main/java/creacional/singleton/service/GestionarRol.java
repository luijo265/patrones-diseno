package creacional.singleton.service;

import creacional.singleton.storage.UserStorage;

public class GestionarRol {

    public void cambiarRol(){

        UserStorage user = UserStorage.getInstance();

        user.setRol("Gigante");
        System.out.println("Cambiado el rol de "+user.getNombre());

    }

}
