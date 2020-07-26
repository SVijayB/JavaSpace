class JavaExample
{
    static int var1 = 77;
	String var2;
	
	static {System.out.println("This is declared static, hence printed first XD");}
	public static void main(String[] args) 
	{
		JavaExample obj1 = new JavaExample();
		JavaExample obj2 = new JavaExample();
		
		var1 = 88;
		obj1.var2 = "Initial value -> But updated thanks to static!";
		
		var1 = 98;
        obj2.var2 = "I have updated but... -> Works cause not static :(";
        
        System.out.println(obj1.var2);
		System.out.println(var1);
        System.out.println(obj2.var2);
		System.out.println(var1);
	}
}