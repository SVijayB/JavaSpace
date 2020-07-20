package Data_Structures;
//Create binary search tree to insert, delete last node, node with one child and node with two child, Also print number of children.
import java.util.*;
class BST 
{ 
    int count = 0;
    class Node 
    { 
        int key; 
        Node left, right; 
  
        public Node(int item) 
        { 
            key = item; 
            left = right = null; 
        } 
    } 
    Node root; 

    BST() 
    {  
        root = null;  
    } 
    
    void insert(int key) 
    { 
       root = insertRec(root, key);
       count++;
    }
    
    Node insertRec(Node root, int key) 
    { 
  
        if (root == null) 
        { 
            root = new Node(key); 
            return root; 
        } 
        if (key < root.key) 
        {
            root.left = insertRec(root.left, key);
        }
        else if (key > root.key) 
        {
            root.right = insertRec(root.right, key);
        }
        return root; 
    }
    void inorder()  
    { 
       inorderRec(root);
    } 
    void inorderRec(Node root) 
    { 
        if (root != null) 
        { 
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        } 
    } 
    void deleteKey(int key) 
    { 
        root = delete(root, key);
        count--;
    } 
  
    Node delete(Node root, int key)
    { 
        if (root == null)  
        {
            return root;
        }
        if (key < root.key) 
        {
            root.left = delete(root.left, key);
        }     
        else if (key > root.key) 
        {
            root.right = delete(root.right, key);
        }
        else
        { 
            if (root.left == null)
            {
                return root.right;
            }       
            else if (root.right == null)
            {
                return root.left;
            }
            root.key = minValue(root.right);
            root.right = delete(root.right, root.key);
        } 
        return root;
    } 
    int minValue(Node root) 
    { 
        int minv = root.key; 
        while (root.left != null) 
        { 
            minv = root.left.key;
            root = root.left;
        } 
        return minv;
    } 
    
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        BST tree = new BST();
        System.out.println("Enter number of elements into the tree : ");
        int n = sc.nextInt();
        for(int i=1;i<n+1;i++)
        {
            System.out.println("Enter data to be entered in " + i + " position");
            int data = sc.nextInt();
            tree.insert(data);
        }
        System.out.println("Tree : ");
        tree.inorder();
        
        System.out.println("Would you like to delete a node? ");
        char ans=sc.next().charAt(0);
        while(ans=='y'||ans=='Y')
        {
            System.out.println("Enter the number to be deleted : ");
            int data = sc.nextInt();
            tree.deleteKey(data);
            System.out.println("New Tree : ");
            tree.inorder();
            System.out.println("Continue deleting? ");
            ans=sc.next().charAt(0);
        }
        System.out.println("Total Number Of Nodes In The Tree : " + tree.count);
        sc.close();
    } 
} 
  
