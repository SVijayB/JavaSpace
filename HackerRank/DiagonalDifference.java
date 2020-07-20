package HackerRank;
//Given a square matrix, calculate the absolute difference between the sums of its diagonals.
import java.util.*;
class DiagonalDifference
{
    static void solve(int a[][], int n)
    {
        int left = 0;
        for(int i=0;i<n;i++)
        {
            left = left + a[i][i];
        }
        int right = 0;
        int j=n-1;
        for(int i=0;i<n;i++)
        {
            right = right + a[i][j];
            j--;
        }
        int ans = Math.abs(left-right);
        System.out.println(ans);
    }
    public static void main(String[] args)  
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of rows/coloumns in the square matirx");
        int n = sc.nextInt();
        int a[][] = new int [n][n];
        System.out.println("Enter elements into the matrix: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        solve(a,n);
        sc.close();
    }
}
