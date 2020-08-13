package OOPS;

public class ArrayOfObjects 
{
    public static void main(String args[])
    {
        Account obj[] = new Account[2] ;
       // The above line exactly creates an array of two reference variables, i.e., obj[0] and obj[1].
       obj[0] = new Account();// creates object and assigns to the reference variable
       obj[1] = new Account();
       
       obj[0].setData(1,2);
       
       obj[1].setData(3,4);
       
       System.out.println("For Array Element 0");
        obj[0].showData();
       
       System.out.println("For Array Element 1");
        obj[1].showData();
    }
}
class Account
{
    int a;
    int b;
    public void setData(int c,int d)
    {
        a=c;
        b=d;
    }
    public void showData()
    {
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);
    }
}