//Java program to check whether a number is a strong number or not

//strong number ->  number whose sum of factorial of the digits in any number is equal to the given number. 

import java.util.Scanner;
public class strong_number_or_not
{	
	public static void main(String[] args)
	{
		//scanner class declaration
		Scanner sc = new Scanner(System.in);
		//input from user
		System.out.print("Enter a number : ");				
		int number = sc.nextInt();
		int fac,sum = 0;
		int n = number;
		while(n != 0)
		{	
			fac = 1;
			int r = n % 10;
			//calculating factorial of r
			for(int i = r ; i >= 1 ; i--)
			fac = fac * i;
			//storing sum of factorial of all digits of the number
			sum = sum + fac;
			n=n/10;
		}
		//condition for strong number
		if(sum == number)
			System.out.println("Strong Number");//display the result
		else
			System.out.println("Not a Strong Number");
		//closing scanner class(not compulsory, but good practice)
		sc.close();													
	}
}
