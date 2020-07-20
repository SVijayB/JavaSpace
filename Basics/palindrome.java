package Basics;
// Write a program to check if given number is a palindrome or not(Reverse of the number = number).
import java.util.*;
class palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c=0,num;
		System.out.println("Enter the number to be checked: ");
		a = sc.nextInt();
		num = a;
		while(a>0)
		{
			b = a%10;
			c = b + c*10;
			a = a/10;
		}
		System.out.println(c);
		if(c == num)
		{
			System.out.println(num + " Is a Palindromic number");
		}
		else
		{
			System.out.println(num + " Is not a Palindromic number");
		}
		sc.close();
	}
}
