package Basics;
// Write a program to calculate A raised to B using for loop.
import java.util.*;
class power
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,i,p=1;
		System.out.println("Enter the base: ");
		a = sc.nextInt();
		System.out.println("Enter the power: ");
		b = sc.nextInt();
		for(i=1;i<=b;i++)
		{
			p = p*a;
		}
		System.out.println("Answer: " + p);
		sc.close();
	}
}
