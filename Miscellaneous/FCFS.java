package Miscellaneous;

import java.util.Scanner;

public class FCFS 
{
    static void findWaitingTime(int processes[], int n, int burst_time[], int waiting_time[], int arrival_time[]) 
    { 
        int service_time[] = new int[n]; 
        service_time[0] = 0; 
        waiting_time[0] = 0; 
        for (int i = 1; i < n ; i++) 
        { 
            int wasted=0;
            service_time[i] = service_time[i-1] + burst_time[i-1]; 
            waiting_time[i] = service_time[i] - arrival_time[i]; 
            if (waiting_time[i] < 0) 
            {
                wasted = Math.abs(waiting_time[i]);
                waiting_time[i] = 0; 
            }
            service_time[i] = service_time[i] + wasted;
        } 
    } 

    static void findTurnAroundTime(int processes[], int n, int burst_time[], int waiting_time[], int total_arival_time[]) 
    { 
        for (int i = 0; i < n ; i++) 
        {
            total_arival_time[i] = burst_time[i] + waiting_time[i]; 
        }
    } 

    static void findavgTime(int processes[], int n, int burst_time[], int arrival_time[]) 
    { 
        int waiting_time[] = new int[n], total_arival_time[] = new int[n]; 
        findWaitingTime(processes, n, burst_time, waiting_time, arrival_time); 
        findTurnAroundTime(processes, n, burst_time, waiting_time, total_arival_time); 
        System.out.print("Processes " + " Burst Time " + " Arrival Time "
            + " Waiting Time " + " Turn-Around Time "
            + " Completion Time \n"); 
        int total_waiting_time = 0, total_total_arival_time = 0; 
        for (int i = 0 ; i < n ; i++) 
        { 
            total_waiting_time = total_waiting_time + waiting_time[i]; 
            total_total_arival_time = total_total_arival_time + total_arival_time[i]; 
            int compl_time = total_arival_time[i] + arrival_time[i]; 
            System.out.println(i+1 + "\t\t" + burst_time[i] + "\t\t"
                + arrival_time[i] + "\t\t" + waiting_time[i] + "\t\t "
                + total_arival_time[i] + "\t\t " + compl_time); 
        } 
     
        System.out.print("Average waiting time = " + (float)total_waiting_time / (float)n); 
        System.out.print("\nAverage turn around time = " + (float)total_total_arival_time / (float)n); 
    } 

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of processes");
        int n = sc.nextInt();
        int processes[] = new int[n];
        int burst_time[] = new int[n];
        int arrival_time[] = new int[n];
        for(int i=0;i<n;i++)
        {
            processes[i] = i+1;
            System.out.println("Enter the " + (i+1) +" processes's burst time");
            int x = sc.nextInt();
            burst_time[i] = x;
            System.out.println("Enter the " + (i+1) +" processes's arrival time");
            int y = sc.nextInt();
            arrival_time[i] = y;
        }
        findavgTime(processes, n, burst_time, arrival_time);
        sc.close();
    } 
} 