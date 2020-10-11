
// write a program to find the factorial of a given number(hackerearth problem)


import java.util.Scanner;

public class factorial {

	
  public static void main(String[] args) {
		
    
    // TODO Auto-generated method stub
		
	
  Scanner sc = new Scanner(System.in);
	
  int n = sc.nextInt();
	
  int result = 1;

for (int i = 1; i<= n;i++) {
	
  result *= i;
	
  }

System.out.println(result);	
}

}
