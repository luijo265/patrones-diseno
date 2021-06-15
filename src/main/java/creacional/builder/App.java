package creacional.builder;

import creacional.builder.domain.Usuario;
import creacional.builder.filters.FiltrarUsuarioBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {


    public static void main(String[] args) {
        App app = new App();
        List<Usuario> usuarios = app.cargarUsuarios();

        System.out.println("Todos los usuarios");
        usuarios.stream().forEach(System.out::println);
        // Nuevo curso de React
        List<Usuario> usuariosReact = FiltrarUsuarioBuilder.builder()
                .usuarios(usuarios)
                .blogVisitado("react", 1)
                .forosParticipados("front", 1)
                .build();

        System.out.println("Todos los usuarios para React");
        if (!usuariosReact.isEmpty())
            usuariosReact.stream().forEach(System.out::println);
        else
            System.out.println("No usuarios que cumplan la regla");

        // Nuevo curso de Laravel
        List<Usuario> usuariosLaravel = FiltrarUsuarioBuilder.builder()
                .usuarios(usuarios)
                .forosParticipados("back", 5)
                .build();

        System.out.println("Todos los usuarios para Laravel");
        if (!usuariosLaravel.isEmpty())
            usuariosLaravel.stream().forEach(System.out::println);
        else
            System.out.println("No usuarios que cumplan la regla");


    }

    public List<Usuario> cargarUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();

        Usuario u1 = new Usuario();
        u1.setId(1);
        Map<String, Integer> blog = new HashMap<String, Integer>();
        blog.put("react", 2);
        u1.setBlogVisitados(blog);
        Map<String, Integer> cursos = new HashMap<String, Integer>();
        cursos.put("vuejs", 3);
        u1.setCursosInscrito(cursos);
        Map<String, Integer> foros = new HashMap<String, Integer>();
        foros.put("front", 3);
        u1.setForosParticipados(foros);

        Usuario u2 = new Usuario();
        u2.setId(1);
        Map<String, Integer> blog2 = new HashMap<String, Integer>();
        blog2.put("react", 0);
        u2.setBlogVisitados(blog2);
        Map<String, Integer> cursos2 = new HashMap<String, Integer>();
        cursos2.put("vuejs", 0);
        u2.setCursosInscrito(cursos2);
        Map<String, Integer> foros2 = new HashMap<String, Integer>();
        foros2.put("front", 0);
        foros2.put("back", 8);
        u2.setForosParticipados(foros2);

        usuarios.add(u1);
        usuarios.add(u2);
        return usuarios;
    }

}

