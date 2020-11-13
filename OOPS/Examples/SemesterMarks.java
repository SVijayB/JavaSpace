package OOPS.Examples;

class Sem1
{
	double m1,m2,m3,m4,avg1;
	public Sem1()
	{
		m1 = 78;
		m2 = 86;
		m3 = 84;
		m4 = 58;
		avg1 = (m1 + m2 + m3 + m4)/4;
  	} 	 
}

class Sem2 extends Sem1 
{
	double m5,m6,m7,m8,avg2;
	public Sem2()
 	{
   		m5 = 87;
   		m6 = 63;
   		m7 = 78;
   		m8 = 99;
 		avg2 = (m5 + m6 + m7 + m8)/4;
 	} 
}

class Sem3 extends Sem2 
{

	double m9,m10,m11,m12,avg3;
	public Sem3()
 	{
		m9 = 73;
		m10 = 68;
	 	m11 = 94;
		m12 = 100;
		avg3 = (m9 + m10 + m11 + m12)/4;
 	} 
}

class Sem4 extends Sem3 
{
	double m13,m14,m15,m16,avg4;
	public Sem4()
	{
		m13 = 87;
		m14 = 63;
		m15 = 48;
		m16 = 98;
		avg4 = (m13 + m14 + m15 + m16)/4;
	}

	double totatavg()
	{
		double totalAvg = (avg1 + avg2 + avg3 + avg4)/4;
 		return totalAvg;
	}
}

class SemesterMarks
{
	public static void main(String args[])
	{
		Sem4 s4 = new Sem4();
		System.out.println("----------------------------------");
		System.out.println("Average marks of each semesters : ");
 		System.out.println("Semester 1 average marks : " + s4.avg1); 
		System.out.println("Semester 2 average marks : " + s4.avg2);
		System.out.println("Semester 3 average marks : " + s4.avg3);
		System.out.println("Semester 4 average marks : " + s4.avg4);
		System.out.println("----------------------------------");
		System.out.println("Total average marks of each semesters : ");
		System.out.println("Total average marks : " + s4.totatavg());
	}
}