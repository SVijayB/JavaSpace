package OOPS.Examples;
import java.util.*;



public class Shapes {
	
	public int setArea(int Height, int Base) {
		int Area = Height * Base/2;
		return Area;
	}
	public int setArea(int Side) {
		int Area = Side*Side;
		return Area;
	}
	public double setArea(double Pie, int Radius) {
		double Area = Pie*Radius*Radius;
		return Area;
	}
	

}

class Triangle extends Shapes{
	
	int Height;
	int Base;
	void getInputs() {
		 System.out.print("Enter height of the triangle:");
		 Scanner s = new Scanner(System.in);
	     Height = s.nextInt();
	     System.out.print("Enter base of the triangle:");
		 Base = s.nextInt(); 
		 System.out.println("The Area of Triangle is: "+setArea(Height,Base));
		 
	}
	
}

class Square extends Shapes{
	int Side;
	 void getInputs(){
		 System.out.print("\n\nEnter side of the square:");
		 Scanner sc = new Scanner(System.in);
	     Side = sc.nextInt(); 
	     System.out.println("The Area of Square is: "+setArea(Side));
	
	 }
}

class Circle extends Shapes{
	int Radius;
	double Pie = Math.PI;
	void getInputs() {
		System.out.print("\n\nEnter radius of the circle:");
		 Scanner sc1 = new Scanner(System.in);
	     Radius = sc1.nextInt();
	     System.out.println("The Area of Circle is: "+String.format("%.2f",setArea(Pie,Radius)));
	}
}

class Tester{
	
	public static void main(String args[]) {
		Triangle triangle = new Triangle();
		Square square = new Square();
		Circle circle = new Circle();
		
		triangle.getInputs();
		square.getInputs();
		circle.getInputs();
	}
}
	

