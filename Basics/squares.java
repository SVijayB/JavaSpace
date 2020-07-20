package Basics;
// Write a program to find squares of numbers from 1 to n.
import java.util.*;
class squares
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,n,i = 1;
		System.out.println("Enter number until which square is to be found: ");
		n = sc.nextInt();
		while(i<=n)
		{
			a = i*i;
			System.out.println(i + "x" + i + "=" +(a));
			i++;
		}
		sc.close();
	}
}
