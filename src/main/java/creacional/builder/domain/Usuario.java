package creacional.builder.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    private Integer id;
    private Map<String, Integer> blogVisitados;
    private Map<String, Integer> cursosInscrito;
    private Map<String, Integer> forosParticipados;

}
