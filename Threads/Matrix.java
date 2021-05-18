package Threads;

import java.util.*;
class column extends Thread
{
	int n,arr[][],j;
	List<Integer> l;
	column(int n,int arr[][],int j,List<Integer> l)
	{
		this.n = n;
		this.arr = arr;
		this.j = j;
		this.l = l;
	}
	public void run()
	{
		int sum = 0;
		for(int i = 0; i < n; i++)
		{
			sum += arr[i][j];
		}
		System.out.println("sum of " + j + "th column is " + sum);
		l.add(sum);
	}
}
class Sum extends Thread
{
	int n;
	List<Integer> l;
	int sum = 0;
	Sum(int n, List<Integer> l)
	{
		this.n = n;
		this.l = l;
	}
	public void run()
	{
	    for (int i: l)
	    {
	        sum += i;
	    }
	    //System.out.println(sum);
	}
}
public class Matrix 
{
	static int n;
	static int arr[][];
	public static void main(String args[]) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n for nXn matrix");
		n = sc.nextInt();
		arr = new int[n][n];
		
		List<Integer> l = new ArrayList<>();
		System.out.println("Enter values of matrix");
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.println("Enter value of ("+i+","+j+")");
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < n; i++)
		{
			column c = new column(n,arr,i,l);
			c.start();
			c.join();
		}
		Sum s = new Sum(n,l);
		s.start();
		s.join();
		System.out.println("sum of matrix elements is " + s.sum);
		sc.close();
	}
}