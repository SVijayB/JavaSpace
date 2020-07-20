package Data_Conversion;
// Write a program to convert a decimal number to octal.
import java.util.*;
class decitooctal
{
	public static void main(String args[])
	{
		int a,b,sum=0,i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal number: ");
		a = sc.nextInt();
		while(a>0)
		{
			b = a%8;
			sum = sum + b*i;
			i = i*10;
			a = a/8;
		}
		System.out.println("After conversion: "  + sum);
		sc.close();
	}
}
