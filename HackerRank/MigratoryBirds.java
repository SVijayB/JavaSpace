package HackerRank;
import java.util.*;
public class MigratoryBirds 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int birds[] = new int [6];
        for(int i=1;i<6;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[j]==i)
                {
                    birds[i]++;
                }
            }
        }
        int max = birds[1];
        int ans = 0;
        for(int i=2;i<6;i++)
        {
            if(birds[i]>max)
            {
                max = birds[i];
                ans = i;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}