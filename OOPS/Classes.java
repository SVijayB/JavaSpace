class employee
{  
    int id = 5; 
    String name = "Vijay";  
 
    public static void main(String args[])
    {   
        employee e = new employee(); //Object

        System.out.println(e.id); //Accessing through reference variable
        System.out.println(e.name);  
    }  
}

// Creating a seperate class. 

class employee1
{  
    int id = 5; 
    String name = "Vijay";  
}

class Main
{  
    public static void main(String args[])
    {  
        employee1 s1=new employee1();  
        System.out.println(s1.id);  
        System.out.println(s1.name);  
    }  
}  