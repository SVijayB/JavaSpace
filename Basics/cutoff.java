package Basics;
// Write a program to calculate the cutoff.
import java.util.*;
class cutoff
{
	public static void main(String args[])
	{
		double cc,m,p,c,co;
		String name, state;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name: ");
		name = sc.next();
		System.out.println("Enter Counselling Code: ");
		cc = sc.nextDouble();
		System.out.println("Enter State: ");
		state = sc.next();
		System.out.println("Enter marks in Maths: ");
		m = sc.nextDouble();
		System.out.println("Enter marks in Physics: ");
		p = sc.nextDouble();
		System.out.println("Enter marks in Chemistry: ");
		c = sc.nextDouble();
		co = (((m+p+c)/300)*100);
		System.out.println("Student Name : " + name);
		System.out.println("Counselling Code : " + cc);
		System.out.println("State : " + state);
		System.out.println("Marks obtained in Maths : " + m);
		System.out.println("Marks obtained in Physics : " + p);
		System.out.println("Marks obtained in Chemistry : " + c);
		System.out.println("Total Cut-off : " + co);
		sc.close();
	}
}
