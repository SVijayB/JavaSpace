package Packages.pkg2;
public class Project2 
{
    public void validate(int result)
    {
        if(result<=20)
        {
            throw new ArithmeticException("FAILED :'( BETTER LUCK NEXT TIME...");
        }
        else
        {
            System.out.println("EASY PASSED OFF :)");
        }
    }
}