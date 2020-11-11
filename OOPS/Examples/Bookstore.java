package OOPS.Examples;

class Author 
{
	private String fName;
	private String lName;

	public Author (String firstName, String lastName)
	{
		fName = firstName;
		lName = lastName;
	}
	public void setFName (String firstName) 
	{
	   fName = firstName;
	}
	public void setLName (String lastName) 
	{
	   lName = lastName;
	}
	public String getFName()
	{
		return fName;
	}
	public String getLName()
	{
		return lName;
	}
	public String toString()
	{
		String name = (fName + " " + lName);
		return name;
	}
}

class Book 
{
	private String title;
	private Author author;
	private double price;
 
	public Book(String t, Author a, double p) 
	{
	   title = t;
	   author = a;
	   price = p;
	}
	public void setTitle(String t) 
	{
	   title = t;
	}
	public void setAuthor(Author a) 
	{
	   author = a;
	}
	public void setPrice(double p)
	{
		price = p;
	}
	public String getTitle() 
	{
		return title;
	}
	public Author getAuthor() 
	{
		return author;
	}
	public double getPrice() 
	{
		return price;
	 }
	public String toString() 
	{
		String temp = ("Title: " + title + "\nAuthor: " + author + "\nPrice: Rs " + price);
		return temp;
	}
}

public class Bookstore 
{
	public static void main(String[] args) 
	{
		// Various test cases for the different methods present in the Book class.
		Author author1 = new Author("Herbert","Schildert");
		Book Book1 = new Book("Object Oriented Programming Systems", author1 ,1000);
		System.out.println(Book1 + "\n");   // Printing the values of Book1

		Author author2 = new Author("J.K","Rowling");
		Book Book2 = new Book("Harry potter",author2,700);    // Creating a second object.
		System.out.println(Book2 + "\n");
		Book2.setTitle("Percy Jackson");    // Updating it's values.
		Author author3 = new Author("Rick","Riordan");
		Book2.setAuthor(author3);
		Book2.setPrice(735);
		System.out.println("Title : " + Book2.getTitle() + "\nAuthor : " + Book2.getAuthor() + "\nPrice : Rs " + Book2.getPrice());
	}
}
