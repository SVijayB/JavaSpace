package Miscellaneous;

// A Game in which the outcome is determined by the choices made by the player.

import java.util.*;
class gameoflife
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char ans,gen;
		int age;
		String g1="",g2="",n;
		System.out.print("Enter your Character's name: ");
		n = sc.nextLine();
		System.out.print("Enter your age: ");
		age = sc.nextInt();
		System.out.print("Mention your gender: ");
		gen = sc.next().charAt(0);
		if(gen=='m'||gen=='M')
		{
			g1 = "his";
			g2 = "he";
		}
		else if(gen=='f'||gen=='F')
		{
			g1 = "her";
			g2 = "she";
		}
		System.out.println();
		if(age<17)
		{
			System.out.println("Sorry, But you are Underaged! Come again after " + (18-age) + " years!");
		}
		else if(age==17)
		{
			System.out.println("Sorry, But you are Underaged! Come again next year!");
		}
		else
		{
			System.out.println("Dear " + n);
			System.out.println("Welcome to the game of life");
			System.out.print("Before we continue, would you like to read the rules?(y/n): ");
			ans = sc.next().charAt(0);
			System.out.println();
			if(ans=='Y'||ans=='y')
			{
				System.out.println("Rules: ");
				System.out.println("1)Your choices matter! The story continues based on the choices you make!!");
				System.out.println("2)Choose wisely, you wont be offered a Second chance! ");
				System.out.println("3)Don't forget to have fun!");
			}
			else 
			{
				System.out.println("Very well then, Here goes nothing!");
			}
			System.out.println("~~~~~~~~~~~~~~~~");
			System.out.println("THE GAME OF LIFE");
			System.out.println(n + " slowly opens " + g1 + " eyes and notices that " + g2 + " is in an enclosed cubical with a fan, a bed and a door that looked locked");
			System.out.println(g2 + " slowly aproches the door, tries to unlock it and to " + g1 + " surprise its unlocked! " + n + " opens the door and walks out");
			System.out.println(g2 + " sees the hallway strech in the left and right direction, Which one do you think " + n + " should take?");
			System.out.print("Your choice: ");
			char a1 = sc.next().charAt(0);
			if(a1=='l'||a1=='L')
			{
				System.out.println(n + " slowly walks towards the left side ");
				System.out.print(g2 + " notices that the further " + g2 + " walks away from the room, the dimmer the lights get ");
				System.out.println(n + " notices: ");
				System.out.println("1)Match box with just a match left ");
				System.out.println("2)A lit candle");
				System.out.println("3)Torch");
				System.out.println("On the wall writen in blood reads \"Pick one!\" ");
				System.out.print("What should " + n + " pick?(1/2/3): ");
				int a2 = sc.nextInt();
				if(a2==1)
				{
					System.out.println(n + " picks up the match box ");
					System.out.print(n + " walks in the dark as " + g2 + " fears that " + g2 + " might need the match elsewhere. ");
					System.out.println(g2 + " walked with no idea of what was ahead, it was pitch dark");
					System.out.println("and before " + g2 + " could react, " + g2 + " slipped off a pit and fell to " + g1 + " death!");
				}
				else if(a2==2)
				{
					System.out.println(n + " slowly picks up the candle stand");
					System.out.println(g2 + " walks in the dark with the help of the candle light. ");
					System.out.println("As " + g2 + " walks further, " + g2 + " notices steep pits that " + g2 + "'d fallen into if not for the candle ");
					System.out.println(g2 + " comes to the end of the hallway, where " + g2 + " sees a rope hanging, but " + n + " could not see where the rope leads");
					System.out.println("What should " + n + " do now? ");
					System.out.println("1) Burn the rope with the candle fire");
					System.out.println("2) Climb it");
					int a4 = sc.nextInt();
					if(a4==1)
					{
						System.out.println(n + " burns the rope down!");
						System.out.println(g2 + " wonders if it was the right thing to do.");
						System.out.println(g2 + " begins to regret the choice " + g2 + " made.");
						System.out.println("With no where to go, " + n + " jumps into the pit " + g2 + " came across earlier hoping it would lead somewhere. ");
						System.out.println("Unfortunately " + n + " fell to " + g1 + " death");
					}
					else if(a4==2)
					{
						System.out.println(n + " attempts to climb the rope");
						System.out.println(g2 + " succeeds in climbing the rope to the top from where " + g2 + " can see light coming out of a room.");
						System.out.println("Right when " + g2 + " was about to reach the top, " + g2 + " loses grip and fell to " + g1 + " death ");
					}
				}
				else if(a2==3)
				{
					System.out.println(n + " picks up the torch and turns it on");
					System.out.println(n + " Walks past pits with the help of the torch ");
					System.out.print(g2 + " notices a rope and attempts to climb it ");
					System.out.println("right when " + g2 + " was about to reach the top, " + g2 + " loses grip and falls to " + g1 + " death ");
				}
				else
				{
					System.out.println("Wrong choice!");
				}
			}
			else if(a1=='r'||a1=='R')
			{
				System.out.println(n + " slowly walks towards the right side ");
				System.out.println(g2 + " soon picks up " + g1 + " pace as " + g2 + " sees the lights get brigher as " + g2 + " walked further");
				System.out.println(n + " encounters two door: ");
				System.out.println("1)This Room is filled with venomous snakes ");
				System.out.println("2)This Room has two lions that did not feed for two whole years!");
				System.out.println("What do you think " + n + " should pick?(1/2): ");
				int a3 = sc.nextInt();
				if(a3==1)
				{
					System.out.println("The venomous snakes bite " + n + " to death!");
				}
				else if(a3==2)
				{
					System.out.println(n + " opens the door and sees the bones of two lions, " + g2 + " slowly walks past them");
					System.out.println(g2 + " comes across a snake that attempts to bite ");
					System.out.println("With no means of defence and no where to run, " + n + " dies");
				}
				else
				{
					System.out.println("Wrong choice!");
				}
			}
			else
			{
				System.out.println("Wrong choice!");
			}
			System.out.println("~~~~~~~~~~~~~~~~~");
			System.out.println();
			System.out.println("My Dear Player! ");
			System.out.println("The Moral of the above story/game was to educate you about death");
			System.out.println("There is no running away from it, there is no stoping the inevitable!");
			System.out.println("So, live the little amount of time you have left in this world with the people you love and make new memories!");
			System.out.println("Don't regret your choices! At the end of the day, the results are all the same for everyone!");
			System.out.println("Hope you had fun! XD ");
			System.out.println();
			System.out.println("~~~~~~~~~~~~~~~~~~");
			System.out.println();
			System.out.println("Credits: ");
			System.out.println("Script writing, Coding, Execution, Testing : 1StranGe");
		}
		sc.close();
	}
}
