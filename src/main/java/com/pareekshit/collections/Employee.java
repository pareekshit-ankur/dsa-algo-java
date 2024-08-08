package main.java.com.pareekshit.collections;

public class Employee {

    private Integer id;
    private Integer salary;
    private String name;
    private Integer dept;
    private boolean employeeStatus;

    public Employee() {
    }

    public Employee(Integer id, Integer salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public Employee(Integer id, String name, Integer salary, Integer dept) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.dept = dept;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDept() {
        return dept;
    }

    public void setDept(Integer dept) {
        this.dept = dept;
    }
}
