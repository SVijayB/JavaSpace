package HackerRank;

import java.util.*;

class Kangaroo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int v1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v2 = sc.nextInt();
        int k1[] = new int [100000];
        int k2[] = new int [100000];
        int path = x1;
        for(int i=0;i<10000;i++)
        {
            k1[i] = path;
            path = path + v1;
        }
        path = x2;
        for(int i=0;i<10000;i++)
        {
            k2[i] = path;
            path = path + v2;
        }
        Boolean answer = false;
        for(int i=0;i<10000;i++)
        {
            if(k1[i]==k2[i])
            {
                answer = true;
                break;
            }
        }
        if(answer == true)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        sc.close();
    }
}