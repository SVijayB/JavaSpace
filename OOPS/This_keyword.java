package OOPS;

//“this” can be used inside any method to refer to the current object. 
//That is, “this” is always a reference to the object on which the method was invoked.


public class This_keyword 
{
    String title = "Playing with JAVA";
    public static void main(String[] args)
    {
        This_keyword obj = new This_keyword();
        System.out.println(obj.title);
        obj.show();
        obj.show1();
    }
    public void show()
    {
        String title = "Playing with Python"; //local variable
        System.out.println(title); 
    }
    public void show1()
    {
        String title = "Playing with C"; //local variable
        System.out.println(this.title);
    }   
}