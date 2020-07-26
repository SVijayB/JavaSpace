package OOPS;

/* There are 3 ways to initialize object in Java.

    1) By reference variable
    2) By method
    3) By constructor */

// Referencing variables
class Employee2
{  
    int id;  
    String name;  
}  

class case2
{  
    public static void main(String args[])
    {  
        Employee2 e1 = new Employee2();  
        Employee2 e2 = new Employee2();  
    
        e1.id=101;  
        e1.name="Vijay";  
        e2.id=102;  
        e2.name="Unknown";  

        System.out.println(e1.id+" "+e1.name);  
        System.out.println(e2.id+" "+e2.name);  
    }     
}