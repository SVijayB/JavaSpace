package OOPS.Encapsulation;

/*
Accessing private variables using public methods.
Any class that wants to access these variables must access them through these getters and setters(Access point methods)
*/

public class Accessing 
{
    public static void main(String args[]) 
    {
        Encapsulation enc = new Encapsulation();
        enc.setName("James");
        enc.setAge(20);
        enc.setIdNo("12343ms");
  
        System.out.println("Name : " + enc.getName());
        System.out.println("Age : " + enc.getAge());
    }
}