package OOPS.Examples;

class Holiday
{ 
    String name;
    private int day;
    private String month;

    //Constructor
    public Holiday(String n, int d, String m) 
    {
        name = n;
        day = d;
        month = m;
    }

    //Method to check if months of two different holidays are same or not.
    public boolean inSameMonth(Holiday hol)
    {
        if(this.month == hol.month)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //Method to calculate the average value of date from different Holidays.
    public static double avgDate(Holiday[] hol) 
    {
        double result;
        double sum = 0;
        for(int i = 0; i < hol.length; i++) 
        {
            sum = sum + hol[i].day;
        }
        result = sum/hol.length;
        return result;
    }

    public static void main(String args[])
    {
        //Creating a Holiday instance and printing it's values.
        Holiday hol = new Holiday("Independance day", 15, "August");
        System.out.println("Name of the holiday : " + hol.name);
        System.out.println("Holiday is on : " + hol.day + " of " + hol.month);

        //Creating a holiday instance to check if the months match.
        Holiday hol1 = new Holiday("New year",1,"January");
        System.out.println("\nChecking if New year and Independance day are on the same month : ");
        if(hol.inSameMonth(hol1))
        {
            System.out.println("Holidays are in the same month!");
        }
        else
        {
            System.out.println("Holidays are in different months");
        }

        //Creating another holiday instance to check if the months match this time.
        Holiday hol2 = new Holiday("Sankranthi",14,"January");
        System.out.println("\nChecking if New year and Sankranthi are on the same month : ");
        if(hol1.inSameMonth(hol2))
        {
            System.out.println("Holidays are in the same month!");
        }
        else
        {
            System.out.println("Holidays are in different months");
        }

        //Creating an array of objects.
        Holiday obj[] = new Holiday[5] ;
        obj[0] = new Holiday("Diwali", 14, "November");
        obj[1] = new Holiday("Republic Day", 26, "January");
        obj[2] = new Holiday("Gandhi Jayanti", 2, "October");
        obj[3] = new Holiday("Christmas", 25, "December");
        obj[4] = new Holiday("Labour's Day", 1, "May");
        System.out.println("\nAverage value of days for the holidays given : " + avgDate(obj));
        System.out.println();
    }
}