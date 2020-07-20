package HackerRank;
/*Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. 
Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.*/
import java.util.*;
public class MilitaryTime 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time in 12-hour Format(hh:mm:ssAM(or)PM)");
        String t = sc.nextLine();
        String hr = "";
        String ans = "";
        for(int i=0;i<2;i++)
        {
            hr = hr + t.charAt(i);
        }
        for(int i=2;i<8;i++)
        {
            ans = ans + t.charAt(i);
        }
        int a = Integer.valueOf(hr);
        
        if(t.charAt(8)=='A'||t.charAt(8)=='a')
        {
            if(a==12)
            {
                a=0;
            }
        }
        else if(t.charAt(8)=='P'||t.charAt(8)=='p')
        {
            a = a + 12;
            if (a==24)
            {
                a=12;
            }
        }
        System.out.print(t + " in 24 hour format is : ");
        if(a<10)
        {
            System.out.print("0"+a+ans);
        }
        else
        {
            System.out.print(+a+ans);
        }
        
        sc.close();
    }
}
