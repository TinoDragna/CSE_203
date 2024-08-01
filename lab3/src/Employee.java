public class Employee {
    private String name;
    private String id;
    private String hireDay;

    public Employee(String name, String id, String hireDay) {
        this.name = name;
        this.id = id;
        this.hireDay = hireDay;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", hireDay=" + hireDay + "]";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHireDay() {
        return hireDay;
    }

    public void setHireDay(String hireDay) {
        this.hireDay = hireDay;
    }

    

}
