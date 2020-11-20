package OOPS.Examples;

public class Distribution 
{
    int children;
    int sweets;

    public Distribution(int c, int s)
    {
        children = c;
        sweets = s;
    }

    float distribute()
    {
        float result = 0;
        try
        {
            result = sweets/children;
        }
        catch (Exception e) 
        {
            System.out.println("ERROR : Cannot divide by Zero");
            System.exit(0);
        }
        return result;
    }
}

class result
{
    public static void main(String args[])
    {
        Distribution x = new Distribution(50,50);
        System.out.println("Each child gets " + x.distribute() + " sweets.");
        Distribution y = new Distribution(25,50);
        System.out.println("Each child gets " + y.distribute() + " sweets.");
        Distribution z = new Distribution(0,50);
        System.out.println("Each child gets : " + z.distribute() + " sweets.");
    }
}
