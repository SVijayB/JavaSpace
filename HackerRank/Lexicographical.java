package HackerRank;
//Program to find the Lexicographically smallest and largest String.
import java.util.Scanner;
public class Lexicographical
 {
    public static void getSmallestAndLargest(String s, int k) 
    {
        String smallest = s.substring(0, k);
        String largest  = s.substring(0, k);
        for (int i = 0; i <= s.length() - k; i++) 
        {
            String temp = s.substring(i, i + k);
            if (smallest.compareTo(temp) > 0)
            {
                smallest = temp;
            }
            if (largest.compareTo(temp) < 0) 
            {
                largest = temp;
            }
        }
        System.out.println("Lexicographically Smallest : " + smallest);
        System.out.println("Lexicographically Largest : " + largest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.next();
        System.out.println("Enter Length of SubString : ");
        int k = sc.nextInt();
        sc.close();
        getSmallestAndLargest(s, k);
    }
}