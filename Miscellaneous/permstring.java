package Miscellaneous;
//Write a java program to print all the permutations of a given String.
import java.util.*;
class permstring
{
    public static void rec(String a,String b)
    {
        if(a.length()==0)
        {
            System.out.println(b);
        }
        else
        {
            for(int i=0;i<a.length();i++)
            {
                char ch = a.charAt(i);
                String c = a.substring(0, i) +  a.substring(i + 1); 
                rec(c,b+ch);
            }    
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String: ");
        String a = sc.nextLine();
        System.out.println("The various permutations of "+ a + " are : ");
        rec(a,"");
        sc.close();
    }
}