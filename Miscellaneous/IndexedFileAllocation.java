package Miscellaneous;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexedFileAllocation 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of blocks : ");
        int blockSize = sc.nextInt();
        System.out.print("Enter maximum data block hold by index blocks : ");
        int maxDataBlockSize = sc.nextInt();
        boolean blocks[] = new boolean[blockSize];
        System.out.print("Do you wish to allocate new file ?(Y/N) : ");
        char ans = sc.next().charAt(0);
        while (ans == 'Y' || ans == 'y') 
        {
            System.out.print("Enter index block number : ");
            int idxBlock = sc.nextInt();
            if (blocks[idxBlock] == false) 
            {
                ArrayList<Integer> arr = new ArrayList<Integer>();
                boolean in = true;
                for (int i = 0; i < maxDataBlockSize; i++) 
                {
                    System.out.print("Enter the " + (i + 1) + "data block no. : ");
                    int bn = sc.nextInt();
                    if (bn >= 0 && bn < blocks.length && blocks[bn] == false && bn != idxBlock)
                    {
                        if (arr.contains(bn)) 
                        {
                            in = false;
                            break;
                        }
                        arr.add(bn);
                    } 
                    else if (bn == -1) 
                    {
                        continue;
                    } 
                    else 
                    {
                        in = false;
                        break;
                    }
                }
                if (in) 
                {
                    for (int idx : arr) 
                    {
                        blocks[idx] = true;
                    }
                    blocks[idxBlock] = true;
                    System.out.println("File Allocated Successfully !");
                } 
                else 
                {
                    System.out.println("File Allocation Failed!");
                }
            } 
            else 
            {
                System.out.println("File Allocation Failed !");
            }
            System.out.print("Do you wish to continue ? (Y/N) :");
            ans = sc.next().charAt(0);
            sc.close();
        }
    }
}
