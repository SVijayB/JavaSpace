package Exception_Handling;

import java.util.Scanner;

class ExceededMaximumAmount extends Exception
{
    public ExceededMaximumAmount(String s)
    {
        super(s);
    }
}

public class Balance_addition 
{
    int balance;

    public Balance_addition(int balance)
    {
        this.balance = balance;
    }

    void BalanceCheck() throws ExceededMaximumAmount
    {
        if (balance > 20000) 
        {
            int FixedDeposit = balance - 20000;
            int balance = 20000;
            String output = ("Your account balance is more than 20K now, so creating FD of amount: " + FixedDeposit);
            throw new ExceededMaximumAmount(output);
        }
        else
        {
            System.out.println("Total account balance: " + balance);
        }
    }

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        Balance_addition obj = new Balance_addition(15000);
        System.out.println("Your account balance is : " + obj.balance);
        System.out.println("Please enter the amount to add in your balance: ");
        int add = sc.nextInt();

        obj.balance = obj.balance + add;
        try
        {
            obj.BalanceCheck();
        }
        catch (ExceededMaximumAmount ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}