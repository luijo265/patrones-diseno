package creacional.singleton.storage;


import lombok.Getter;
import lombok.Setter;

public class UserStorage {

    @Getter @Setter
    private String nombre;

    @Getter @Setter
    private String apellido;

    @Getter @Setter
    private String rol;

    private static UserStorage userStorage;

    private UserStorage(){
        System.out.println("Consulta en Cache o DB");
        this.rol = "Empleado";
        this.apellido = "Briceño";
        this.nombre = "Luis";
    }

    public static UserStorage getInstance(){
        if (userStorage == null){
            userStorage = new UserStorage();
        }
        return userStorage;
    }

}
