package Miscellaneous;

import java.util.*;
class amicable_no
{
    static int x(int n)
    {
        int sum=0,i;
        for(i=1; i<n; i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }         
        }   
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number until which you want the pairs to be printed : ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if((i==x(j)&&j==x(i)&&i!=j))
                {
                    System.out.println(i+" "+j);
                }
            }
        }
        sc.close();
    }
}