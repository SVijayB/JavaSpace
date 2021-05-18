package Miscellaneous;

import java.util.Scanner;

public class RRScheduling 
{ 
    static void findWaitingTime(int processes[], int n, int bt[], int wt[], int q) 
    {
        int x[] = new int[n]; 
        for (int i = 0 ; i < n ; i++) 
            x[i] =  bt[i]; 
       
        int t = 0; 
        while(true) 
        { 
            boolean done = true; 
            for (int i = 0 ; i < n; i++) 
            { 
                if (x[i] > 0) 
                { 
                    done = false;
                    if (x[i] > q) 
                    { 
                        t =t + q; 
                        x[i] -= q; 
                    } 
                    else
                    {
                        t = t + x[i]; 
                        wt[i] = t - bt[i]; 
                        x[i] = 0; 
                    } 
                } 
            } 
            if (done == true) 
              break; 
        } 
    } 
    static void findTurnAroundTime(int processes[], int n, int bt[], int wt[], int tat[]) 
    {
        for (int i = 0; i < n ; i++)
        {
            tat[i] = bt[i] + wt[i]; 
        }
            
    } 
    static void findavgTime(int processes[], int n, int bt[], int quantum) 
    { 
        int wt[] = new int[n], tat[] = new int[n]; 
        int total_wt = 0, total_tat = 0; 
        findWaitingTime(processes, n, bt, wt, quantum); 
        findTurnAroundTime(processes, n, bt, wt, tat); 
        System.out.println("Processes " + " Burst time " + " Waiting time " + " Turn around time"); 
        for (int i=0; i<n; i++) 
        { 
            total_wt = total_wt + wt[i]; 
            total_tat = total_tat + tat[i]; 
            System.out.println(" " + (i+1) + "\t\t" + bt[i] +"\t " + wt[i] +"\t\t " + tat[i]); 
        } 
       
        System.out.println("Average waiting time = " + (float)total_wt / (float)n); 
        System.out.println("Average turn around time = " + (float)total_tat / (float)n); 
    } 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of processes");
        int n = sc.nextInt();
        int processes[] = new int[n];
        int burst_time[] = new int[n];
        for(int i=0;i<n;i++)
        {
            processes[i] = i+1;
            System.out.println("Enter the " + (i+1) +" processes's burst time");
            int x = sc.nextInt();
            burst_time[i] = x;  
        }
        int quantum = 2; 
        findavgTime(processes, n, burst_time, quantum);
        sc.close();
    }
}    