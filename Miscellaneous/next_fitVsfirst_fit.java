package Miscellaneous;

import java.util.Arrays;

class next_fitVsfirst_fit
{ 
    static void firstFit(int blockSize[], int m, int processSize[], int n) 
    { 
 
        int alloc[] = new int[n]; 
        for (int i = 0; i < alloc.length; i++) 
        {
            alloc[i] = -1; 
        }
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < m; j++) 
            { 
                if (blockSize[j] >= processSize[i]) 
                { 
                    alloc[i] = j; 
                    blockSize[j] -= processSize[i]; 
      
                    break; 
                } 
            } 
        } 
      
        System.out.println("\nProcess No.\tProcess Size\tBlock no."); 
        for (int i = 0; i < n; i++) 
        { 
            System.out.print(" " + (i+1) + "\t\t" +  processSize[i] + "\t\t"); 
            if (alloc[i] != -1) 
                System.out.print(alloc[i] + 1); 
            else
                System.out.print("Not Allocated"); 
            System.out.println(); 
        } 
    }

    static void NextFit(int blockSize[], int m, int processSize[], int n) 
    { 
        int alloc[] = new int[n], j = 0; 
        Arrays.fill(alloc, -1); 
        for (int i = 0; i < n; i++) 
        { 
            while (j < m) 
            { 
  
                if (blockSize[j] >= processSize[i]) 
                { 
                    alloc[i] = j; 
                    blockSize[j] -= processSize[i]; 
  
                    break; 
                } 
                j = (j + 1) % m; 
            } 
        } 
  
        System.out.print("\nProcess No.\tProcess Size\tBlock no.\n"); 
        for (int i = 0; i < n; i++) 
        { 
            System.out.print( i + 1 + "\t\t" + processSize[i] + "\t\t"); 
            if (alloc[i] != -1) 
            { 
                System.out.print(alloc[i] + 1); 
            } 
            else 
            { 
                System.out.print("Not Allocated"); 
            } 
            System.out.println(""); 
        } 
    } 
    
    public static void main(String[] args) 
    { 
        int blockSize[] = {5, 10, 20}; 
        int processSize[] = {10, 20, 5}; 
        int m = blockSize.length; 
        int n = processSize.length; 
        
        System.out.println("First Fit :");
        firstFit(blockSize, m, processSize, n);

        int blockSize2[] = {5, 10, 20}; 
        int processSize2[] = {10, 20, 5}; 
        m = blockSize.length; 
        n = processSize.length; 
        System.out.println("\nNext Fit :");
        NextFit(blockSize2, m, processSize2, n);
    } 
} 