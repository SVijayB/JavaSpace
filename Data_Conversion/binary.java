package Data_Conversion;
// Write a program to check if given number is binary or not.
import java.util.*;
class binary
{
	public static void main(String args[])
	{
		int a,b,c=0,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked: ");
		a = sc.nextInt();
		d = a;		
		while(a>0)
		{
			b = a%10;
			if(b==0||b==1)
			{
				c = 0;
			}
			else
			{
				c = 5;
				break;
			}
			a = a/10;
		}
		if(c==0||c==1)
		{
			System.out.println(d + " Is a binary number");
		}
		else
		{
			System.out.println(d + " Is not a binary number");
		}
		sc.close();
	}
}
