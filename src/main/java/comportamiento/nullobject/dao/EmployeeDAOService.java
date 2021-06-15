package comportamiento.nullobject.dao;

import java.util.*;
import comportamiento.nullobject.domain.Address;
import comportamiento.nullobject.domain.Deparment;
import comportamiento.nullobject.domain.Employee;

public class EmployeeDAOService {
    
    private List<Employee> EMPLOYEE_LIST = new ArrayList<>();
    
    public EmployeeDAOService(){
        Employee emp1 = new Employee(1L, "Oscar Blancarte", 
                new Address("Reforma 150 int 20, Mexico D.F."),
                new Deparment("Tesoreria"));
        EMPLOYEE_LIST.add(emp1);
    }
    
    public Employee findEmployeeById(Long id){
        for(Employee emp : EMPLOYEE_LIST){
            if(emp.getId().longValue() == id.longValue()){
                return emp;
            }
        }
        return Employee.NULL_EMPOYEE;
    }
}
