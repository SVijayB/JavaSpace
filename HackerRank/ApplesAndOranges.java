package HackerRank;

import java.util.*;
public class ApplesAndOranges 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int apples[] = new int [m];
        int oranges[] = new int [n];
        for (int i=0;i<m;i++)
        {
            apples[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            oranges[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<m;i++)
        {
            int check = apples[i] + a;
            if(check>=s && check <=t)
            {
                sum = sum + 1;
            } 
        }
        System.out.println(sum);
        sum = 0;
        for(int i=0;i<n;i++)
        {
            int check = oranges[i] + b;
            if(check>=s && check <=t)
            {
                sum = sum + 1;
            } 
        }
        System.out.println(sum);
        sc.close();
    }
}