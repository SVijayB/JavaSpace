package HackerRank;
import java.util.Scanner;

class BreakingRecords
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int score[] = new int [n];
        for (int i=0;i<n;i++)
        {
            score[i] = sc.nextInt();
        }
        int max = score[0];
        int min = score[0];
        int maxbreak = 0, minbreak = 0;
        for(int i=0;i<n;i++)
        {
            if(max>score[i])
            {
                max = score[i];
                maxbreak++;
            }
            if(min<score[i])
            {
                min = score[i];
                minbreak++;
            }
        }
        System.out.println(minbreak + " " + maxbreak);
        sc.close();
    }
}
