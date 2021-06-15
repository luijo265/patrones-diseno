package comportamiento.memento.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeAdditional implements Cloneable {

    private String phone;

    public EmployeeAdditional clone() throws CloneNotSupportedException {
        return (EmployeeAdditional) super.clone();
    }

}
