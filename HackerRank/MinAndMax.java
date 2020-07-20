package HackerRank;
/*Given five positive integers, find the minimum and maximum values that can be 
calculated by summing exactly four of the five integers. 
Then print the respective minimum and maximum values as a single line of two space-separated long integers.*/
import java.util.*;
public class MinAndMax 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long n = 5,temp;
        long a[] = new long [5];
        System.out.println("Enter 5 numbers : ");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        long min = 0;
        for(int i=0;i<4;i++)
        {
            min = min + a[i];
        }
        long max = 0;
        for(int i=1;i<5;i++)
        {
            max = max + a[i];
        }
        System.out.println("Minimum sum of 4 numbers of the 5 given numbers is : " + min);
        System.out.println("Maximum sum of 4 numbers of the 5 given numbers is : " + max);
        sc.close();
    }
}
