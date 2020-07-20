package Basics;
// Write a program to find if numbers entered are Odd or Even.
import java.util.*;
class evenandodd
{
	public static void main(String args[])
	{
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		n = sc.nextInt();
		int a[] = new int [n];
		int b[] = new int [n];
		int c[] = new int [n];
		System.out.println("Enter the elements: ");
		for(i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				b[i] = a[i];
			}
			else if(a[i]%2!=0)
			{
				c[i] = a[i];
			}
		}
		System.out.print("Even Numbers Are: ");
		for(i=0;i<n;i++)
		{
			if(b[i]!=0)
			{
				System.out.print(b[i] + " ");
			}
		}
		System.out.println();
		System.out.print("Odd Numbers Are: ");
		for(i=0;i<n;i++)
		{
			if(c[i]!=0)
			{
				System.out.print(c[i] + " ");
			}
		}
		sc.close();
	}
}
