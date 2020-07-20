package Miscellaneous;
/* You are given coordinates(X,Y). Initially, you are at (1,1) and you are required to go to (X,Y)
using the following rules :
If the current position is (A,B), then in the next move, you can only move to (A+B,B) or (A,A+B).
Write a program to check if you can reach (X,Y) using only the described moves.

Input Format : 
    1)The First Line Containts an Integer T that represents the number of test cases
    2)Each of the next T lines contains two space-seperated Integers representing X,Y 
Output Format:
    For each test case, print "Yes" if it is possible for you to reach (X,Y) else print "No", in a seperate line*/
import java.io.*;
public class Game_of_Coordinates {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        System.out.println("Enter the number of coordinates you want to check for : ");
        int T = Integer.parseInt(br.readLine().trim());
        System.out.println("Enter the X and Y Coordinate to be checked for with a single space between the two numbers : ");
        for(int t_i=0; t_i<T; t_i++)
        {
            System.out.println("Enter the " + (t_i+1) + " coordinate : ");
            String[] str = br.readLine().split(" ");
            long x = Long.parseLong(str[0]);
            long y = Long.parseLong(str[1]);

            if (solve(1,1,x,y)) 
            {
                System.out.print("Yes, You can reach this point\n");
            }
            else
            {
                System.out.print("No, You cannot reach this point\n");
            }
            System.out.println();
         }
         wr.close();
         br.close();
    }
    static boolean solve(long sx, long sy, long dx, long dy)
    {    
        if (sx > dx || sy > dy) 
            return false; 
        if (sx == dx && sy == dy) 
            return true;  
        return (solve(sx + sy, sy, dx, dy) || solve(sx, sy + sx, dx, dy)); 
    }
}