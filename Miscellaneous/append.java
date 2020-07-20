package Miscellaneous;

// A simple program to append strings to a series. Made it to easily create lists on python.
import java.util.*;
class append
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String ans = "";
        String str = "";
        while(str!="quit")
        {
            str = sc.nextLine();
            ans = ans + "\"" + str + "\",";
            System.out.println(ans);
        }
        System.out.println(ans);
        sc.close();
    }
}
