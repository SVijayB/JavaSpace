package Basics;

import java.util.Scanner;

class count_odd_or_even
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number >");
        int num = sc.nextInt();
        int even = 0, odd = 0;
        while(num>0)
        {
            switch((num%10)%2)
            {
                case 0:
                    even++;
                    break;
                case 1:
                    odd++;
                    break;
            }
            num = num/10;
        }
        System.out.println("Number of even numbers -> " + even);
        System.out.println("Number of odd numbers -> " + odd);
        sc.close();
    }
}