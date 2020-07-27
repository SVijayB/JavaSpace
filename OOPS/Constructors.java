package OOPS;

class Book
{
    public String title;
    public String author;
    public int cost;

    void initialize(String t, String a, int c)
    {
        title = t;
        author = a;
        cost = c;
    }
}

public class Constructors
{
    public static void main(String args[])
    {
        Book obj = new Book();
        Book obj2 = new Book();

        // Initializing instance variable by approach 1
        obj.title = "Harry Potter";
        obj.author = "J.K Rowling";
        obj.cost = 600;
        System.out.println(obj.title + "\n" + obj.author + "\n" + obj.cost);

        // Initializing instance variable by approach 2
        obj2.initialize("Percy Jackson", "Rick riordan", 700);
        System.out.println(obj2.title + "\n" + obj2.author + "\n" + obj2.cost);
    }
}