package singleton.service;

import singleton.storage.UserStorage;

public class GestionarRol {

    public void cambiarRol(){

        UserStorage user = UserStorage.getInstance();

        user.setRol("Jefe");
        System.out.println("Cambiado el rol de "+user.getNombre());

    }

}
