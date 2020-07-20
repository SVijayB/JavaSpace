package HackerRank;
import java.util.*;
class DivSumPair
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int match = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i<j && ((arr[i]+arr[j]) % k == 0))
                {
                    match++;
                }
            }
        }
        System.out.println(match);
        sc.close();
    }
}

