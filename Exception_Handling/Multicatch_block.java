package Exception_Handling;

public class Multicatch_block 
{
    public static void main(String[] args) 
    {
        try
        {
            int a[]=new int[5];
            a[5]=30/0;
            System.out.println("Right after the error is encountered, java skips to the catch block."+ 
            "Hence, next line is not executed in the try block");
            System.out.println(a[10]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    } 
}
