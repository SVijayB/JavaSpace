package Miscellaneous;

import java.util.*;
class encryption
{
	public static void main(String args[])
	{
	
	//Encryption
		int i,l,p,f,ans;
		char a = 'a',ch,k;
		String t = "", x = "|", encrypt = "", decrypt = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("What would you like to do");
		System.out.println("1)Encrypt data");
		System.out.println("2)Decrypt data");
		System.out.println("3)Exit Program");
		ans = sc.nextInt();
		while(ans!=1&&ans!=2&&ans!=3)
		{
			System.out.println("Sorry, that is an invalid choice. Choose between 1 , 2 & 3");
			ans = sc.nextInt();
		}
		if(ans==1)
		{
			System.out.println("Enter data to be encryped: ");
			sc.nextLine();
			String s = sc.nextLine();
			l = s.length();
			for(i=0;i<l;i++)
			{
				ch = s.charAt(i);
				p = (int)ch - (int)a + 1;  //Here, the number corresponding to the letter is considered(This can be changed as per our needs).
				if(p == -64) //If there is a space between the words, it is considered 0.
				{
					p = 0;
				}
				t = t + String.valueOf(p);
				encrypt = encrypt + String.valueOf(p) + x;
			}
			System.out.println("After Encryption: " + t);
			//System.out.println("For the purpose of Decryption: |" + encrypt);
			
			System.out.println("--------");
			System.out.print("Would you like to decrypt?(y/n): ");
			char ans1 = sc.next().charAt(0);
			if(ans1=='y'||ans1=='Y')
			{
				ans=2;
			}
			else
			{
				System.out.println("You have exited the program!");
			}
		}
			
		if(ans==2)
			{
				System.out.println("Enter data to be decrypted(enclose each term with '|', eg: 3|2|5 = cbe, use 0 for space): ");
				encrypt = sc.next();
				//Decryption
				String ar[]=encrypt.split("\\|"); //Getting the value between two |.
				for(String temp:ar)
				{
					f = Integer.parseInt(temp); //Converting String to Integer.
					f = f + 96;
					if(f==96) //If value is 0, it provides a space gap.
					{
						k = ' ';
					}
					else
					{
						k = (char)f;
					}
					decrypt = decrypt + String.valueOf(k);
				}		
			System.out.println("After decryption: " + decrypt);
		}
		if(ans==3)
		{
			System.out.println("You have successfully exited the program");
		}
		sc.close();
	}
}