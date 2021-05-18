package Basics;

// Write a program to find the average of n numbers.
import java.util.*;

class average {
	public static void main(String args[]) {
		int n, i, sum = 0;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter for how many numbers average is to be found: ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the numbers for which average is to be found: ");
		for (i = 0; i < n; i++) 
		{
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		avg = (double) sum / (double) n;
		System.out.println("Average of given numbers = " + avg);
		sc.close();
	}
}
