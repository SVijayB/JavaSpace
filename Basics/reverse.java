package Basics;
// Write a program to reverse a String.
import java.util.*;
class reverse
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,l;
		System.out.println("Enter a Number or String to be reversed: ");
		String n = sc.nextLine();
		l = n.length();
		char a[] = n.toCharArray();
		int left=0;
		int right=a.length-1;
		
		
		while(left<right){
		char temp=a[left];
			a[left]=a[right];
			a[right]=temp;
			left++;
			right--;
		
		}
		for(i=0;i<l;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();
		sc.close();
	}
}
