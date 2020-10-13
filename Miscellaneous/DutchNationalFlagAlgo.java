import java.util.Scanner;

public class count_zero_and_one {
//    Algo to sort 0's 1's and 2's
    public static void sort(int a[],int a_size)
    {
        int lo=0;
        int mid =0;
        int hi=a.length-1;
        int temp;
        while(mid<=hi)
        {
            switch(a[mid])
            {
                case 0:
                {
                    temp=a[lo];
                    a[lo]=a[mid];
                    a[mid]=temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;

                case 2:
                {
                    temp=a[mid];
                    a[mid]=a[hi];
                    a[hi]=temp;
                    hi--;
                    break;
                }
            }
        }
    }

    public static void printArray(int arr[] , int length)
    {
        System.out.println("Elements after sorting");
        for(int i=0;i<length;i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a_length;
        System.out.println("Enter the length of the array");
        a_length = sc.nextInt();
        int[] arr = new int[a_length];
        System.out.println("Enter the elements of the array");
        for (int i=0;i<a_length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sort(arr,a_length);
        printArray(arr,a_length);
    }
}
