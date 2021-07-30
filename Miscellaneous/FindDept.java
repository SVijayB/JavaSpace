// 1.Mr. Wilson is an examination coordinator in a university. In order to find the number
// of candidates belongs to each department, he need a java program to count the
// register numbers belonging to the given department from the list of mixed register
// numbers.
// Sample Input
// Enter total no of students
// 6
// Enter register numbers
// 19BCD123
// 19BCN234
// 19BEC231
// 19BCD321
// 19BCN212
// 19BCI231
// Enter department code
// BCD
// Sample Output
// 2
// Use the following method prototype to solve the problem.
// class Main {
// public static int findCount(String[] input1, String input2) {
// }}

package Miscellaneous;
import java.util.Scanner;
import java.util.regex.*;

class FindDept {
    public static int findCount(String[] input1, String input2) {
        int count = 0;
        int x = input1.length;
        for (int i=0;i<x;i++)
        {
            if(Pattern.matches(".."+input2+"....", input1[i]))
            {
                count++;
            }
        }
        return count;
    }

    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of registration numbers");
        int n = sc.nextInt();
        String input1[] = new String[n];
        sc.next();
        for(int i=0;i<n;i++)
        {
            input1[i] = sc.nextLine();
        }
        System.out.println("Enter the department name:");
        String input2 = sc.nextLine();
        int result = findCount(input1, input2);
        System.out.println(result);
    }
}
    