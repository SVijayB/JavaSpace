package Miscellaneous;

// Find the sum of numbers at even position of a given number from right to left and check the sum is perfect square or not. 
import java.util.*;
class EvenPerfectSquare
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,b,c=1,i,sum=0,d=1;
		System.out.print("Enter the number: ");
		n = sc.nextInt();
		sc.close();
		while(n>0)
		{
			b = n%10;
			if(c%2==0)
			{
				sum = sum + b;
			}
			c++;
			n = n/10;
		}
		System.out.println("Sum of even position of number from right to left: " + sum);
		for(i=0;i<=sum;i++)
		{
			if(i*i==sum)
			{
				d=0;
			}
		}
		if(d==0)
		{
			System.out.println("Sum is a perfect Square.");
		}
		else
		{
			System.out.println("Sum is not a perfect Square.");
		}
	}
}
