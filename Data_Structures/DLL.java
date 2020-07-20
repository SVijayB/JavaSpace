package Data_Structures;
//Write a program in Java to create 'n' number of lists using the concept of double linked list.
//Perform insertion operation at the begining and at the n/2th position.
//And deletion operation at the end, beginning and from the second last element. 
import java.util.*;
class DLL
{
    static node head;
    static class node
    {
        int data;
        node next;
        node prev;
        
        node(int d)
        {
            data = d;
            next = null;
            prev = null;
        }
    }
    public void add(int data)
    {
        node node = new node(data);
        node.next = head;
        node.prev = null;
        
        if(head != null)
        {
            head.prev = node;
        }
        head = node;
    }
    public void insert(node prev, int data)
    {
        node node = new node(data);
        node.next = prev.next;
        prev.next = node;
        node.prev = node;
        if(node.next!=null)
        {
            node.next.prev = node;
        }    
    }
    public void print(node node)
    {
        node last = null; 
        while (node != null)
        { 
            System.out.print(node.data + " "); 
            last = node; 
            node = node.next; 
	}
        System.out.println();
    }
    public void delete()
    {
        node first = head;
        first = first.next;
        head = first;
        first.prev = null;
    }
    public void deleteatend()
    {
        node last = head;
        while(last.next!=null)
        {
            last = last.next;
        }
        last = last.prev;
        last.next = null;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the linked list: ");
        int n = sc.nextInt();
        DLL dll = new DLL();
        for(int i=1;i<n+1;i++)
        {
            System.out.println("Enter data to be entered in the " + i + " position of the linked list");
            int data =  sc.nextInt();
            dll.add(data);
        }
        System.out.println("Current Linked list: ");
        dll.print(head);
        System.out.println("Enter data to be insered in the n/2th position");
        int data = sc.nextInt();
        dll.insert(head.next, data);
        System.out.println("Current Linked list: ");
        dll.print(head);
        dll.deleteatend();
        System.out.println("Current Linked list: ");
        dll.print(head);
        dll.delete();
        System.out.println("Current Linked list: ");
        dll.print(head);
        sc.close();
    }
}
