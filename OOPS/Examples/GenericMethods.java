package OOPS.Examples;

class GenericMethods<x, y, z>
{
    x obj1;
    y obj2;
    z obj3;

    public GenericMethods(x obj1, y obj2, z obj3)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public <a, b, c> void Display(a obj1, b obj2, c obj3)
    {
        System.out.println("|\t" + obj1 + "\t|\t" + obj2 + "\t|\t" + obj3 + "\t|");
    }

    public static void main(String args[])
    {
        System.out.println("Table : ");
        System.out.println("-------------------------------------------------");
        GenericMethods <Integer,Integer,String> a = new GenericMethods<>(18, 10861, "Virat");
        a.Display(18, 10861, "Virat");
        GenericMethods <String,Integer,Integer> b = new GenericMethods<>("Sachin", 10, 18426);
        b.Display("Sachin", 10, 18426);
        GenericMethods <Integer,String,Integer> c = new GenericMethods<>(7, "Dhoni", 10534);
        c.Display(7, "Dhoni", 10534);
        GenericMethods <Integer,Integer,String> d = new GenericMethods<>(10201, 333, "Gayle");
        d.Display(10201, 333, "Gayle");
        GenericMethods <String,Integer,Integer> e = new GenericMethods<>("ABD", 9577, 17);
        e.Display("ABD", 9577, 17);
        System.out.println("-------------------------------------------------");
    }
}