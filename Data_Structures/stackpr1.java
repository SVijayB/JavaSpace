package Data_Structures;
import java.util.*;
class stackpr1
{
    private int ar[];
    private int top,size;
    stackpr1(int n)
    {
        ar = new int[n];    
        top = -1;
        size = n;
    }
    public boolean isEmpty()
    {
        return top == -1;
    }
    public boolean isFull()
    {
        return top == size - 1;
    }
    
    public void push(int x)
    {
        if(isFull())
        {
            System.out.println("OverFlow Condition");
        }
        else
        {
            ar[++top] = x;
            System.out.println(ar[top]+ " has been added to the stack");
        }
    }
    public void pop()
    {
        if(isEmpty())
        {
            System.out.println("UnderFlow Condition");
        }
        else
        {
            System.out.println(ar[top] + " has been removed");
            top--;
        }
    }
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("There are no elements in the Stack");
        }
        else
        {
            System.out.println("Printing elements in Stack: ");
            for(int i=0;i<=top;i++)
            {
                System.out.println(ar[i]);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Stack");
        int n = sc.nextInt();
        char ch = 'a';
        stackpr1 stack = new stackpr1(n);
        do
        {
            System.out.println("Pick one of the choices: ");
            System.out.println("1)Push");
            System.out.println("2)Pop");
            System.out.println("3)Display");
            int ans = sc.nextInt();
            if(ans==1)
            {
                System.out.println("Enter number to be pushed");
                int a = sc.nextInt();
                stack.push(a);
            }
            else if(ans==2)
            {
                stack.pop();
            }
            else if(ans==3)
            {
                stack.display();
            }
            else
            {
                System.out.println("Wrong chocie");
            }
            System.out.println("Would you like to continue? ");
            ch = sc.next().charAt(0);
        }while(ch=='y'||ch=='Y');
        sc.close();
    }
}