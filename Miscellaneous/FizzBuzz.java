/*
 * Write a short program that prints each number from 1 to 100 on a new line.
 * For each multiple of 3, print "Fizz" instead of the number.
 * For each multiple of 5, print "Buzz" instead of the number.
 * For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
 */

public class FizzBuzz {
	
	public static void main(String[] args) {
		String result = "";
		
		for (int i = 1; i <= 100; i++) {
			result = "";
			
			if (i % 3 == 0) {
				result += "Fizz";
			}
			
			if (i % 5 == 0) {
				result += "Buzz";				
			}
			
			if (result.length() == 0) {
				result = Integer.toString(i);
			}
			
			System.out.println(result);
		}
	}
}