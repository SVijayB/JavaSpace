package HackerRank;

import java.util.Scanner;

public class TicketPriceCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of tickets:");
        int n = sc.nextInt();
        int total = (n*750);
        if((total < 1000) && (n == 3)) 
        {
            total = (total - (total*5)/100);
        }
        else if((total > 2000) && (n == 3))
        {
            total = (total - (total*10)/100);
        }
        System.out.println("TOTAL : " + total);
        int tax = (total*5)/100;
        int result = total - tax;
        System.out.println("TAX : "+tax);
        System.out.println("FINAL AMMOUNT TO BE PAID " + result);
    }
}