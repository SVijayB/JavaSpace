package HackerRank;
//Two strings A and B are called anagrams if they contain all the same characters in the same frequencies.
//For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
import java.util.*;
public class Anagrams 
{
    static boolean isAnagram(String a, String b) 
    {
        Boolean ans = true;
        a = a.toLowerCase();
        b = b.toLowerCase();
        int al = a.length();
        int bl = b.length();
        if (a == null || b == null || (al!=bl))
        {
            return false;
        }
        for(int i=0;i<al;i++)
        {
            int x = 0;
            int y = 0;
            for(int j=0;j<bl;j++)
            {
                if(a.charAt(i)==a.charAt(j))
                {
                    x++;
                }
                if(a.charAt(i)==b.charAt(j))
                {
                    y++;
                }
            }
            if(x!=y)
            {
                ans = false;
                return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String A : ");
        String a = sc.next();
        System.out.println("Enter String B : ");
        String b = sc.next();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        sc.close();
    }
}