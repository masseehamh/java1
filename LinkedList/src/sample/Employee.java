package sample;

public class Employee {
    int id;

    public Employee(int id, String name, double salary, String dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    String name;
    Double salary;

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    String dept;
}
