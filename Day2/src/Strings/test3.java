package Strings;

class Employee{
    String e_name ="Masseeha";
    int e_no=101;
    private int e_salary;
    String e_dept="CS";

//setter and getter methods
//setter--used to assign the value to the private data member of the class
public void setData(int sal){
    e_salary=sal;
}
public int getData()
{
    return e_salary;
}
}
public class test3 {

    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.e_name);
        System.out.println(e.e_dept);
        e.setData(2000000);
        System.out.println(e.getData());
    }
}
