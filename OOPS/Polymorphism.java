package OOPS;

class Polymorphism 
{
    public int area(int side)
    {
        int value = side*side*side;
        return value;
    }
    public double area(double radius)
    {
        double value = 3.14*radius*radius;
        return value;
    }
    public void area(String message)
    {
        System.out.println("Hello " + message);
    }
    public static void main(String args[])
    {
        System.out.print("Polymorphism is the ability of an object to take on many forms.\n"+
        "The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.\n"+
        "You only have to change the argument list.");
        Polymorphism obj1 = new Polymorphism();
        System.out.println(obj1.area(5));
        System.out.println(obj1.area(1.5));
        obj1.area("World!");
    }
}