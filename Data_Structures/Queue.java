package Data_Structures;
import java.util.*;
class queue
{
    private static int queue[];
    private static int front,rear,size;
    
    queue(int a)
    {
        queue = new int [a];
        front = -1;
        rear = -1;
    }
    private static void enqueue(int n)
    {
        if(front==size-1)
        {
            System.out.println("OverFlow Condition");
        }
        else
        {
            if(front==-1&&rear==-1)
            {
                front = 0;
                rear = 0;
                queue[front] = n;
            }
            else
            {
                queue[++rear] = n;
            }
        }
    }
    private static void deque()
    {
        if(front==-1)
        {
            System.out.println("UnderFlow Condition");
        }
        else
        {
            queue[front] = queue[++front];
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the queue");
        size = sc.nextInt();
        queue q = new queue(size);
        enqueue(5);
        enqueue(6);
        deque();
        enqueue(8);
        enqueue(9);
        deque();
        enqueue(2);
        deque();
        deque();
        enqueue(10);
        System.out.println("Elements present in the queue: ");
        for(int i=front;i<=rear;i++)
        {
            System.out.println(queue[i]);
        }
        System.out.println("Front is present in " + front + " position" + " which has element " + queue[front]);
        System.out.println("Rear is present in " + rear + " position" + " which has element " + queue[rear]);
        sc.close();
    }
}
