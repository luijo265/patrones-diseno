package comportamiento.memento.impl;

import comportamiento.memento.entity.Employee;

public class EmployeeMemento {
    
    public Employee employee;
    
    public EmployeeMemento(Employee employee){
        this.employee = employee;
    }
    
    public Employee getMemento(){
        return employee;
    }
}