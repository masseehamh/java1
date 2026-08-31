package exceptionalhandling;

import java.sql.SQLOutput;

public class Demo2 {
    static void checkPin(int Pin) throws InvalidPinException
    {
        //int originalpin=2001;
        if(Pin==2001)
        {
            System.out.println("VALID PIN");
        }
        else {
            throw new InvalidPinException("Invalid Pin");
        }
    }

    public static void main(String[] args) {
        try{
            checkPin(2020);
        }
        catch(InvalidPinException e){
            System.out.println(e.getMessage());
        }
    }
}
