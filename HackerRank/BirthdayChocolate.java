package HackerRank;

import java.util.Scanner;

class BirthdayChocolate 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bar[] = new int [n];
        for(int i=0;i<n;i++)
        {
            bar[i] = sc.nextInt();
        }
        int possibility = 0;
        int birthday = sc.nextInt();
        int length = sc.nextInt();
        int sum = 0;
        for(int i=0;i<length;i++)
        {
            sum = sum + bar[i];
            if(sum == birthday)
            {
                possibility++;
            }
        }
        for(int i=0;i<bar.length - length;i++)
        {
            sum = sum - bar[i] + bar[i+length];
            if(sum == birthday)
            {
                possibility++;
            }
        }
        System.out.println(possibility);
        sc.close();
    }   
}