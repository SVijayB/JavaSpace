package Threads;

import java.util.Scanner;

class Lab9
{  
    synchronized void prime(int n)
    { 
        System.out.println("Prime numbers are : ");
        for (int i = 1; i <= n; i++)         
        {             
            int temp=0;     
            int num=0;  
            for(num = i; num >= 1; num--)
            {
                if(i % num == 0)
                {
                    temp++;
                }
            }
            if (temp == 2)
            {
                System.out.print(i + " ");
            }    
        } 
        System.out.println("\n");
        try
        {  
            Thread.sleep(400);  
        }
        catch(Exception e)
        {
            System.out.println(e);
        }       
    } 
    synchronized void composite(int n)
    { 
        System.out.println("Composite numbers are:");
        for (int i = 1; i <= n; i++)         
        {             
            int temp = 0;   
            int num = 0;  
            for(num = i; num >= 1; num--)
            {
                if(i %num ==0)
                {
                    temp++;
                }
            }
            if (temp > 2)
            { 
                System.out.print(i + " ");
            }    
        }  
        try
        {  
            Thread.sleep(400);  
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
    } 
}

class Main
{  
    public static void main(String args[])
    {  
        Lab9 obj = new Lab9();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dynamic input:");
        int m=sc.nextInt(); 
        System.out.print("\n"); 
        Thread t1=new Thread(new Runnable(){public void run(){obj.prime(m);}}); 
        Thread t2=new Thread(new Runnable(){public void run(){obj.composite(m);}});  
        t1.start();  
        t2.start();  
    }
}
