package Miscellaneous;

//Narcissistic number is a number whose sum of digits raised to the power of the total number of digits is equal to the number itself.
class Narcissisticno
{
    public static void main(String args[])
    {
        System.out.println("Finding Narcisstic numbers from 10 to 100000");
        for(int n=10;n<100000;n++)//Creating a loop to find all Narcissistic numbers between 10-100000
        {
            int i = n;
            int j = n;
            int k;
            int num = n;
            double sum = 0;
            int count = 0;
            while(i>0)//Creating another loop to find the number of digits of n.
            {
                i = i/10;
                count++;
            }
            while(j>0)
            {
                k = j%10;//Removing each digit of the number
                sum = sum + Math.pow(k,count);//Finding digit^(no. of digits of n)
                j = j/10;
            }
            if(num == sum)//If the condition satisfies, then it is a Narcissistic number.
            {
                System.out.println(num);
            }
        }

//Armstrong number : The numbers in which the sum of the cubes of the digits is equal to the number itself, are called Armstrong number.
        System.out.println("Finding Armstrong Numbers from 1 to 100000");
        for(int n=1;n<100000;n++)
        {
            int a = n;
            int b;
            double s = 0;
            while(a>0)
            {
                b = a%10;
                s = s + Math.pow(b,3);
                a = a/10;
            }
            if(s == n)
            {
                System.out.println(n);
            }
        }
    }
}
//Note : From above program, we can say that an Armstrong number is a Narcissistic number but a Narcissitic number need not be an Armstrong number. 