// Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

// Example 1:
// Sample Input:
// Input: head = [1,2,2,1]
// Output: Output: true

import java.util.*;

class Node{
    int Data;
    Node next;
};

public class PalindromeList {
    public Node InsertNode(Node Head, int iNo)
    {
        Node newn = new Node();
        newn.Data = iNo;
        newn.next = null;

        if(Head == null)
        {
            Head = newn;
        }
        else
        {
            Node temp = Head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newn;
            newn.next = null;
        }
        return Head;
    }

    public boolean CompareEle(Node Head, Stack<Integer> snode)
    {
        boolean bflag = true;
        Node temp = Head;
        int iData1;
        int iData2;

        while(temp != null)
        {
            iData1 = snode.pop();
            iData2 = temp.Data;
            if(iData1 != iData2)
            {
                bflag = false;
            }
            temp = temp.next;
        }
        return bflag;
    }

    public boolean isPalindrome(Node head) {
        Node temp;
        temp = head;
        boolean iRet = false;
        Stack<Integer> snode = new Stack<Integer>();

        while(temp != null)
        {
            //System.out.print("|" + temp.data + "| ->\t");
            snode.add(temp.Data);
            temp = temp.next;
        }
        
        iRet = CompareEle(head, snode);
        
        if(iRet == true)
        {
           iRet = true; 
        }
        else
        {
            iRet = false;
        }

        return iRet;
    }

    public static void main(String args[]) {
        Node Head = null;
        PalindromeList pobj = new PalindromeList();
        boolean iRet = false;

        Head = pobj.InsertNode(Head, 1);
        Head = pobj.InsertNode(Head, 2);
        Head = pobj.InsertNode(Head, 2);
        Head = pobj.InsertNode(Head, 1);

        iRet = pobj.isPalindrome(Head);
        
        if(iRet == true)
        {
           System.out.println("Entered Linked List Is Palindrome !");
        }
        else
        {
            System.out.println("Entered Linked List Is Not Palindrome !");
        }

    }
}
