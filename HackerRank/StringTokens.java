package HackerRank;
/*Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
We define a token to be one or more consecutive English alphabetic letters. 
Then, print the number of tokens, followed by each token on a new line.*/
import java.util.*;
public class StringTokens
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.trim();
        String a[] = s.split("[!,?._'@ ]+",0);
        if(s.length()==1&&s.charAt(0)==' ')
        {
            System.out.println("0");
        }
        else
        {
            System.out.println(a.length);
            for(int i=0;i<a.length;i++)
            {
                System.out.println(a[i]);
            }
        }
        sc.close();
    }
}