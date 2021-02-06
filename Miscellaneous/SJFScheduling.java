package Miscellaneous;

import java.util.ArrayList;
import java.util.Collections; 
import java.util.Scanner;

public class SJFScheduling {
    final static Scanner scanner = new Scanner(System.in);
    static float avgWT = 0, avgTAT = 0;

    public static void main(String[] args) {
        System.out.println("Shortest Job First Job Scheduling");
        System.out.println("=================================");

        System.out.print("Enter the total number of Processes: ");
        int n = scanner.nextInt();

        ArrayList<Process> List = new ArrayList<Process>(n);
        for (int index = 0; index < n; index++) 
        {
            List.add(processInput(index)); 
        }

        Sorting(List);
        calculateCT(List);
        calculateWT(List);
        calculateTAT(List);

        System.out.println("\tName" + " \tAT  " + " \tBT  " + " \tCT  " + " \tWT  " + "\tTAT  ");
        for (Process process : List) 
        {
            Output(process);
            avgWT = avgWT + process.wt;
            avgTAT = avgTAT + process.tat;
        }

        System.out.println("[x] Average WaitingTime = " + avgWT / List.size());
        System.out.println("[x] Average TurnAroundTime = " + avgTAT / List.size());
    }

    public static Process processInput(int index) 
    {
        System.out.println("\nProcess - " + (index + 1));
        Process process = new Process();

        process.ProcessIndex = index;
        System.out.print("Enter the Process name: ");
        process.name = scanner.next();
        System.out.print("Enter the Process Burst Time (BT): ");
        process.BurstTime = scanner.nextInt();
        return process;
    }

    public static void Output(Process obj) 
    {
        System.out.println("\t " + obj.name + "\t\t " + obj.ArrivalTime + "\t\t " + obj.BurstTime + "\t\t " + obj.CompleteTime + "\t\t " + obj.wt + "\t\t " + obj.tat);
    }

    public static void Sorting(ArrayList<Process> List) 
    {
        for (int i = 0; i < List.size(); i++)
            for (int j = i; j < List.size(); j++)
                if (List.get(j).BurstTime < List.get(i).BurstTime)
                    Collections.swap(List, i, j);
    }

    public static void calculateCT(ArrayList<Process> List) 
    {
        if (!List.isEmpty()) 
        {
            List.get(0).CompleteTime = List.get(0).BurstTime;
            for (int i = 0; i < List.size() - 1; i++)
                List.get(i + 1).CompleteTime = List.get(i).CompleteTime + List.get(i + 1).BurstTime;
        }
    }

    public static void calculateWT(ArrayList<Process> List) 
    {
        if (!List.isEmpty()) 
        {
            List.get(0).wt = 0;
            for (int i = 0; i < List.size() - 1; i++)
                List.get(i + 1).wt = List.get(i).CompleteTime - List.get(i + 1).ArrivalTime;
        }
    }

    public static void calculateTAT(ArrayList<Process> List) 
    {
        if (!List.isEmpty())
            for (Process process : List)
                process.tat = process.wt + process.BurstTime;
    }

} 

class Process {
    String name;
    int ProcessIndex, ArrivalTime, BurstTime, CompleteTime, wt, tat;
    Process() {
        this.ProcessIndex = -1;
        this.ArrivalTime = 0;
        this.BurstTime = -1;
        this.CompleteTime = -1;
        this.wt = -1;
        this.tat = -1;
        this.name = "process";
    }
}
