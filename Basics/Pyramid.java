package Basics;
// Write a program to print a pyramid with Squares of numbers from 1-10.
class Pyramid
{
	public static void main(String args[])
	{
	int i,j,k,a=1,d;
        for (i=0; i<5; i++) 
        { 
            for (j=5-i; j>1; j--) 
            { 
                System.out.print("  ");
            } 
            for (k=1; k<=i; k++) 
            {
            	d = a*a;
                System.out.print(d + "  "); 
                a++;
            } 
            System.out.println(); 
        } 
    }
}
