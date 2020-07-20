package Basics;
// Write a program to merge two one-dimensional arrays
import java.util.*;
class merge
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,m,i;
		System.out.print("Enter number of elements in array 1: ");
		n = sc.nextInt();
		int a[] = new int [n];
		System.out.println("Enter " + n + " elements into array 1: ");
		for(i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}		
		System.out.print("Enter number of elements in array 2: ");
		m = sc.nextInt();
		int b[] = new int [m+n];
		int c[] = new int [m+n];
		System.out.println("Enter " + m + " elements into array 1: ");
		for(i=n;i<m+n;i++)
		{
			b[i] = sc.nextInt();
		}
		for(i=0;i<m+n;i++)
		{
			if(i<n)
			{
				c[i] = a[i];
			}
			else
			{
				c[i] = b[i];
			}
		}
		System.out.print("Merged array is: ");
		for(i=0;i<m+n;i++)
		{
			System.out.print(c[i] + " ");
		}
		sc.close();
	}
}
