package Exception_Handling;

public class Nested_try2 
{
    public static void main(String args[])
    {
        try
        {
            try
            { 
                System.out.println("going to divide");
                int b =39/0; 
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("caught:"+e);
            }
            catch(ArithmeticException e)
            {
                System.out.println("yes! it has been caught - 1");
            }
            try
            { 
                int a[]=new int[5];
                a[5]=4;
            }
            catch(ArithmeticException e)
            {
                System.out.println("yes! it has been caught - 2");
            }
            System.out.println("normal flow1..");
        }
        catch(Exception e)
        {
            System.out.println("handeled: "+e); // If inner block is unable to handle the exception.
        }
        System.out.println("normal flow2..");
    } 
}
