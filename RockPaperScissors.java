/*
Computer generates a random number
and the user selects one of the
options. The user gets to know the
computer
selection only when he selects one of
 the options. There will be series of
  3, and the wins are stored in a
  variable.
If the wins of any of the user will
be greater or equal to 2 then he wins
 the game! While and if else will be
 used.
 0 = Rock
 1 = Paper
 2 = Scissors
 */

import java.lang.Math;
import java.util.Scanner;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        byte choice,User_wins = 0, Com_wins = 0,count = 0;
        int min = 0, max = 2;


        while (count < 3)
        {
            int computer_choice = (int) (Math.random() * (max - min + 1) + min); //Random number by computer in a range
            System.out.println("""
                    Press 0 for Rock.
                    Press 1 for Paper.
                    Press 2 for Scissors.""");
            choice = scan.nextByte();
/*If statements for if the out of range values selected*/
            if (choice == 0 || choice == 1 || choice == 2)
            {   /*If statements for deciding the winner*/
                /*Tie detector*/
                if (choice == computer_choice)
                {
                    System.out.println("Your choice:" + choice);
                    System.out.println("Computer's choice: " + computer_choice + "\n");
                    System.out.println("Its a tie!");
                    System.out.println("Your score: " + User_wins);
                    System.out.println("Computer's score: " + Com_wins + "\n");
                    System.out.println("--------------------------");
                }
                /*User Win conditions*/
                else if ((choice == 1 && computer_choice == 0) || (choice == 0 && computer_choice == 2) || (choice == 2 && computer_choice == 1))
                {
                    User_wins++;
                    System.out.println("Your choice:" + choice);
                    System.out.println("Computer's choice:" + computer_choice + "\n");
                    System.out.println("Your score: " + User_wins);
                    System.out.println("Computer's score: " + Com_wins + "\n");
                    System.out.println("--------------------------");
                }
                /*Computer Win conditions*/
                else
                {
                    Com_wins++;
                    System.out.println("Your choice:" + choice);
                    System.out.println("Computer's choice:" + computer_choice + "\n");
                    System.out.println("Your score: " + User_wins);
                    System.out.println("Computer's score: " + Com_wins + "\n");
                    System.out.println("--------------------------");
                }
                /*End the game after 3 rounds*/
                count++;
                if (count == 3)
                {
                    break;
                }
            }
            /*If valid option is not selected*/
            else
            {
                System.out.println("Please select a valid option.");

            }
        }
        /*Calculating results*/
        if (User_wins >= 2)
        {
            System.out.println("\nYou won!");
        }
        else if ((User_wins == Com_wins) && (User_wins != 0))
        {
            System.out.println("\nGame ended with a tie!");
        }
        else
        {
            System.out.println("\nSorry, you've lost!");
        }


    }
}
