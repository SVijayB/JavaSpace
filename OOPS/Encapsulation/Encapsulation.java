package OOPS.Encapsulation;

/*Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
In encapsulation, the variables of a class will be hidden from other classes, 
and can be accessed only through the methods of their current class. 
Therefore, it is also known as data hiding.
*/

class Encapsulation 
{
    private String name;
    private String idNo;
    private int age;

    public int getAge() 
    {
        return age;
    }

    public String getName() 
    {
        return name;
    }

    public String getIdNum() 
    {
        return idNo;
    }

    public void setAge(int Age) 
    {
        age = Age;
    }

    public void setName(String Name) 
    {
        name = Name;
    }

    public void setIdNo( String Id) 
    {
        idNo = Id;
    }
}