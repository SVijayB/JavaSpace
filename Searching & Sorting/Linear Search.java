import java.util.*;

class LinearSearch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        int numbers[] = new int [n];
        
        System.out.println("Enter " + n + " elements");
        for(int i=0;i<n;i++)
        {
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("Enter the number you are searching for : ");
        int num = sc.nextInt();
        boolean result = false;
        for(int i=0;i<n;i++)
        {
            if(numbers[i] == num)
            {
                System.out.println("Element found at " + (i+1) + " position");
                result = true;
                break;
            }
            else
            {
                result = false;
            }
        }
        if(result == false)
        {
            System.out.println("Element not found");
        }
        sc.close();
    }
}
