package Miscellaneous;
/* Check if the number is Reverse length divisible. 
A number is said to be reverse length divisible if the first i digits of the number is divisible by (l-i+1), 
where l is the number of digits in N and 0 < i <= l. */
import java.util.*;
class RLD
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,c=0,i,d=1,e,f,g=0,h;
        System.out.println("Enter number to check for Reverse Length Divisibility: ");
        n = sc.nextInt();
        e = n;
        sc.close();
        while(n>0)
        {
        	c = c+1;
        	n = n/10;
        }
       
        
        for(i=1;i<c;i++)
        {
            d = d*10;
        }
        
        
        for(i=0;i<=c;i++)
        {
            f = e/d;
            h = f%c;
            if(h!=0)
            {
                g++;
            }
            d = d/10;
            c--;
        }
        

        if(g==0)
        {
            System.out.println("The number is Reverse Length Divisible");
        }
        else
        {
            System.out.println("The number is not Reverse Lenght Divisible");
        }
    }
}
