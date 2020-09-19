package Exception_Handling;

// A program can explicitly throw an exception using the throw statement.
public class Throw 
{
    static void validate(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("not valid");
        }
        else
        {
            System.out.println("You can vote!");
        }
    }
    public static void main(String args[])
    {
        validate(13);
        System.out.println("rest of the code..."); //not executed -> After throw, flow of execution stops.
    } 
}
