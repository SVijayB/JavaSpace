package Miscellaneous;
import java.util.*;
class project
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("							Online Counselling System");
		System.out.print("Enter your name: ");
		String name = sc.next();
		int rank,i,n,c;
		char ans='n',an='n';
		String day = "", time = "", e = "";

		String clg[] = new String [20];
		clg[0] = "RV College of Engineering";
		clg[1] = "BMS College of Engineering";
		clg[2] = "Ramiah Institue of Technology";
		clg[3] = "Bangalore Institue of Technology";
		clg[4] = "PES Institue of Technology";
		clg[5] = "Reva University";
		clg[6] = "Nitte Meenakshi Institue of Technology";
		clg[7] = "Christ University";

		String crs[] = new String [10];
		crs[0] = "Computer Science Engineering";
		crs[1] = "Electronics and Communication Engineering";
		crs[2] = "Mechanical Engineering";
		

		System.out.print("Enter marks in Physics: ");
		int phy = sc.nextInt();
		System.out.print("Enter marks in Chemistry: ");
		int chem = sc.nextInt();
		System.out.print("Enter marks in Maths: ");
		int math = sc.nextInt();
		int agg = (phy+chem+math)/3;
		if(agg>60)
		{
			do
			{
				System.out.print("Enter your Rank obtained in exam: ");
				rank = sc.nextInt();
				if(rank<=0)
				{
					System.out.println("Invalid input");
					System.out.print("Would you like to try again?(y/n): ");
					ans = sc.next().charAt(0);
					if(ans=='n'||ans=='N')
					{
						System.out.print("Would you like to exit the program?(y/n): ");
						ans = sc.next().charAt(0);
						if(ans=='y'||ans=='Y')
						{
							System.out.println("You have exited the program");
							break;
						}
						else
						{
							ans = 'y';
						}
					}
				}
				else
				{
					break;
				}	
			}while(ans=='Y'||ans=='y');

			System.out.println();
			
			if(rank>0&&rank<=1000)
			{
				day = ("Your Counselling is on the 1st of July 2019 "); 
				if(rank>0&&rank<=350)
				{
					time = ("9AM to 12PM");
				}
				else if(rank>350&&rank<=700)
				{
					time = ("1PM to 4PM");
				}
				else if(rank>700&&rank<=1000)
				{
					time = ("5PM to 8PM");
				}
			} 
			else if(rank>1000&&rank<=5000)
			{
				day = ("Your Counselling is on the 2nd of July 2019 ");
				if(rank>1000&&rank<=2000)
				{
					time = ("9AM to 12PM");
				}
				else if(rank>2000&&rank<=3500)
				{
					time = ("1PM to 4PM");
				}
				else if(rank>3500&&rank<=5000)
				{
					time = ("5PM to 8PM");
				} 
			}
			else if(rank>5000&&rank<=10000)
			{
				day = ("Your Counselling is on the 3rd of July 2019 "); 
				if(rank>5000&&rank<=7000)
				{
					time = ("9AM to 12PM");
				}
				else if(rank>7000&&rank<=8500)
				{
					time = ("1PM to 4PM");
				}
				else if(rank>8500&&rank<=10000)
				{
					time = ("5PM to 8PM");
				}
			}
			else if(rank>10000&&rank<=20000)
			{
				day = ("Your Counselling is on the 4th of July 2019 ");
				if(rank>10000&&rank<=13000)
				{
					time = ("9AM to 12PM");
				}
				else if(rank>13000&&rank<=16500)
				{
					time = ("1PM to 4PM");
				}
				else if(rank>16500&&rank<=20000)
				{
					time = ("5PM to 8PM");
				} 
			}
			else if(rank>20000&&rank<=50000)
			{
				day = ("Your Counselling is on the 5th of July 2019 "); 
				if(rank>20000&&rank<=30000)
				{
					time = ("9AM to 12PM");
				}
				else if(rank>30000&&rank<=40000)
				{
					time = ("1PM to 4PM");
				}
				else if(rank>40000&&rank<=50000)
				{
					time = ("5PM to 8PM");
				}
			}
			else if(rank>50000&&rank<=100000)
			{
				day = ("Your Counselling is on the 8th of July 2019 ");
				if(rank>50000&&rank<=65000)
				{
					time = ("9AM to 12PM");
				}
				else if(rank>65000&&rank<=80000)
				{
					time = ("1PM to 4PM");
				}
				else if(rank>80000&&rank<=100000)
				{
					time = ("5PM to 8PM");
				} 
			}
			else if(rank>100000)
			{
				System.out.println("You are not qualified for Counselling");
			}
			if(rank>0&&rank<=100000)
			{
				do
				{
					System.out.println();
					System.out.println("Colleges: ");
					for(i=1;i<9;i++)
					{
						System.out.println(i + ") "+ clg[i-1]);	
					}
					System.out.println();
					System.out.print("Pick the college you want to apply for: ");
					n = sc.nextInt();
					while(n!=1&&n!=2&&n!=3&&n!=4&&n!=5&&n!=6&&n!=7&&n!=8)
					{
						System.out.println("Invalid choice! Pick again.");
						n = sc.nextInt();
					}
					System.out.println();
					for(i=0;i<8;i++)
					{
						if(n==i+1)
						{
							System.out.println("You have picked " + clg[i]);
							e = clg[i];
						}
					}

					
					System.out.println();
					System.out.println("Courses: ");
					for(i=1;i<4;i++)
					{
						System.out.println(i + ") " + crs[i-1]);
					}
					System.out.println();
					System.out.print("Pick the Course you want to apply for in the above chosen College: ");
					c = sc.nextInt();
					while(c!=1&&c!=2&&c!=3)
					{
						System.out.println("Invalid choice! Pick again.");
						c = sc.nextInt();
					}
					System.out.println();
					for(i=0;i<3;i++)
					{
						if(c==i+1)
						{
							System.out.println("You have chosen " + crs[i] + " in " + e);
						}
					}

					System.out.println();


					if(n==1&&c==1&&rank>239)
					{
						System.out.print("Your rank is higher than the cut-off rank, Try a different combination?(y/n): ");
						an = sc.next().charAt(0);
						while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
						{
							System.out.println("Invalid input! Try again");
							an = sc.next().charAt(0);
						}
						if(an=='n'||an=='N')
						{
							System.out.print("Are you sure you don't want to change?(y/n): ");
							an = sc.next().charAt(0);
							while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
							{
								System.out.println("Invalid input! Try again");
								an = sc.next().charAt(0);
							}
							if(an=='y'||an=='Y')
							{
								System.out.println("Your preference has been saved");
								break;
							}
							else
							{
								an = 'y';
							}
						}
					}
					else if(n==1&&c==2&&rank>478)
					{
						System.out.print("Your rank is higher than the cut-off rank, Try a different combination?(y/n): ");
						an = sc.next().charAt(0);
						while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
						{
							System.out.println("Invalid input! Try again");
							an = sc.next().charAt(0);
						}
						if(an=='n'||an=='N')
						{
							System.out.print("Are you sure you don't want to change?(y/n): ");
							an = sc.next().charAt(0);
							while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
							{
								System.out.println("Invalid input! Try again");
								an = sc.next().charAt(0);
							}
							if(an=='y'||an=='Y')
							{
								System.out.println("Your preference has been saved");
								break;
							}
							else
							{
								an = 'y';
							}
						}
					}
					else if(n==1&&c==3&&rank>816)
					{
						System.out.print("Your rank is higher than the cut-off rank, Try a different combination?(y/n): ");
						an = sc.next().charAt(0);
						while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
						{
							System.out.println("Invalid input! Try again");
							an = sc.next().charAt(0);
						}
						if(an=='n'||an=='N')
						{
							System.out.print("Are you sure you don't want to change?(y/n): ");
							an = sc.next().charAt(0);
							while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
							{
								System.out.println("Invalid input! Try again");
								an = sc.next().charAt(0);
							}
							if(an=='y'||an=='Y')
							{
								System.out.println("Your preference has been saved");
								break;
							}
							else
							{
								an = 'y';
							}
						}
					}
					else if(n==2&&c==1&&rank>809)
					{
						System.out.print("Your rank is higher than the cut-off rank, Try a different combination?(y/n): ");
						an = sc.next().charAt(0);
						while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
						{
							System.out.println("Invalid input! Try again");
							an = sc.next().charAt(0);
						}
						if(an=='n'||an=='N')
						{
							System.out.print("Are you sure you don't want to change?(y/n): ");
							an = sc.next().charAt(0);
							while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
							{
								System.out.println("Invalid input! Try again");
								an = sc.next().charAt(0);
							}
							if(an=='y'||an=='Y')
							{
								System.out.println("Your preference has been saved");
								break;
							}
							else
							{
								an = 'y';
							}
						}
					}
					else if(n==2&&c==2&&rank>1167)
					{
						System.out.print("Your rank is higher than the cut-off rank, Try a different combination?(y/n): ");
						an = sc.next().charAt(0);
						while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
						{
							System.out.println("Invalid input! Try again");
							an = sc.next().charAt(0);
						}
						if(an=='n'||an=='N')
						{
							System.out.print("Are you sure you don't want to change?(y/n): ");
							an = sc.next().charAt(0);
							while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
							{
								System.out.println("Invalid input! Try again");
								an = sc.next().charAt(0);
							}
							if(an=='y'||an=='Y')
							{
								System.out.println("Your preference has been saved");
								break;
							}
							else
							{
								an = 'y';
							}
						}
					}
					else if(n==2&&c==3&&rank>2662)
					{
						System.out.print("Your rank is higher than the cut-off rank, Try a different combination?(y/n): ");
						an = sc.next().charAt(0);
						while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
						{
							System.out.println("Invalid input! Try again");
							an = sc.next().charAt(0);
						}
						if(an=='n'||an=='N')
						{
							System.out.print("Are you sure you don't want to change?(y/n): ");
							an = sc.next().charAt(0);
							while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
							{
								System.out.println("Invalid input! Try again");
								an = sc.next().charAt(0);
							}
							if(an=='y'||an=='Y')
							{
								System.out.println("Your preference has been saved");
								break;
							}
							else
							{
								an = 'y';
							}
						}
					}
					else if(n==3&&c==1&&rank>868)
					{
						System.out.print("Your rank is higher than the cut-off rank, Try a different combination?(y/n): ");
						an = sc.next().charAt(0);
						while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
						{
							System.out.println("Invalid input! Try again");
							an = sc.next().charAt(0);
						}
						if(an=='n'||an=='N')
						{
							System.out.print("Are you sure you don't want to change?(y/n): ");
							an = sc.next().charAt(0);
							while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
							{
								System.out.println("Invalid input! Try again");
								an = sc.next().charAt(0);
							}
							if(an=='y'||an=='Y')
							{
								System.out.println("Your preference has been saved");
								break;
							}
							else
							{
								an = 'y';
							}
						}
					}
					else if(n==3&&c==2&&rank>1249)
					{
						System.out.print("Your rank is higher than the cut-off rank, Try a different combination?(y/n): ");
						an = sc.next().charAt(0);
						while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
						{
							System.out.println("Invalid input! Try again");
							an = sc.next().charAt(0);
						}
						if(an=='n'||an=='N')
						{
							System.out.print("Are you sure you don't want to change?(y/n): ");
							an = sc.next().charAt(0);
							while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
							{
								System.out.println("Invalid input! Try again");
								an = sc.next().charAt(0);
							}
							if(an=='y'||an=='Y')
							{
								System.out.println("Your preference has been saved");
								break;
							}
							else
							{
								an = 'y';
							}
						}
					}
					else if(n==3&&c==3&&rank>3462)
					{
						System.out.print("Your rank is higher than the cut-off rank, Try a different combination?(y/n): ");
						an = sc.next().charAt(0);
						while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
						{
							System.out.println("Invalid input! Try again");
							an = sc.next().charAt(0);
						}
						if(an=='n'||an=='N')
						{
							System.out.print("Are you sure you don't want to change?(y/n): ");
							an = sc.next().charAt(0);
							while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
							{
								System.out.println("Invalid input! Try again");
								an = sc.next().charAt(0);
							}
							if(an=='y'||an=='Y')
							{
								System.out.println("Your preference has been saved");
								break;
							}
							else
							{
								an = 'y';
							}
						}
					}
					else if(n==4&&c==1&&rank>1521)
					{
						System.out.print("Your rank is higher than the cut-off rank, Try a different combination?(y/n): ");
						an = sc.next().charAt(0);
						while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
						{
							System.out.println("Invalid input! Try again");
							an = sc.next().charAt(0);
						}
						if(an=='n'||an=='N')
						{
							System.out.print("Are you sure you don't want to change?(y/n): ");
							an = sc.next().charAt(0);
							while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
							{
								System.out.println("Invalid input! Try again");
								an = sc.next().charAt(0);
							}
							if(an=='y'||an=='Y')
							{
								System.out.println("Your preference has been saved");
								break;
							}
							else
							{
								an = 'y';
							}
						}
					}
					else if(n==4&&c==2&&rank>2744)
					{
						System.out.print("Your rank is higher than the cut-off rank, Try a different combination?(y/n): ");
						an = sc.next().charAt(0);
						while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
						{
							System.out.println("Invalid input! Try again");
							an = sc.next().charAt(0);
						}
						if(an=='n'||an=='N')
						{
							System.out.print("Are you sure you don't want to change?(y/n): ");
							an = sc.next().charAt(0);
							while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
							{
								System.out.println("Invalid input! Try again");
								an = sc.next().charAt(0);
							}
							if(an=='y'||an=='Y')
							{
								System.out.println("Your preference has been saved");
								break;
							}
							else
							{
								an = 'y';
							}
						}
					}
					else if(n==4&&c==3&&rank>10882)
					{
						System.out.print("Your rank is higher than the cut-off rank, Try a different combination?(y/n): ");
						an = sc.next().charAt(0);
						while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
						{
							System.out.println("Invalid input! Try again");
							an = sc.next().charAt(0);
						}
						if(an=='n'||an=='N')
						{
							System.out.print("Are you sure you don't want to change?(y/n): ");
							an = sc.next().charAt(0);
							while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
							{
								System.out.println("Invalid input! Try again");
								an = sc.next().charAt(0);
							}
							if(an=='y'||an=='Y')
							{
								System.out.println("Your preference has been saved");
								break;
							}
							else
							{
								an = 'y';
							}
						}
					}	
					else if(n==5&&c==1&&rank>449)
					{
						System.out.print("Your rank is higher than the cut-off rank, Try a different combination?(y/n): ");
						an = sc.next().charAt(0);
						while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
						{
							System.out.println("Invalid input! Try again");
							an = sc.next().charAt(0);
						}
						if(an=='n'||an=='N')
						{
							System.out.print("Are you sure you don't want to change?(y/n): ");
							an = sc.next().charAt(0);
							while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
							{
								System.out.println("Invalid input! Try again");
								an = sc.next().charAt(0);
							}
							if(an=='y'||an=='Y')
							{
								System.out.println("Your preference has been saved");
								break;
							}
							else
							{
								an = 'y';
							}
						}
					}
					else if(n==5&&c==2&&rank>923)
					{
						System.out.print("Your rank is higher than the cut-off rank, Try a different combination?(y/n): ");
						an = sc.next().charAt(0);
						while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
						{
							System.out.println("Invalid input! Try again");
							an = sc.next().charAt(0);
						}
						if(an=='n'||an=='N')
						{
							System.out.print("Are you sure you don't want to change?(y/n): ");
							an = sc.next().charAt(0);
							while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
							{
								System.out.println("Invalid input! Try again");
								an = sc.next().charAt(0);
							}
							if(an=='y'||an=='Y')
							{
								System.out.println("Your preference has been saved");
								break;
							}
							else
							{
								an = 'y';
							}
						}
					}
					else if(n==5&&c==3&&rank>3327)
					{
						System.out.print("Your rank is higher than the cut-off rank, Try a different combination?(y/n): ");
						an = sc.next().charAt(0);
						while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
						{
							System.out.println("Invalid input! Try again");
							an = sc.next().charAt(0);
						}
						if(an=='n'||an=='N')
						{
							System.out.print("Are you sure you don't want to change?(y/n): ");
							an = sc.next().charAt(0);
							while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
							{
								System.out.println("Invalid input! Try again");
								an = sc.next().charAt(0);
							}
							if(an=='y'||an=='Y')
							{
								System.out.println("Your preference has been saved");
								break;
							}
							else
							{
								an = 'y';
							}
						}
					}
					else if(n==6&&c==1&&rank>16254)
					{
						System.out.print("Your rank is higher than the cut-off rank, Try a different combination?(y/n): ");
						an = sc.next().charAt(0);
						while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
						{
							System.out.println("Invalid input! Try again");
							an = sc.next().charAt(0);
						}
						if(an=='n'||an=='N')
						{
							System.out.print("Are you sure you don't want to change?(y/n): ");
							an = sc.next().charAt(0);
							while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
							{
								System.out.println("Invalid input! Try again");
								an = sc.next().charAt(0);
							}
							if(an=='y'||an=='Y')
							{
								System.out.println("Your preference has been saved");
								break;
							}
							else
							{
								an = 'y';
							}
						}
					}
					else if(n==6&&c==2&&rank>17556)
					{
						System.out.print("Your rank is higher than the cut-off rank, Try a different combination?(y/n): ");
						an = sc.next().charAt(0);
						while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
						{
							System.out.println("Invalid input! Try again");
							an = sc.next().charAt(0);
						}
						if(an=='n'||an=='N')
						{
							System.out.print("Are you sure you don't want to change?(y/n): ");
							an = sc.next().charAt(0);
							while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
							{
								System.out.println("Invalid input! Try again");
								an = sc.next().charAt(0);
							}
							if(an=='y'||an=='Y')
							{
								System.out.println("Your preference has been saved");
								break;
							}
							else
							{
								an = 'y';
							}
						}
					}
					else if(n==6&&c==3&&rank>29247)
					{
						System.out.print("Your rank is higher than the cut-off rank, Try a different combination?(y/n): ");
						an = sc.next().charAt(0);
						while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
						{
							System.out.println("Invalid input! Try again");
							an = sc.next().charAt(0);
						}
						if(an=='n'||an=='N')
						{
							System.out.print("Are you sure you don't want to change?(y/n): ");
							an = sc.next().charAt(0);
							while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
							{
								System.out.println("Invalid input! Try again");
								an = sc.next().charAt(0);
							}
							if(an=='y'||an=='Y')
							{
								System.out.println("Your preference has been saved");
								break;
							}
							else
							{
								an = 'y';
							}
						}
					}
					else if(n==7&&c==1&&rank>5331)
					{
						System.out.print("Your rank is higher than the cut-off rank, Try a different combination?(y/n): ");
						an = sc.next().charAt(0);
						while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
						{
							System.out.println("Invalid input! Try again");
							an = sc.next().charAt(0);
						}
						if(an=='n'||an=='N')
						{
							System.out.print("Are you sure you don't want to change?(y/n): ");
							an = sc.next().charAt(0);
							while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
							{
								System.out.println("Invalid input! Try again");
								an = sc.next().charAt(0);
							}
							if(an=='y'||an=='Y')
							{
								System.out.println("Your preference has been saved");
								break;
							}
							else
							{
								an = 'y';
							}
						}
					}
					else if(n==7&&c==2&&rank>6577)
					{
						System.out.print("Your rank is higher than the cut-off rank, Try a different combination?(y/n): ");
						an = sc.next().charAt(0);
						while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
						{
							System.out.println("Invalid input! Try again");
							an = sc.next().charAt(0);
						}
						if(an=='n'||an=='N')
						{
							System.out.print("Are you sure you don't want to change?(y/n): ");
							an = sc.next().charAt(0);
							while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
							{
								System.out.println("Invalid input! Try again");
								an = sc.next().charAt(0);
							}
							if(an=='y'||an=='Y')
							{
								System.out.println("Your preference has been saved");
								break;
							}
							else
							{
								an = 'y';
							}
						}
					}
					else if(n==7&&c==3&&rank>13524)
					{
						System.out.print("Your rank is higher than the cut-off rank, Try a different combination?(y/n): ");
						an = sc.next().charAt(0);
						while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
						{
							System.out.println("Invalid input! Try again");
							an = sc.next().charAt(0);
						}
						if(an=='n'||an=='N')
						{
							System.out.print("Are you sure you don't want to change?(y/n): ");
							an = sc.next().charAt(0);
							while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
							{
								System.out.println("Invalid input! Try again");
								an = sc.next().charAt(0);
							}
							if(an=='y'||an=='Y')
							{
								System.out.println("Your preference has been saved");
								break;
							}
							else
							{
								an = 'y';
							}
						}
					}
					else if(n==8&&c==1&&rank>12175)
					{
						System.out.print("Your rank is higher than the cut-off rank, Try a different combination?(y/n): ");
						an = sc.next().charAt(0);
						while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
						{
							System.out.println("Invalid input! Try again");
							an = sc.next().charAt(0);
						}
						if(an=='n'||an=='N')
						{
							System.out.print("Are you sure you don't want to change?(y/n): ");
							an = sc.next().charAt(0);
							while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
							{
								System.out.println("Invalid input! Try again");
								an = sc.next().charAt(0);
							}
							if(an=='y'||an=='Y')
							{
								System.out.println("Your preference has been saved");
								break;
							}
							else
							{
								an = 'y';
							}
						}
					}
					else if(n==8&&c==2&&rank>14336)
					{
						System.out.print("Your rank is higher than the cut-off rank, Try a different combination?(y/n): ");
						an = sc.next().charAt(0);
						while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
						{
							System.out.println("Invalid input! Try again");
							an = sc.next().charAt(0);
						}
						if(an=='n'||an=='N')
						{
							System.out.print("Are you sure you don't want to change?(y/n): ");
							an = sc.next().charAt(0);
							while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
							{
								System.out.println("Invalid input! Try again");
								an = sc.next().charAt(0);
							}
							if(an=='y'||an=='Y')
							{
								System.out.println("Your preference has been saved");
								break;
							}
							else
							{
								an = 'y';
							}
						}
					}
					else if(n==8&&c==3&&rank>26591)
					{
						System.out.print("Your rank is higher than the cut-off rank, Try a different combination?(y/n): ");
						an = sc.next().charAt(0);
						while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
						{
							System.out.println("Invalid input! Try again");
							an = sc.next().charAt(0);
						}
						if(an=='n'||an=='N')
						{
							System.out.print("Are you sure you don't want to change?(y/n): ");
							an = sc.next().charAt(0);
							while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
							{
								System.out.println("Invalid input! Try again");
								an = sc.next().charAt(0);
							}
							if(an=='y'||an=='Y')
							{
								System.out.println("Your preference has been saved");
								break;
							}
							else
							{
								an = 'y';
							}
						}
					}
					else
					{
						System.out.print("Are you sure you don't want to change?(y/n): ");
						an = sc.next().charAt(0);
						while(an!='n'&&an!='N'&&an!='y'&&an!='Y')
						{
							System.out.println("Invalid input! Try again");
							an = sc.next().charAt(0);
						}
						if(an=='y'||an=='Y')
						{
							System.out.println("Your preference has been saved");
							break;
						}
						else
						{
							an = 'y';
						}
					}
				}while(an=='y'||an=='Y');
				System.out.println("-----------------------------------------------------------------");
				System.out.println("INFO: ");
				System.out.println("Name: " + name);
				System.out.println("Aggregate in Physics, Chemistry and Maths: " + agg);
				System.out.println("Rank Obtained: " + rank);
				System.out.println(day + "from " + time);
				System.out.println("Your Preference: ");
				System.out.println(crs[c-1] + " in " + clg[n-1]);
				System.out.println("-----------------------------------------------------------------");
			}
		}
		else
		{
			System.out.println("You are not qualified for Counselling as your PCM Aggregate is less than 60");
		}
		sc.close();
	}	
}
