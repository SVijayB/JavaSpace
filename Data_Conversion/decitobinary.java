package Data_Conversion;
// Write a program to convert decimal number to binary
import java.util.*;
class decitobinary
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,i,l;
		String r = "";
		String t = "";
		System.out.println("Enter decimal number to be converted: ");
		a = sc.nextInt();
		sc.close();
		while(a>0)
		{
			b = a%2;
			a = a/2;
			t = t + String.valueOf(b);
		}
		l = t.length();
		for(i=l-1;i>=0;i--)
		{
			r = r + t.charAt(i);
		}
		System.out.println("After converstion: " + r);
	}
}
