package HackerRank;
import java.math.*;
import java.util.*;

public class LongFactorials {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger o = BigInteger.valueOf(0);
        BigInteger i = BigInteger.valueOf(1);
        BigInteger fact = n;
        if(n.compareTo(o)==0)
        {
            System.out.println(1);
        }
        else
        {
            while(n.compareTo(i)>0)
            {   
                BigInteger b = n.subtract(i);
                fact = fact.multiply(b);
                n = n.subtract(i);
            }
            System.out.println(fact);
            sc.close();
        }
    }
}