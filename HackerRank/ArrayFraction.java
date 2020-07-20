package HackerRank;
//Given an array of integers, calculate the fractions of its elements that are +ve, -ve, and are zeros. 
//Print the decimal value of each fraction on a new line.
import java.util.*;
public class ArrayFraction 
{
    static void solve(int a[])
    {
        float pos=0,neg=0,zero=0;
        float n = a.length;
        for(int i=0;i<n;i++)
        {
            if(a[i]<0)
            {
                neg++;
            }
            else if(a[i]>0)
            {
                pos++;
            }
            else if(a[i]==0)
            {
                zero++;
            }
        }
        float ans1 = pos/n;
        float ans2 = neg/n;
        float ans3 = zero/n;
        System.out.println("Fraction of positive element present in the array : " + ans1);
        System.out.println("Fraction of negative element present in the array : " + ans2);
        System.out.println("Fraction of zeroes present in the array : " + ans3);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements to be entered : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n + " elements into the array : ");
        for (int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        solve(a);
        sc.close();
    }
}
