package Data_Conversion;
// Write a program to check if number has even number 1's in it's binary format or not.
import java.util.*;
class BinaryCheck
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c=0,d=1,e=0,num;
		System.out.println("Enter the Decimal Number: ");
		a = sc.nextInt();
		while(a>0)
		{
			b = a%2;
			c  = c + b*d;
			d = d*10;
			a = a/2;
		}
		System.out.println("Binary number is: " + c);
		num = c;
		while(c>0)
		{
			b = c%10;
			if(b==1)
			{
				e++;
			}
			c = c/10;
		}
		if(e%2==0)
		{
			System.out.println(num + " Has even number of 1's");
		}
		else
		{
			System.out.println(num + " Does not have even number of 1's");
		}
		sc.close();
	}
}
