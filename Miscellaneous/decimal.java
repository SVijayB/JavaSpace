package Miscellaneous;

// Write a program to find the sum of numbers before and after decimal point.
import java.util.*;
class decimal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double a,c,b,sum,n=1;
		System.out.println("Enter the number: ");
		a = sc.nextDouble();
		System.out.println("The number given: " + a);
		b = (int)a;
		System.out.println("Integer part: " + b);

        String text = Double.toString(Math.abs(a));
        int i = text.indexOf('.');
        int d = text.length() - i - 1;

		for(int p=0;p!=d;p++)
		{
			n=n*10;
		}

		a = a*n;
		c = (int)a;
		c = c - b*n;
		System.out.println("Decimal part: " + c);
		sum = b + c;
		System.out.println("Sum = " + sum);
		sc.close();
	}
}
