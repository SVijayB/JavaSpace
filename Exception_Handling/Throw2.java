package Exception_Handling;

// To continue execution of code after using the throw keyword.
public class Throw2 
{
    static void validate(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("not valid");
        }
        else
        {
            System.out.println("welcome to vote");
        }
    }
    public static void main(String args[])
    {
        try
        {
            try
            {
                validate(13);
            }
            catch(NullPointerException e)
            {
                System.out.println("Thrown error has been caught: "+e); // Since we caught the wrong exception, line wont be executed.
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Thrown error has been caught now: "+e ); // Since correct exception handling, line is executed.
        }
        System.out.println("rest of the code...");
    }
}
