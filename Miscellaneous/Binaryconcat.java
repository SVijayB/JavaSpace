package Miscellaneous;
/* You are given a number N. Find the decimal value of the number formed by the concatenation of the binary
representation of the first N positive integers.*/

import java.math.*;
import java.util.*;
class Binaryconcat 
{
    public static void concat(BigInteger n)
	{
		Queue<String> q = new ArrayDeque<>();
		q.add("1");
		BigInteger i = BigInteger.valueOf(1);
        String s = "";
		while (i.compareTo(n) < 0 || i.compareTo(n) == 0)
		{
			q.add(q.peek() + "0");
			q.add(q.peek() + "1");
            s = s+q.poll();
            BigInteger ran = BigInteger.valueOf(1);
            i = i.add(ran);
        }
        BigInteger a = new BigInteger(s);  
        BigInteger temp = BigInteger.valueOf(0); 
        BigInteger b;
        BigInteger x = BigInteger.valueOf(0);
        BigInteger k = BigInteger.valueOf(1);
        BigInteger temp1 = BigInteger.valueOf(10);
        BigInteger g;
        BigInteger temp2 = BigInteger.valueOf(2);
        while(a.compareTo(temp) > 0)
		{
            b = a.remainder(temp1);
            g = b.multiply(k);
			x = x.add(g);
			k = k.multiply(temp2);
			a = a.divide(temp1);
		}
        System.out.println(x);
	}
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number for which the binary concatenated decimal number is to be found: ");
        BigInteger n = sc.nextBigInteger();
        concat(n);
        sc.close();
    }
}
