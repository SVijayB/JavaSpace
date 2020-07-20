package HackerRank;
/*You have decided the cake will have one candle for each year of someones total age.
When someone blows out the candles, they’ll only be able to blow out the tallest ones.
Your task is to find out how many candles she can successfully blow out.
For example, if your someone is turning 4 years old, and the cake will have 4 candles of height
4,4,1,3, she will be able to blow out 2 candles successfully, 
since the tallest candles are of height 4 and there are 2 such candles.*/
import java.util.*;
public class BirthdayCandle
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age of the person : ");
        int n = sc.nextInt();
        int a[] = new int [n];
        System.out.println("Enter the height of " + n + " candles : ");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int blow = 0;
        int max = 0;
         for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]==max)
            {
                blow++;
            }
        }
        System.out.println("You can blow " + blow + " candles of height " + max);
        sc.close();
    }
}
