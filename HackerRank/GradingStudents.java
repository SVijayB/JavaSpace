package HackerRank;
/*Sam is a professor at the university and likes to round each student's grade according to these rules:
If the difference between the grade and the next multiple of 5 is less than 3, 
round grade up to the next multiple of 5.
If the value of  is less than 38, no rounding occurs as the result will still be a failing grade.*/

import java.util.*;
public class GradingStudents
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Students for whom grades are to be normalized : ");
        int n = sc.nextInt();
        int a[] = new int [n];
        System.out.println("Enter the marks of " + n + " students : ");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
            System.out.println("After Rounding off : ");
            RoundOf(a[i]);
            System.out.println();
        }
        sc.close();
    }
    static void RoundOf(int n)
    {
        int s = n%10;
        int t;
        if(5-s<3&&5-s>0&&n>35)
        {
            t = 5-s;
            n = n+t;
        }
        else if(10-s<3&&n>35)
        {
            t = 10-s;
            n = n+t;
        }
        System.out.println(n);
    }
}
