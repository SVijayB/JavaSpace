package Packages.pkg1;
import java.util.Scanner;

import Packages.pkg2.Project2;

class Project1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter result of student");
        int result = sc.nextInt();
        System.out.println("Result -> " + result);
        Project2 answer = new Project2();
        answer.validate(result);
        sc.close();
    }
}