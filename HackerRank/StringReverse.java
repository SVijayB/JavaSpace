package HackerRank;
//Given a string , print Yes if it is a palindrome, print No otherwise.
//A palindrome is a word, number, or other sequence of characters which reads the same backward or forward.
import java.util.*;
class StringReverse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Boolean ans = false;
        System.out.println("Enter String To Be Checked : ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        int n = s.length();
        char a[] = new char[n];
        char str[] = s.toCharArray();
        int j=n-1;
        for(int i=0;i<n;i++)
        {
            a[i] = s.charAt(j);
            j--;
        }
        for(int i=0;i<n;i++)
        {
            if(str[i]==a[i])
            {
                ans = true;
            }
            else
            {
                ans = false;
                break;
            }
        }
        if(ans)
        {
            System.out.println("Given String is a Palindrome");
        }
        else
        {
            System.out.println("Given String is a not Palindrome");
        }
        sc.close();
    }
}