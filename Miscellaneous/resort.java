package Miscellaneous;
//A Simple program to understand concepts of OOP
import java.util.*;
class resort 
{
    private static int Rno;
    private static String name;
    private static int charges;
    private static int days;

    public static void main(String args[])
    {
        getInfo();
        double amt = compute();
        dispInfo(amt);
    }
    static void getInfo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll Number: ");
        Rno = sc.nextInt();
        System.out.println("Enter your name: ");
        name = sc.next();
        System.out.println("Enter Charges per day : ");
        charges = sc.nextInt();
        System.out.println("Enter the number of days you are going to stay: ");
        days = sc.nextInt();
        sc.close();
    }
    static double compute()
    {
        double amt = days*charges;
        if(amt>11000)
        {
            amt = days*charges*1.02;
        }
        return amt;
    }
    static void dispInfo(double amt)
    {
        System.out.println("Roll Number : " + Rno);
        System.out.println("Name : " + name);
        System.out.println("Charges : " + charges);
        System.out.println("Days : " + days);
        System.out.println("Amount of money to be paid : " + amt);
    }
}