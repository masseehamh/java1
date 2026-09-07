package sample;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Employee> emp1= new ArrayList<>();
        Employee e1= new Employee(101,"Mahesh",200000.0,"Finance");
        Employee e2= new Employee(102,"Suresh",10000.0,"Marketing");
        Employee e3= new Employee(103,"Priyas",1000.0,"Sales");

        emp1.add(e1);
        emp1.add(e2);
        emp1.add(e3);

        for(Employee e:emp1)
        {
            System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getDept());
        }
        //stream
        emp1.stream().filter(k->k.getSalary()>80000.0).forEach(k-> System.out.println(k.getName()));
        emp1.stream().filter(k->k.getName().startsWith("P")).forEach(k-> System.out.println(k.getName()));
    }
}
