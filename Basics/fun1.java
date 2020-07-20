package Basics;
//A Simple fun Text based Game!
import java.util.*;
class fun1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a[] = new String[] {"Strawberry Throw", "Idly Barrage","Water Splash","Manali Scream","Pinch!","Perfect Bite"};
		int i,ans,ph1=100,ph2=100,x=2;
		System.out.print("Enter Name of the first player: ");
		String p1 = sc.nextLine();
		System.out.print("Enter Name of the Second player: ");
		String p2 = sc.nextLine();
		System.out.println();
		System.out.println("Welcome " + p1 + " and " + p2 + " to the game of Manali WAR!");
		System.out.println();	
		System.out.println("Rules: The person who runs out of health first loses!");
		System.out.println();
		System.out.println("THE WAR BEGINS!");
		System.out.println("_________________");
		while(ph1>0&&ph2>0)
		{
			if(x%2==0)
			{
				x++;
				for(i=0;i<6;i++)
				{
					System.out.println(i+1 + ")" + a[i]);
				}
				System.out.println();
				System.out.print(p1 + " Pick one of the above choices: ");
				ans = sc.nextInt();
				if(ans==1)
				{
					ph2 = ph2 - 14;	
					System.out.println(p1 + " has picked " + a[0]);
					System.out.println(p2 + " Watch out! Those strawberries are toxic!(Aren't they always?)");
					System.out.println();
					System.out.println("Status: ");
					System.out.println("Health of " + p1 + " = " + ph1);
					System.out.println("Health of " + p2 + " = " + ph2);
				}
				else if(ans==2)
				{
					ph2 = ph2 - 17;
					System.out.println(p1 + " has picked " + a[1]);
					System.out.println(p2 + " RUN! Those idlies are as hard as rock!");
					System.out.println();
					System.out.println("Status: ");
					System.out.println("Health of " + p1 + " = " + ph1);
					System.out.println("Health of " + p2 + " = " + ph2);
				}
				else if(ans==3)
				{
					ph2 = ph2 - 8;
					System.out.println(p1 + " has picked " + a[2]);
					System.out.println(p2 + " Water! Agh! Suffer!");
					System.out.println();
					System.out.println("Status: ");
					System.out.println("Health of " + p1 + " = " + ph1);
					System.out.println("Health of " + p2 + " = " + ph2);
				}
				else if(ans==4)
				{
					ph2 = ph2 - 32;
					System.out.println(p1 + " has picked " + a[3]);
					System.out.println(p2 + " Oopsie! You are doomed!");
					System.out.println();
					System.out.println("Status: ");
					System.out.println("Health of " + p1 + " = " + ph1);
					System.out.println("Health of " + p2 + " = " + ph2);
				}
				else if(ans==5)
				{
					ph2 = ph2 - 29;
					System.out.println(p1 + " has picked " + a[4]);
					System.out.println("Blood rushes out of " + p2 + "'s hand!");
					System.out.println();
					System.out.println("Status: ");
					System.out.println("Health of " + p1 + " = " + ph1);
					System.out.println("Health of " + p2 + " = " + ph2);
				}
				else if(ans==6)
				{
					ph2 = ph2 - 36;
					System.out.println(p1 + " has picked " + a[5]);
					System.out.println(p2 + " You Messed up real time in your previous life!");
					System.out.println();
					System.out.println("Status: ");
					System.out.println("Health of " + p1 + " = " + ph1);
					System.out.println("Health of " + p2 + " = " + ph2);
				}
				System.out.println("~~~~~~~~~~~~~~");
			}
			else
			{
				x++;
				for(i=0;i<6;i++)
				{
					System.out.println(i+1 + ")" + a[i]);
				}
				System.out.println();
				System.out.print(p2 + " Pick one of the above choices: ");
				ans = sc.nextInt();
				if(ans==1)
				{
					ph1 = ph1 - 14;	
					System.out.println(p2 + " has picked " + a[0]);
					System.out.println(p1 + " Watch out! Those strawberries are toxic!(Aren't they always?)");
					System.out.println();
					System.out.println("Status: ");
					System.out.println("Health of " + p1 + " = " + ph1);
					System.out.println("Health of " + p2 + " = " + ph2);
				}
				else if(ans==2)
				{
					ph1 = ph1 - 17;
					System.out.println(p2 + " has picked " + a[1]);
					System.out.println(p1 + " RUN! Those idlies are as hard as rock!");
					System.out.println();
					System.out.println("Status: ");
					System.out.println("Health of " + p1 + " = " + ph1);
					System.out.println("Health of " + p2 + " = " + ph2);
				}
				else if(ans==3)
				{
					ph1 = ph1 - 8;
					System.out.println(p2 + " has picked " + a[2]);
					System.out.println(p1 + " Water! Agh! Suffer!");
					System.out.println();
					System.out.println("Status: ");
					System.out.println("Health of " + p1 + " = " + ph1);
					System.out.println("Health of " + p2 + " = " + ph2);
				}
				else if(ans==4)
				{
					ph1 = ph1 - 32;
					System.out.println(p2 + " has picked " + a[3]);
					System.out.println(p1 + " Oopsie! You are doomed!");
					System.out.println();
					System.out.println("Status: ");
					System.out.println("Health of " + p1 + " = " + ph1);
					System.out.println("Health of " + p2 + " = " + ph2);
				}
				else if(ans==5)
				{
					ph1 = ph1 - 29;
					System.out.println(p2 + " has picked " + a[4]);
					System.out.println("Blood rushes out of " + p1 + "'s hand!");
					System.out.println();
					System.out.println("Status: ");
					System.out.println("Health of " + p1 + " = " + ph1);
					System.out.println("Health of " + p2 + " = " + ph2);
				}
				else if(ans==6)
				{
					ph1 = ph1 - 36;
					System.out.println(p2 + " has picked " + a[5]);
					System.out.println(p1 + " You Messed up real time in your previous life!");
					System.out.println();
					System.out.println("Status: ");
					System.out.println("Health of " + p1 + " = " + ph1);
					System.out.println("Health of " + p2 + " = " + ph2);
				}
				System.out.println("~~~~~~~~~~~~~~");
			}
		}
		System.out.println();
		if(ph1<0)
		{
			System.out.println(p1 + " has lost!! Find yourself a corner!");
			System.out.println(p2 + " Congrats!!!");
		}
		else
		{
			System.out.println(p2 + " has lost!! Find yourself a corner!");
			System.out.println(p1 + " Congrats!!! ");
		}
		sc.close();
	}
}
