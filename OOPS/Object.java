package OOPS;

public class Object 
{
    public String title="Playing with JAVA";
    public String author="Mr. X";
    public String ISBN= "ISBN20201307";
    public int cost= 100;

    Object obj;

    public static void main(String args[])
    {
        Object obj = new Object();
        System.out.println(obj.title);
    }
}