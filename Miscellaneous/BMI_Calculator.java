// BMI Calculator Program
import java.util.Scanner;
public class Example 
{
   public static void main(String args[]) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Your weight in kilogram: ");
      double weight = sc.nextDouble();
      System.out.print("\nEnter Your height in meters: ");
      double height = sc.nextDouble();
      double BMI = weight / (height * height);
      System.out.print("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");
   }
}