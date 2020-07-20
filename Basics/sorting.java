package Basics;
// Write a program to sort the elements of an array in Ascending order.
import java.util.*;
class sorting
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,i,j,temp;
		System.out.print("How many numbers are to be sorted? ");
		n = sc.nextInt();
		int a[] = new int [n];
		System.out.println("Enter the numbers to be sorted: ");
		for(i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Ascending order: ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i] + " ");
		}
		sc.close();
	}
}
