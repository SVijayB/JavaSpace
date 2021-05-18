package Exception_Handling;

public class Nested_try1 
{
    public static void main(String args[])
    {
        try
        {
            try
            {
                System.out.println("going to divide");
                int a[]=new int[5];
                a[5]=4;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("caught:" + e);
            }
       
            catch(ArithmeticException e)
            {
                System.out.println("yes caught");
            }
       
            System.out.println("normal flow1..");
        }
        catch(Exception e)
        {
            System.out.println("handeled: " + e);
        }
        System.out.println("normal flow2..");
    }
}
