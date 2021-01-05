package Threads;

class Reverse
{
    static int num;

    int find(int num) 
    {
        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}

class ReverseR extends Reverse
{
    int find(int num) 
    {
        if (num < 10) 
        {
            System.out.println(num);
            return num;
        }
        else 
        {
            System.out.print(num % 10);
            find(num/10);
        }
        return num;
    }
}
public class Test1 
{
    public static void main(String args[])
    {
        ReverseR obj = new ReverseR();
        obj.find(5741);
        Reverse obj2 = new ReverseR();
        obj2.find(5741);
        Reverse obj3 = new Reverse();
        int z = obj3.find(5741);
        System.out.println(z);
    }
}
