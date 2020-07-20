package Basics;
// Find the value of Grade pay
import java.util.* ;
class GP
{
	public static void main (String args[])
		{
			double bp,gp;
			int da,hra;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter value of Basic pay: ");
			bp = sc.nextDouble(); 
			System.out.println("Enter value of Dearness Allowance: ");
			da = sc.nextInt();
			System.out.println("Enter value of House Rent Allowance: ");
			hra = sc.nextInt();
			gp = (bp+(bp*(da/100)+bp*(hra/100)));
			System.out.println("The Grade Pay: " + gp);
			sc.close();
		}
}
