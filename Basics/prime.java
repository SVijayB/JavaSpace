package Basics;
// Write a program to print Prime Numbers from 3-100
import java.util.*;
class prime
{
	public static void main(String args[])
	{
		double a = 3,b,i,num,c;
		Scanner sc = new Scanner(System.in);
		while (a>=3 && a<=100)
		{	
			num = a;
			c = num;
			i = a-1;
			while(i>1)
			{
				b = a%i;
				if(b==0)
				{
					c++;
				}
				i--;	
			}
			if(num==c)
			{
				System.out.println(num);
			}
			a++;	
		}
		sc.close();
	}
}
