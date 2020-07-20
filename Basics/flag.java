package Basics;
// Write a program to print a flag pattern with Stars.
class flag
{
	public static void main(String args[])
	{
		int a=7,i,j;
		System.out.println();
		System.out.println();
		for(i=0;i<a;i++)
		{
			for(j=a;j>i;j--)
			{
				System.out.print(" *");
			}
			if(i!=a-1)
			{
				System.out.println("");
			}
		}
		for(i=a+1;i>0;i--)
		{
			for(j=a+1;j>i;j--)
			{
				System.out.print(" *");
			}
			System.out.println("");
		}
		for(i=10;i>0;i--)
		{
			System.out.println(" *");
		}
	}
}
