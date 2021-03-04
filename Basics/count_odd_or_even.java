package Basics;

import java.util.Scanner;

class count_odd_or_even
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number >");
        int num = sc.nextInt();
        int even = 0, odd = 0, sum_of_even = 0, sum_of_odd = 0;
        while(num>0)
        {
            int temp = (num%10);
            switch(temp%2)
            {
                case 0:
                    even++;
                    sum_of_even = sum_of_even + temp;
                    break;
                case 1:
                    odd++;
                    sum_of_odd = sum_of_odd + temp;
                    break;
            }
            num = num/10;
        }
        System.out.println("Number of even numbers -> " + even);
        System.out.println("Sum of all the even numbers -> " + sum_of_even);
        System.out.println("Number of odd numbers -> " + odd);
        System.out.println("Sum of all the odd numbers -> " + sum_of_odd);
        sc.close();
    }
}