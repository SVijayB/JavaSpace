package Basics;
import java.util.*;

class fibonacci2
{ 
    static int fib(int n) 
    { 
    if (n <= 1) 
       return n; 
    return fib(n-1) + fib(n-2); 
    } 
       
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers from the fibonacci series do you want to print? ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.println(fib(i) + " ");
        }
        sc.close();
    }
} 