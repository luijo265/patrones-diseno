package comportamiento.memento.entity;

import comportamiento.memento.impl.EmployeeMemento;

public class Employee implements Cloneable{
    private String name;
    private String lastName;
    private String employeeNumber;
    private EmployeeAdditional addtional;

    public Employee(String name, String lastName, String employeeNumber, EmployeeAdditional addtional) {
        this.name = name;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
        this.addtional = addtional;
    }

    public Employee() {
        this.addtional = new EmployeeAdditional();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getPhone() {
        return addtional.getPhone();
    }

    public void setPhone(String phone) {
        this.addtional.setPhone(phone);
    }

    private EmployeeAdditional getAddtional(){
        return addtional;
    }

    private void setAddtional(EmployeeAdditional addtional){
        this.addtional = addtional;
    }

    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }

    public Employee deepClone() throws CloneNotSupportedException {
        Employee employeeState = (Employee)this.clone();
        employeeState.setAddtional(this.addtional.clone());
        return employeeState;
    }
    
    public EmployeeMemento createMemento(){
        try {
            return new EmployeeMemento((Employee)this.deepClone());
        } catch (Exception e) {
            throw new RuntimeException("Error cloning the employee");
        }
    }
    
    public void restoreMemento(EmployeeMemento memento){
        Employee employee = memento.getMemento();
        this.name = employee.name;
        this.lastName = employee.lastName;
        this.employeeNumber = employee.employeeNumber;
        this.addtional = employee.addtional;
    }
}
