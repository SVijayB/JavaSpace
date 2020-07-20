package Miscellaneous;

import java.util.*;
class flames
{
    static String rmd(char str[]) 
    { 
        int n = str.length;
        int x = 0,j; 
        for (int i=0;i<n;i++) 
        { 
            for (j=0;j<i;j++)  
            { 
                if (str[i] == str[j]) 
                { 
                    break; 
                } 
            } 
            if (j == i)  
            { 
                str[x++] = str[i]; 
            } 
        } 
        return String.valueOf(Arrays.copyOf(str, x)); 
    } 
    public static void main(String args[])
    {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX FLAMES XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the first person(Do not provide spaces or any special characters): ");
        System.out.print("\t -> ");
        String a = sc.nextLine();
        char str1[] = a.toCharArray();
        a = rmd(str1);
        System.out.println("Enter the name of the second person(Do not provide spaces or any special characters): ");
        System.out.print("\t -> ");
        String b = sc.nextLine();
        char str2[] = b.toCharArray();
        b = rmd(str2);
        
        //System.out.println("String A after removing duplicate elements : " + a);
        //System.out.println("String B after removing duplicate elements : " + b);
        
        String cmn = "";
        for(int i=0;i<a.length();i++)
        {
            for(int j=0;j<b.length();j++)
            {
                if(a.charAt(i)==b.charAt(j))
                {
                    cmn = cmn + a.charAt(i);
                }
            }
        }

        for(int i=0;i<cmn.length();i++)
        {
            String ctr = cmn.charAt(i) + "";
            a = a.replace(ctr, "");
            b = b.replace(ctr, "");
        }

        String str = a+b;
        int l = str.length()-1;
        
        //System.out.println("Common alphabets between A and B : " + cmn);
        //System.out.println("Number of times the loop has to continue: " + l);

        String c = "FLAMES";
        int x = 6, pos=0;
        while(x>1)
		{
			for(int i=1;i<l;i++)
			{
				if(c.charAt(pos)!='/')
				{
					pos++;
                    if(pos==6)
                    {
                        pos=0;
                    }
				}
				else
				{
					pos++;
                    if(pos==6)
                    {
                        pos=0;
                    }
					i--;
				}
			}
			while(c.charAt(pos)=='/')
			{
				pos++;
                if(pos==6)
                {
                    pos=0;
                }
			}
			c=c.substring(0,pos)+"/"+c.substring(pos+1);
			x--;
        }

		char result = 0;
        for(int i=0;i<c.length();i++)
		{
			if(c.charAt(i)!='/')
			result = c.charAt(i);
        }
        System.out.println("RESULTS : ");
        if(result=='F')
        {
            System.out.println("\t -> Hey! You guys are gonna be Amazing Friends!!");
        }
        else if(result=='L')
        {
            System.out.println("\t -> Look at that! You guys are so gonna Love each other!!!");
        }
        else if(result=='A')
        {
            System.out.println("\t -> You both are gonna be affectionate about each other");
        }
        else if(result=='M')
        {
            System.out.println("\t -> Look at that, You would end up marrying each other? Well Congrats!");
        }
        else if(result=='E')
        {
            System.out.println("\t -> Ha, Looks like the odds are against you both. You both are gonna be enemies apparently XD");
        }
        else if(result=='S')
        {
            System.out.println("\t -> Well, Brother or Sister from another mother! Siblingsss!!!");
        }
        sc.close();
    }
}