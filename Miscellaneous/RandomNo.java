package Miscellaneous;

import java.util.*;
class RandomNo 
{
   public static void main(String[] args) 
   {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    System.out.println("How many Random Numbers do you want to print? ");
    int n = sc.nextInt();
    System.out.println("Enter the range in which you want to print random numbers (seperated by spaces): ");
    int min = sc.nextInt();
    int max = sc.nextInt();
    if (min >= max) 
    {
        System.out.println("max must be greater than min");
    }
    else
    {
        System.out.println(n + " Random numbers between " + min + " and " + max + " are : ");
        for (int i = 0; i < n; i++) 
        {
            System.out.println(rand.nextInt((max - min) + 1) + min);
        }
    }
    sc.close(); 
   }
}