package creacional.builder.filters;

import creacional.builder.domain.Usuario;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FiltrarUsuarioBuilder {

    private List<Usuario> usuarios;

    public static FiltrarUsuarioBuilder builder(){
        return new FiltrarUsuarioBuilder();
    }

    public FiltrarUsuarioBuilder usuarios(List<Usuario> usuarios){
        this.usuarios = usuarios;
        return this;
    }

    public FiltrarUsuarioBuilder blogVisitado(String blog, Integer cantidad){
        this.usuarios = usuarios.stream()
                .filter(usuario -> {
                    if (
                        usuario.getBlogVisitados().containsKey(blog)
                        && usuario.getBlogVisitados().get(blog) >= cantidad
                    )
                        return true;
                    return false;
                }).collect(Collectors.toList());
        return this;
    }

    public FiltrarUsuarioBuilder cursosInscrito(String curso, Integer cantidad){
        this.usuarios = usuarios.stream()
                .filter(usuario -> {
                    if (
                            usuario.getCursosInscrito().containsKey(curso)
                                    && usuario.getCursosInscrito().get(curso) >= cantidad
                    )
                        return true;
                    return false;
                }).collect(Collectors.toList());
        return this;
    }

    public FiltrarUsuarioBuilder forosParticipados(String foros, Integer cantidad){
        this.usuarios = usuarios.stream()
                .filter(usuario -> {
                    if (
                            usuario.getForosParticipados().containsKey(foros)
                                    && usuario.getForosParticipados().get(foros) >= cantidad
                    )
                        return true;
                    return false;
                }).collect(Collectors.toList());
        return this;
    }

    public List<Usuario> build(){
        return usuarios;
    }

}
