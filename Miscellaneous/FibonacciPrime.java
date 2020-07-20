package Miscellaneous;

// Print prime numbers in Fibonacci Series
class FibonacciPrime
{
	public static void main(String args[])
	{
		int a1=1,a2=1,a3,i,b=0,j;
		System.out.println("2");
		for(i=0;i<=10;i++)
		{
			a3 = a1+a2;
			a1=a2;
			a2=a3;
			for(j=2;j<a3;j++)
			{
				b = a3%j;
				if(b==0)
				{
					break;
				}
			}
			if(b!=0)
			{
				System.out.println(a3);
			}
		}
	}
}
