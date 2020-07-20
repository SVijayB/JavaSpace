package Data_Structures;
//Write a program in java for creating a linked list with elements 5,9,13,25,100,200 and 300. Perform an insertion operation where an element 10 is inserted at the begining. 
//Element 500 is inserted at 3rd from last and element 1 is inserted at the last. 
//Also perform a deletion operation where the 5th element, element 5 and the last element is deleted. 
class linkedlist
{
    static node head;
    
    static int j=1;
    static class node
    {
        int data;
        node next;
        node prev;
        
        node(int d)
        {
            prev = null;
            data = d;
            next = null;
        }
    }
    public void add(int data)
    {
        node node = new node(data);
        node.next = head;
        head = node;
        j++;
    }
    public void insert(node prev, int data)
    {
        node node = new node(data);
        node.next = prev.next;
        prev.next = node;
        j++;
    }
    public void print()
    {
        node node = head;
        while(node!=null)
        {
            System.out.println(node.data);
            node = node.next;
        }
    }
    public static void main(String args[])
    {
        linkedlist list = new linkedlist();
        list.head = null;
        list.add(5);
        list.add(9);
        list.add(13);
        list.add(25);
        list.add(100);
        list.add(200);
        list.add(300);
        node temp;
        temp = head;
        for(int i=1;i<2;i++)
        {
            temp = temp.next;
        }
        list.insert(temp,500);
        temp = head;
        for(int i=1;i<j-1;i++)
        {
            temp = temp.next;
        }
        list.insert(temp, 1);
        list.print();
    }
}
