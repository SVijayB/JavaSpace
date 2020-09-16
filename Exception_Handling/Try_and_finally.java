package Exception_Handling;

public class Try_and_finally 
{
    public static void main(String args[])
    {
        int[] myNumbers = {1, 2, 3};
        try
        {
            System.out.println(myNumbers[11]); // error!
        }
        catch(Exception e)
        {
            System.out.println("Don't worry! Remaining portion of the code will be executed...");
            System.out.println("The type of runtime error is:"+e);
        }
        finally
        {
            System.out.println("This is executed from the finally block"); 
        }
        System.out.println("Line executed after exception handling");
    }
}
