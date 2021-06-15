package comportamiento.nullobject.domain;

public class Employee {

    public static final Employee NULL_EMPOYEE = new Employee() {

        public Long getId() {
            return 0L;
        }

        public String getName() {
            return "UNKNOW EMPLOYEE";
        }

        public Address getAddress() {
            return Address.NULL_ADDRESS;
        }

        public Deparment getDeparment() {
            return Deparment.NULL_DEPARMENT;
        }
    };

    private Long id;
    private String name;
    private Address address;
    private Deparment deparment;

    public Employee(Long id, String name, Address address, Deparment deparment) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.deparment = deparment;
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Deparment getDeparment() {
        return this.deparment;
    }

    public void setAddress(Deparment deparment) {
        this.deparment = deparment;
    }
}