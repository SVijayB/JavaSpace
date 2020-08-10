package OOPS;

public class Variables 
{
    int A = 50; //instance variable -> Inside class, outside method.

    static int B = 70; //Static variable -> Shared among all instances of the class.

    void random()
    {
        int C = 90; //Local variable -> Inside method and can be used only within the method.
        System.out.println("Local Variable : " + C);
    }
    public static void main(String args[])
    {
        Variables rn = new Variables();
       System.out.println("Instance variable A : "+rn.A);
        System.out.println("Static variable B : " + B);
        rn.random();
        //System.out.println(C);
    }
}