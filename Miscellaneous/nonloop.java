package Miscellaneous;
import java.util.*;
class nonloop
{   
    static int pos = 0;//Intialising the value of pos.
    static int a[] = new int [500];//Creating a static array.
    static void save(int n)
    {
        a[pos] = n;//Basically, inputing the value scanned from recursion into the array.
        pos++;//Incrementing the value to keep adding into the array consecutively.
    }
    static void print(int i)
    {
        if(i<pos)//Specifying condition to end it when you reach the end of the array.
        {
            System.out.println(a[i]);//Printing the array elements.
            print(i+1);//Printing the array consequtively(Recursion).
        }
    }
    static void recursion()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//Scanning elements.
        if(n==2)//Can be any number desired.
        {
            System.out.println("Well played, You guessed the right number.");
            save(n);//Saves the number(2) in the array.
        }
        else
        {
            recursion();//Keep Scanning until the number needed is obtained.
            save(n);//Saves the scanned number into the array.
        }
        sc.close();
    }
    public static void main(String args[])
    {
        recursion();//Calling for the recursion function.
        System.out.println("Printing the read values in reverse : ");
        print(0);//Printing the array(In reverse order).
    }
}