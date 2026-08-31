package exceptionalhandling;

public class Demo {
    static void CheckAge(int age) throws InvalidAgeException
    {
        if(age<18)
        {
            throw new InvalidAgeException("Age cannot be less than 18");
        }
        else {
            System.out.println("Valid Age");
        }
        }

    public static void main(String[] args) {
        try {
            CheckAge(10);
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
    }
    }
}
