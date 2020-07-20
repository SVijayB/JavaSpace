package Miscellaneous;
//Write a program to check if given number is a pythagorean prime or not. 
//A prime number of the form 4*n + 1 is a Pythagorean prime.
import java.util.*;
class PythagoreanPrimes 
{
    public static void main(String args[] ) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++)
        {
            int a = sc.nextInt();
            solve(a);
        }
        sc.close();
    }
    static void solve(int num)
    {
        boolean flag = false;
        for(int i=2;i<=num/2;++i)
        {
            if(num%i==0)
            {
                flag = true;
                break;
            }
        }
        if(!flag)
        {
            if(num%4==1)
            {
                System.out.println("YES");
            }
        }
        else
        {
            System.out.println("NO");
        }
    }
}