package OOPS.Examples;

public abstract class Shape
{
	protected String shapeName;
	
	public Shape (String shapeName)
	{
		this.shapeName = shapeName;
	}
	
	abstract double area();
	
	public String toString()
	{
		return shapeName;
	}
}

class Sphere extends Shape
{
    private double radius; 
    public Sphere(double radius)
    {
        super("Sphere");
        this.radius = radius;
    }
    public double area()
    {
        return 4*Math.PI*radius*radius;
    }
}


class Rectangle extends Shape
{
	private double length;
	private double width;
	
	public Rectangle (double length, double width)
	{
		super("Rectangle");
		this.length = length;
		this.width = width;
	}
	
	public double area()
    {
		return length * width;
	}
}

class Cylinder extends Shape
{
	private double radius;
	private double height;
	
	public Cylinder (double radius, double height)
	{
		super("Cylinder");
		this.radius = radius;
		this.height = height;
	}
	
	public double area()
	{
		return Math.PI * radius * radius * height;
	}
}

class Paint
{
    private double coverage; 
    public Paint(double coverage)
    {
        this.coverage = coverage;
    }
    public double amount(Shape s)
    {
        double finalAmount = s.area()/coverage;
        System.out.println("Quantity needed for " + s + " is " + finalAmount);
        return finalAmount; 
    }
}

class PaintThings
{
   public static void main (String[] args)
   {
        final double coverage = 350;
        Paint paint = new Paint(coverage);
        Rectangle deck = new Rectangle (20,30);
        Sphere bigBall = new Sphere (15);
        Cylinder tank = new Cylinder (10,30);
        double deckAmt, ballAmt, tankAmt;

        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);

        System.out.println ("\nQuantity of paint needed : \n--------------");
        System.out.println ("Deck " + deckAmt);
        System.out.println ("Big Ball " + ballAmt);
        System.out.println ("Tank " + tankAmt);
   }
} 