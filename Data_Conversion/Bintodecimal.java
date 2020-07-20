package Data_Conversion;
// Write a program to convert a Binary number into a Decimal number
import java.util.*;
class bintodecimal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,s=0,n=1;
		System.out.println("Enter the Binary number to be converted: ");
		a = sc.nextInt();
		while(a>0)
		{
			b = a%10;
			s = s + b*n;
			n = n*2;
			a = a/10;
		}

		System.out.println("After Conversion: " + s);
		sc.close();
	}
}
