package Basics;
//International cost estimation. 
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);    
        int currency,band,nppl,trvday,dwork,airtrv,usd,inr=1;
        double var;
        System.out.println("Enter the travel Destination : ");
        String trv = sc.next();
        System.out.println("Enter the Employee band : ");
        band = sc.nextInt();
        while(band!=6&&band!=7&&band!=8&&band!=9)
        {
            System.out.println("Entered band value is wrong, please provide the correct one");
            band = sc.nextInt();
        }
        System.out.println("Enter the number of people : ");
        nppl = sc.nextInt();
        System.out.println("Enter the number of days of travelling : ");
        trvday = sc.nextInt();
        System.out.println("Enter the number of days of work : ");
        dwork = sc.nextInt();
        System.out.println("Enter the number of days of air travel : ");
        airtrv = sc.nextInt();
        
        if(band==6)
        {
            var = 1685.17;
        }
        else if(band==7)
        {
            var = 2480.61;
        }
        else if(band==8)
        {
            var = 3224.57;
        }
        else if(band==9)
        {
            var = 4356.75;
        }

    }
}