package Strings;
class customer{
    int acc_no;
    String c_name;
    private int pin_no;

    public void setData(int pin){
        pin_no=pin;
    }
    public int getData(){
        return pin_no;
    }
}
public class bank {

    public static void main(String[] args) {
        customer c=new customer();
        System.out.println();

    }
}
