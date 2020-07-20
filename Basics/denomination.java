package Basics;
// Write a program to find denomination of amount entered.
import java.util.*;
class denomination
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0;
		System.out.println("Enter the amount: ");
		a = sc.nextInt();
		while(a>=2000)
		{
			b = a/2000;
			a = a%2000;
		}
		System.out.println("Total number of 2000.0 Rupees Notes :" + b  );
		while(a>=500 && a<=2000)
		{
			c = a/500;
			a = a%500;
		}
		System.out.println("Total number of 500.00 Rupees Notes :" + c  );
		while(a>=100 && a<=500)
		{
			d = a/100;
			a = a%100;
		}
		System.out.println("Total number of 100.00 Rupees Notes :" + d  );
		while(a>=50 && a<=100)
		{
			e = a/50;
			a = a%50;
		}
		System.out.println("Total number of 50.000 Rupees Notes :" + e  );
		while(a>=20 && a<=50)
		{
			f = a/20;
			a = a%20;
		}
		System.out.println("Total number of 20.000 Rupees Notes :" + f  );
		while(a>=10 && a<=20)
		{
			g = a/10;
			a = a%10;
		}
		System.out.println("Total number of 10.000 Rupees Notes :" + g  );
		while(a>=5 && a<=10)
		{
			h = a/5;
			a = a%5;
		}
		System.out.println("Total number of 5.0000 Rupees Notes :" + h  );
		while(a>=1 && a<=5)
		{
			i = a/1;
			a = a%1;
		}
		System.out.println("Total number of 1.0000 Rupees Notes :" + i  );
		sc.close();
	}
}
