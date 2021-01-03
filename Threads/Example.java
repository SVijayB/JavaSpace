package Threads;

class CourseException extends Exception
{
	public CourseException(String s)
	{
		super(s);
	}
}

class Course
{
	String department;
	int course;
	double credits;
	public Course(String dep, int course, double cred)
	{
		if(dep.length()!=3 || (course < 100 || course > 499) || (cred  < 0.5 || cred > 6))
		{
			try 
			{
				throw new CourseException("ERROR! UNABLE TO ADD COURSE");
			} 
			catch (CourseException e) 
			{
				System.out.println(e.getMessage());
			}
		}
		else
		{
			this.department = dep;
			this.course = course;
			this.credits = cred;
			System.out.println("Department " + dep + " Course " + course + " Cred " + cred);
		}
	}
	public static void main(String args[])
	{
		Course courses[] = new Course[6];
		courses[0] = new Course ("CSI",101,4);
		courses[1] = new Course ("NRIS",0,600);
		courses[2] = new Course ("DSE",451,6);
		courses[3] = new Course ("DXA",420,0.1);
		courses[4] = new Course ("CLM",600,0.7);
		courses[5] = new Course ("CSI",98,8);
	}
}