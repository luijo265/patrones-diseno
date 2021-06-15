package comportamiento.nullobject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Deparment {

    private String name;

    public static final Deparment NULL_DEPARMENT = new Deparment(){
        public String getName(){
            return "NOT DEPARMENT";
        }
    };

}
