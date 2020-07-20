package Basics;
// Write a program to print multiplication tables of a number A from 1 to N.
import java.util.*;
class tables
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,i,j,b;
		System.out.println("Enter the table till which it is to be calculated: ");
		a = sc.nextInt();
		for(i=1;i<=a;i++)
		{
			for(j=1;j<=10;j++)
			{
				b = i*j;
				System.out.println( i + " X " + j + " = " + b);
			}
		}
		sc.close();
	}
}
