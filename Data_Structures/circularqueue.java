package Data_Structures;
import java.util.*; 
class circularqueue
{
    private static int queue[] ;
    private static int front, rear, size, len, ele, f;
    
    circularqueue(int n)
    {
        size = n;
        len = 0;
        queue = new int[size]; 
        front = -1;
        rear = -1;
    }   
    public boolean isEmpty()
    {
        return front == -1;
    } 
    public boolean isFull()
    {
        return (front==0 && rear == size-1 || front == (rear+1 % size));
    }
    public int getSize()
    {
    return len ;
    }  
    public void peek()
    {
        if (isEmpty())
        {
            System.out.println ("Underflow Exception"); 
        }
        else
        { 
            f=queue[front];
            System.out.println (f);
        }
    } 
    public void insert(int i)
    {
        if (front==0 && rear== size-1 || front == (rear+1)%size)
        {
            System.out.println("Overflow Exception");
        }   
        else
        {
            if (rear == -1)  
            {
                front = 0;
                rear = 0;
                queue[rear] = i;
            }      
            else
            {
                rear = (rear + 1) % size;
                queue[rear] = i; 
            }
            len++ ;
        }
    } 
    public int remove()
    {
        if (front==-1)
        {
            System.out.println ("Underflow Exception");
        }
        else
        {
            len-- ;
            ele = queue[front];
            if ( front == rear)
            {
                front = -1;
                rear = -1;
            }
            else
            {
                front=(front+1)%size;
            }
        }
        return ele;
    }
    public void display()
    { 
        int front_pos = front, rear_pos = rear;
        System.out.print("\nQueue = ");
        if (front==-1)
        {
            System.out.print("Empty\n");
        }
        else
        { 
            if(front_pos <= rear_pos)
            {
                while(front_pos <= rear_pos)
                { 
                    System.out.print(queue[front_pos]+" ");
                    front_pos++;
                }
            }
            else
            {
                while(front_pos <= size-1)
                {
                    System.out.print(queue[front_pos]+" ");
                    front_pos++;
                }
                front_pos = 0;
                while(front_pos <= rear_pos)
                {
                    System.out.print(queue[front_pos]+" ");
                    front_pos++;
                }
            }
        }
    System.out.println();
    }
    public static void main(String argsp[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Array Queue Test\n");
        System.out.println("Enter Size of Integer Queue ");
        int n = scan.nextInt();
        circularqueue q = new circularqueue(n);
        char ch;
        do{
            System.out.println("\nQueue Operations");
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Peek");
            System.out.println("4. Check Empty");
            System.out.println("5. Check Full");
            System.out.println("6. Size");
            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.println("Enter integer element to insert");
                    q.insert( scan.nextInt() );
                    break;
                case 2 :
                    System.out.println("Removed Element = "+q.remove());
                    break;
                case 3 :
                    System.out.print("Peek Element = ");
                    q.peek();
                    break;
                case 4 :
                    System.out.println("Empty status = "+q.isEmpty());
                    break;
                case 5 :
                    System.out.println("Full status = "+q.isFull());
                    break;
                case 6 :
                    System.out.println("Size = "+ q.getSize());
                    break;
                default : 
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            q.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } 
        while (ch == 'Y'|| ch == 'y');
        scan.close();
    }       
}
