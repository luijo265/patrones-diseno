package singleton.service;

import singleton.storage.UserStorage;

import java.util.Optional;

public class AccionEstante {

    private UserStorage user;

    public AccionEstante(){
        this.user = UserStorage.getInstance();
    }

    private String getMessage(boolean hasPermission){

        return hasPermission
                ? user.getNombre()+" mueve el estante"
                : user.getNombre()+" no puede mover el estante";
    }

    public void moverEstante(){

        Optional.of(user)
                .map(usr -> usr.getRol().equals("Jefe"))
                .map(this::getMessage)
                .ifPresent(System.out::println);

    }

}
