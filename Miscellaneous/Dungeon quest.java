package Miscellaneous;

// A Text based game I've worked on.
import java.util.*;
class game
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String enemies[] = new String[]{"Wild Dhanth","Mushroom warrior","Wise Old Owl","Dangerous Camel","Assassin Spider","Scary Ghost","Unfunny Jamba","Bulky Beast","Don"};
        int maxEnemyHealth = 75;

        int health = 100,given=0;
        String attack[] = new String[]{"Slash","Rock throw","Metal Claw","Power-Up Punch","Raging Cannon"};
        String message = "";
        int pp[] = new int[]{10,7,6,8,5};
        int temp[] = new int[]{10,7,6,8,5};
        int chocobar[] = new int[]{5,3,2,4,1};
        int ppfinal = 0;
        int swordDmg = 0;
        String swordName = "";
        int s = 0;

        int numHealthPotions = 3;
        int heal = 30;
        int healthPotionChance = 25;

        int choco = 0;
        int drink =0;

        int money = 0;
        int reward = 0;
        int maxMoney1 = 5;
        int maxMoney2 = 10;
        int maxMoney3 = 20;
        int maxMoney4 = 30;

        String enemyAtks1[] = new String[]{"Awkward Stare","Spit","Bite","Thrash","Tackle"};
        int enemyAtks1dmg[] = new int[]{6,16,19,14,15};
        String enemyAtks2[] = new String[]{"Poison","Toxic Fungi","Soul Decay","Symbiosis"};
        int enemyAtks2dmg[] = new int[]{16,14,19,8};
        String enemyAtks3[] = new String[]{"Wing attack","Gust","Peck","Scratch","Book Smash"};
        int enemyAtks3dmg[] = new int[]{11,4,12,14,19};
        String enemyAtks4[] = new String[]{"Stomp","Kick","Bite","Dash","Spit"};
        int enemyAtks4dmg[] = new int[]{9,6,13,8,14};
        String enemyAtks5[] = new String[]{"Poison","Web Attack","Poison Web","Fang Attack"};
        int enemyAtks5dmg[] = new int[]{15,9,13,16};
        String enemyAtks6[] = new String[]{"Confusion","Telekinesis","Hypnosis","Dark Pulse","Night Shade"};
        int enemyAtks6dmg[] = new int[]{6,12,8,19,13};
        String enemyAtks7[] = new String[]{"Karate Chop","Seismic Toss","Brick Break","Bad Joke","Acrobatics"};
        int enemyAtks7dmg[] = new int[]{16,12,8,21,4};
        String enemyAtks8[] = new String[]{"Bulk Slam","Dynamic Punch","Pound","Wake-Up Slap","Rock Throw"};
        int enemyAtks8dmg[] = new int[]{12,11,6,9,13};
        String enemyAtks9[] = new String[]{"Aura Sphere","Roar","Ancient Power","Cosmic Toss","Speed Dash"};
        int enemyAtks9dmg[] = new int[]{16,5,8,19,16};
        String enemyAtk = "";
        int enemyAtkDmg = 0;
        int pos = 0;

        boolean running = true;
        boolean shopping = true;
        boolean sword = true;

        System.out.println();
        System.out.println("Welcome to the War Zone!");

        GAME:
        while(running)
        {
            System.out.println("-------------------------------------------------------");
            int enemyHealth = rand.nextInt(maxEnemyHealth);
            int eh = enemyHealth;
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\t# " + enemy + " appeared! #\n");

            while(enemyHealth>0)
            {
                System.out.println("\tYour Health: " + health);
                System.out.println("\t" + enemy + "'s Health: " + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1)Attack");
                System.out.println("\t2)Drink Health Potion");
                System.out.println("\t3)Eat Chocolate bar");
                System.out.println("\t4)Drink Energy Drink");
                System.out.println("\t5)Run Away");

                int ans = sc.nextInt();
                if(ans==1)
                {
                    if(enemy==enemies[0])
                    {
                        enemyAtk = enemyAtks1[rand.nextInt(enemyAtks1.length)];
                        for (int i=0;i<enemyAtks1.length;i++)
                        {
                            if (enemyAtks1[i]==enemyAtk)
                            {
                                pos = i;
                                break;
                            }
                        }
                        enemyAtkDmg = enemyAtks1dmg[pos];
                    }
                    else if(enemy==enemies[1])
                    {
                        enemyAtk = enemyAtks2[rand.nextInt(enemyAtks2.length)];
                        for (int i=0;i<enemyAtks2.length;i++)
                        {
                            if (enemyAtks2[i]==enemyAtk)
                            {
                                pos = i;
                                break;
                            }
                        }
                        enemyAtkDmg = enemyAtks2dmg[pos];
                    }
                    else if(enemy==enemies[2])
                    {
                        enemyAtk = enemyAtks3[rand.nextInt(enemyAtks3.length)];
                        for (int i=0;i<enemyAtks3.length;i++)
                        {
                            if (enemyAtks3[i]==enemyAtk)
                            {
                                pos = i;
                                break;
                            }
                        }
                        enemyAtkDmg = enemyAtks3dmg[pos];
                    }
                    else if(enemy==enemies[3])
                    {
                        enemyAtk = enemyAtks4[rand.nextInt(enemyAtks4.length)];
                        for (int i=0;i<enemyAtks4.length;i++)
                        {
                            if (enemyAtks4[i]==enemyAtk)
                            {
                                pos = i;
                                break;
                            }
                        }
                        enemyAtkDmg = enemyAtks4dmg[pos];
                    }
                    else if(enemy==enemies[4])
                    {
                        enemyAtk = enemyAtks5[rand.nextInt(enemyAtks5.length)];
                        for (int i=0;i<enemyAtks5.length;i++)
                        {
                            if (enemyAtks5[i]==enemyAtk)
                            {
                                pos = i;
                                break;
                            }
                        }
                        enemyAtkDmg = enemyAtks5dmg[pos];
                    }
                    else if(enemy==enemies[5])
                    {
                        enemyAtk = enemyAtks6[rand.nextInt(enemyAtks6.length)];
                        for (int i=0;i<enemyAtks6.length;i++)
                        {
                            if (enemyAtks6[i]==enemyAtk)
                            {
                                pos = i;
                                break;
                            }
                        }
                        enemyAtkDmg = enemyAtks6dmg[pos];
                    }
                    else if(enemy==enemies[6])
                    {
                        enemyAtk = enemyAtks7[rand.nextInt(enemyAtks7.length)];
                        for (int i=0;i<enemyAtks7.length;i++)
                        {
                            if (enemyAtks7[i]==enemyAtk)
                            {
                                pos = i;
                                break;
                            }
                        }
                        enemyAtkDmg = enemyAtks7dmg[pos];
                    }
                    else if(enemy==enemies[7])
                    {
                        enemyAtk = enemyAtks8[rand.nextInt(enemyAtks8.length)];
                        for (int i=0;i<enemyAtks8.length;i++)
                        {
                            if (enemyAtks8[i]==enemyAtk)
                            {
                                pos = i;
                                break;
                            }
                        }
                        enemyAtkDmg = enemyAtks8dmg[pos];
                    }
                    else if(enemy==enemies[8])
                    {
                        enemyAtk = enemyAtks9[rand.nextInt(enemyAtks9.length)];
                        for (int i=0;i<enemyAtks9.length;i++)
                        {
                            if (enemyAtks9[i]==enemyAtk)
                            {
                                pos = i;
                                break;
                            }
                        }
                        enemyAtkDmg = enemyAtks9dmg[pos];
                    }

                    System.out.println("\tYou've Chosen to attack");
                    System.out.println("\tPick an attack");
                    for(int i=0;i<attack.length;i++)
                    {
                        System.out.println("\t\t" + (i+1) + ")" + attack[i]);
                    }
                    int ans2 = sc.nextInt();

                    if(ans2==1)
                    {
                        if(pp[0]>0)
                        {
                            message = "You slash out with your sword";
                            pp[0] = pp[0]-1;
                            ppfinal = pp[0];

                            if(s==0)
                            {
                                swordDmg = 0;
                            }
                            else if(s==1)
                            {
                                swordDmg = 3;
                                swordName = "Brass Sword";
                            }
                            else if(s==2)
                            {
                                swordDmg = 5;
                                swordName = "Silver Sword";
                            }
                            else if(s==3)
                            {
                                swordDmg = 7;
                                swordName = "Golden Sword";
                            }
                            else if(s==4)
                            {
                                swordDmg = 9;
                                swordName = "Platinum Sword";
                            }
                            given = 18 + swordDmg;
                        }
                        else
                        {
                            message = "You are too week to slash anymore";
                            given = 0;
                        }
                    }
                    else if(ans2==2)
                    {
                        if(pp[1]>0)
                        {
                            given = 21;
                            message = "You pick up rocks next to you and throw them";
                            pp[1] = pp[1]-1;
                            ppfinal = pp[1];
                        }
                        else
                        {
                            message = "You are too tired to pick the rocks anymore";
                            given = 0;
                        }
                    }
                    else if(ans2==3)
                    {
                        if(pp[2]>0)
                        {
                            given = 24;
                            message = "You use your prosthetic arm and attack";
                            pp[2] = pp[2]-1;
                            ppfinal = pp[2];
                        }
                        else
                        {
                            message = "You are too tired to move your arms anymore";
                            given = 0;
                        }
                    }
                    else if(ans2==4)
                    {
                        if(pp[3]>0)
                        {
                            given = 22;
                            message = "You use rocket punch";
                            pp[3] = pp[3]-1;
                            ppfinal = pp[3];
                        }
                        else
                        {
                            message = "You are too tired to punch";
                            given = 0;
                        }
                    }
                    else if(ans2==5)
                    {
                        if(pp[4]>0)
                        {
                            given = 28;
                            message = "You take out your hidden weapon and shoot";
                            pp[4] = pp[4]-1;
                            ppfinal = pp[4];
                        }
                        else
                        {
                            message = "You've run out of bullets";
                            given = 0;
                        }
                    }

                    enemyHealth = enemyHealth - given;
                    health = health - enemyAtkDmg;

                    System.out.println("\t> " + message);
                    System.out.println("\t> You attacked " + enemy + " for " + given + " damage!");
                    if(s!=0&&ans2==1)
                    {
                        System.out.println("\t> Thanks to your " + swordName + ", You dealt an addition damage of " + swordDmg);
                    }
                    System.out.println("\t> You can use " + attack[ans2-1] + " " + ppfinal + " more time(s)");
                    System.out.println("\t> " + enemy + " used " + enemyAtk + " and damaged you for " + enemyAtkDmg);


                    if(health<=0)
                    {
                        System.out.println("\t> You have taken too much damage, You fainted during the battle!");
                        break;
                    }
                }
                else if(ans==2)
                {
                    if(numHealthPotions>0)
                    {
                        health = health + heal;
                        numHealthPotions = numHealthPotions - 1;
                        if(health>=100)
                        {
                            System.out.println("\t> You drink a health potion and regain your maximum health.");
                            health = 100;
                            System.out.println("\t> You now have " + health + "% health.");
                            System.out.println("\t> You have " + numHealthPotions + " Health Potions left.\n");
                        }
                        else
                        {
                            System.out.println("\t> You drink a health potion, healing for " + heal + ".");
                            System.out.println("\t> You now have " + health + "% health.");
                            System.out.println("\t> You have " + numHealthPotions + " Health Potions left.\n");
                        }
                    }
                    else
                    {
                        System.out.println("\t> You have no Health Potions left! Kill the enemy, if you are lucky enough, you might get one!");
                    }
                }
                else if(ans==3)
                {
                    if(choco>0)
                    {
                        System.out.println("\t> You eat a chocolate bar and regain little energy");
                        for(int i=0;i<pp.length;i++)
                        {
                            pp[i] = pp[i] + chocobar[i];
                        }
                    }
                    else
                    {
                        System.out.println("\t> You dont seem to have any Chocolate bar, Consider getting one from the shop after the battle");
                    }
                }
                else if(ans==4)
                {
                    if(drink>0)
                    {
                        System.out.println("\t> You drink an Energy drink and replenish your energy");
                        for(int i=0;i<pp.length;i++)
                        {
                            pp[i] = temp[i];
                        }
                    }
                    else
                    {
                        System.out.println("\t> You dont seem to have any Energy Drink, Consider getting one from the shop after the battle");
                    }
                }
                else if(ans==5)
                {
                    System.out.println("\tYou have run away from " + enemy + "!");
                    continue GAME;
                }
                else
                {
                    System.out.println("\tInvalid Input! Try again");
                }
            }

            if(health<=0)
            {
                System.out.println("You were dropped off to the nearby healing place. Don't Exhaust yourself too much!!");
                break;
            }

            if(eh>0&&eh<=15)
            {
                reward = rand.nextInt(maxMoney1);
            }
            if(eh>15&&eh<=25)
            {
                reward = rand.nextInt((maxMoney2 - maxMoney1) + 1) + maxMoney1; //Generating random numbers with range = ((max - min) + 1) + min;
            }
            if(eh>25&&eh<=50)
            {
                reward = rand.nextInt((maxMoney3 - maxMoney2) + 1) + maxMoney2;
            }
            if(eh>50&&eh<=75)
            {
                reward = rand.nextInt((maxMoney4 - maxMoney3) + 1) + maxMoney3;
            }
            money = money + reward;

            System.out.println("-------------------------------------------------------");
            System.out.println(" # " + enemy + " was slain! # ");
            System.out.println(" # You have " + health + "% Health left #");
            System.out.println(" # Congrats! You've received " + reward + "$ for slaying " + enemy + " !!");
            System.out.println(" # You now have " + money + "$");
            if(rand.nextInt(100)<healthPotionChance)
            {
                numHealthPotions = numHealthPotions + 1;
                System.out.println(" # The Enemy Dropped a Health Potion! # ");
                System.out.println(" # You now have " + numHealthPotions + " health potion(s) # ");
            }
            System.out.println("-------------------------------------------------------");
            System.out.println("What Would you like to do now?");
            System.out.println("1) Continue Fighting");
            System.out.println("2) Visit the Shop");
            System.out.println("3) Exit the War Zone");

            int ans = sc.nextInt();

            while(ans!=1 && ans!=2 && ans!=3)
            {
                System.out.println("\tInvalid input! Try again");
                ans = sc.nextInt();
            }

            if(ans==1)
            {
                System.out.println("You pick up your swords and run further into the zone");
            }
            else if(ans==2)
            {
                System.out.println("\t> You choose to visit a nearby store");
                System.out.println("\t> Welcome to Anesthesia, A Store for all your needs");
                while(shopping)
                {
                    System.out.println("\tWhich of the following would you like to buy?");
                    System.out.println("\t\t1)Health Potions");
                    System.out.println("\t\t2)Swords");
                    System.out.println("\t\t3)Chocolate Bar");
                    System.out.println("\t\t4)Energy Drink");
                    System.out.println("\t5)Exit Store");
                    System.out.println("> You currently have " + money + "$ left");
                    int ans1 = sc.nextInt();

                    while(ans1!=1&&ans1!=2&&ans1!=3&&ans1!=4&&ans1!=5)
                    {
                        System.out.println("\tInvalid Input! Try again");
                        ans1 = sc.nextInt();
                    }

                    if(ans1==1)
                    {
                        System.out.println("\t> How many Health Potions would you like to buy?(50$ each)");
                        System.out.println("\t> You currently have " + money + "$");
                        int n = sc.nextInt();
                        if(money>=(n*50))
                        {
                            System.out.println("\t> You have purchased " + n + " Health Potions for " + (n*50) + "$\n");
                            money = money-(n*50);
                            numHealthPotions = numHealthPotions + n;
                        }
                        else
                        {
                            System.out.println("\tYou seem to be low on money, slay beasts to earn more\n");
                        }
                    }
                    if(ans1==2)
                    {
                        System.out.println("\tBuying a Sword would increase your base damage against enemies.");
                        System.out.println("\tNote: Swords only increase damage for the attack Slash");
                        while(sword)
                        {
                            System.out.println("\tWhich of the following swords would you like to buy?");
                            System.out.println("\t\t1)Brass Sword    (100$)");
                            System.out.println("\t\t2)Silver Sword   (150$)");
                            System.out.println("\t\t3)Gold Sword     (250$)");
                            System.out.println("\t\t4)Platinum Sword (400$)");
                            System.out.println("\t5)Exit Sword Section");
                            int ans2 = sc.nextInt();
                            while(ans2!=1&&ans2!=2&&ans2!=3&&ans2!=4&&ans2!=5)
                            {
                                System.out.println("\tInvalid Input! Try again");
                                ans2 = sc.nextInt();
                            }
                            if(ans2==1)
                            {
                                if(money>=100)
                                {
                                    System.out.println("\tYou chose the brass sword");
                                    System.out.println("\t> You spent 100$ buying the Brass sword");
                                    System.out.println("\t> Your base damage increases by 17%");
                                    money = money - 100;
                                    System.out.println("\t> You currently have " + money + "$");
                                    s = 1;
                                }
                                else
                                {
                                    System.out.println("\tYou seem to be low on money, slay beasts to earn more\n");
                                }
                            }
                            if(ans2==2)
                            {
                                if(money>=150)
                                {
                                    System.out.println("\tYou chose the Silver sword");
                                    System.out.println("\t> You spent 150$ buying the Silver sword");
                                    System.out.println("\t> Your base damage increases by 28%");
                                    money = money - 150;
                                    System.out.println("\t> You currently have " + money + "$");
                                    s = 2;
                                }
                                else
                                {
                                    System.out.println("\tYou seem to be low on money, slay beasts to earn more\n");
                                }
                            }
                            if(ans2==3)
                            {
                                if(money>=250)
                                {
                                    System.out.println("\tYou chose the Gold sword");
                                    System.out.println("\t> You spent 250$ buying the Gold sword");
                                    System.out.println("\t> Your base damage increases by 39%");
                                    money = money - 250;
                                    System.out.println("\t> You currently have " + money + "$");
                                    s = 3;
                                }
                                else
                                {
                                    System.out.println("\tYou seem to be low on money, slay beasts to earn more\n");
                                }
                            }
                            if(ans2==4)
                            {
                                if(money>=400)
                                {
                                    System.out.println("\tYou chose the Platinum sword");
                                    System.out.println("\t> You spent 400$ buying the Platinum sword");
                                    System.out.println("\t> Your base damage increases by 50%");
                                    money = money - 400;
                                    System.out.println("\t> You currently have " + money + "$");
                                    s = 4;
                                }
                                else
                                {
                                    System.out.println("\tYou seem to be low on money, slay beasts to earn more\n");
                                }
                            }
                            if(ans2==5)
                            {
                                System.out.println("You have left the sword section");
                                break;
                            }
                        }
                    }
                    if(ans1==3)
                    {
                        System.out.println("\tChocolate bars increase a small amount of your energy thus increasing your ability to use attcks");
                        System.out.println("\tHow many Chocolate bars would you like to buy?(50$ each)");
                        int n = sc.nextInt();
                        if(money>(n*50))
                        {
                            System.out.println("\t> You have purchased " + n + " Chocolate Bars for " + (n*50) + "$\n");
                            money = money-(n*50);
                            choco = choco + 1;
                        }
                        else
                        {
                            System.out.println("\tYou seem to be low on money, slay beasts to earn more\n");
                        }
                    }
                    if(ans1==4)
                    {
                        System.out.println("\tEnergy Drinks replenish your energy thus maximising your ability to use attcks");
                        System.out.println("\tHow many Energy Drinks would you like to buy?(200$ each)");
                        int n = sc.nextInt();
                        if(money>(n*200))
                        {
                            System.out.println("\t> You have purchased " + n + " Chocolate Bars for " + (n*200) + "$\n");
                            money = money-(n*200);
                            drink = drink + 1;
                        }
                        else
                        {
                            System.out.println("\tYou seem to be low on money, slay beasts to earn more\n");
                        }
                    }
                    if(ans1==5)
                    {
                        System.out.println("\tThanks For Visiting the Store!");
                        System.out.println("\tYou walk back to the dungeon");
                        break;
                    }
                }
            }
            else if(ans==3)
            {
                System.out.println("You exit the war zone, satisfied with the beast(s) you've slain! ");
                break;
            }
        }

        System.out.println("#######################");
        System.out.println("# THANKS FOR PLAYING! #");
        System.out.println("#######################");
        sc.close();
    }
}
