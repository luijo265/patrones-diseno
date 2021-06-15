package comportamiento.nullobject;

import comportamiento.nullobject.dao.EmployeeDAOService;
import comportamiento.nullobject.domain.Employee;

public class NullObjectMain {
    public static void main(String[] args) {
        EmployeeDAOService service = new EmployeeDAOService();
        Employee emp1 = service.findEmployeeById(1L);
        System.out.println(emp1.getAddress().getFullAddress());
        System.out.println(emp1.getDeparment().getName());

        Employee emp2 = service.findEmployeeById(2L);
        System.out.println(emp2.getAddress().getFullAddress());
        System.out.println(emp2.getDeparment().getName());
    }
}