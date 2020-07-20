package HackerRank;

/*You have a string of lowercase English alphabetic letters. You can perform two types of operations on the string:
Append a lowercase English alphabetic letter to the end of the string. Delete the last character in the string.
Performing this operation on an empty string results in an empty string.
Given an integer,N,and two strings,S and T,
determine whether or not you can convert S to T by performing exactly N of the above operations on S. 
If it's possible, print Yes. Otherwise, print No.*/

import java.util.*;
public class AppendAndDelete 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        String ans = "";
        int n = sc.nextInt();
        int cmn=0,difS,difT;
        for(int i=0;i<t.length();i++)
        {
            if(s.charAt(i)!=t.charAt(i))
            {
                cmn=i;
                break;
            }
        }
        difS = s.length() - cmn; 
        difT = t.length() - cmn;
        if(difS+difT==n)
        {
            ans = "Yes";
        }
        else if(difS+difT< n)
        {
            ans = "Yes";
        }
        else if(s.length()+t.length()<=n)
        {
            ans = "Yes";
        }
        else
        {
            ans = "No";
        }
        if(s.equals(t))
        {
            if(n>=s.length()*2)
            {
                ans = "Yes";
            }
            else
            {
                ans = "No";
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
