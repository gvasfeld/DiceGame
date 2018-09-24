
import java.util.Scanner;
/**
 * Write a description of class DieRunner here.
 *
 * @author (Greg Vasfeld)
 * @version (1.1 or Sep 23, 2018)
 */
public class DieRunner
{
     public static void main (String [] args)

    {
        System.out.println("\n\n\nStarting a new Game");
        Die die1 = new Die("1");
        Die die2 = new Die("2");
        int initialRoll=0;
        int score=0;
        int numIncorrect=0;
        int currentRoll=0;
        int lastRoll=0;
        Scanner scan = new Scanner(System.in);

        initialRoll = die1.getValue() + die2.getValue();
        currentRoll = initialRoll;
        lastRoll = initialRoll;

        System.out.println(die1);
        System.out.println(die2);
        System.out.println("Your initial roll is a(n):" + initialRoll);
        System.out.println();

         while(numIncorrect<3)
        {
            System.out.println("Do you think your next roll will be higher,");
            System.out.println("lower,or the same as this roll?(h/l/s)");
            String answer = scan.next();

            switch (answer)
            {
                case "l":
                   // System.out.println("You entered l");

                    //Rolling dice
                    die1.roll();
                    die2.roll();

                    //Printing face values of each die
                    System.out.println(die1);
                    System.out.println(die2);

                    //Calculating current roll
                    currentRoll = die1.getValue() + die2.getValue();

                    //Printing total value of current roll
                    System.out.println("Your new roll is a(n):" + currentRoll);

                    //Compare last roll to current roll
                    if (currentRoll < lastRoll )
                    {
                        score=score+1;
                        System.out.println("Correct!");
                    }
                    else
                    {
                        numIncorrect=numIncorrect+1;
                        System.out.println("Sorry,that is not correct");
                    }
                    //Printing your Score
                    System.out.println();
                    System.out.println("Score:" + score + "     Incorrect Guesses:" + numIncorrect);

                    //Printing total value of the last roll
                    System.out.println("Last roll was:" + currentRoll);
                    System.out.println();

                    //Setting last roll to current roll
                    lastRoll=currentRoll;

                    break;

                case "h":
                    //System.out.println("You entered h");
                    //Rolling dice
                    die1.roll();
                    die2.roll();

                    //Printing face values of each die
                    System.out.println(die1);
                    System.out.println(die2);

                    //Calculating current roll
                    currentRoll = die1.getValue() + die2.getValue();

                    //Printing total value of current roll
                    System.out.println("Your new roll is a(n):" + currentRoll);

                    //Compare last roll to current roll
                    if (currentRoll > lastRoll )
                    {
                        score=score+1;
                        System.out.println("Correct!");
                    }
                    else
                    {
                        numIncorrect=numIncorrect+1;
                        System.out.println("Sorry,that is not correct");
                    }
                    //Printing your Score
                    System.out.println();
                    System.out.println("Score:" + score + "     Incorrect Guesses:" + numIncorrect);

                    //Printing total value of the last roll
                    System.out.println("Last roll was:" + currentRoll);
                    System.out.println();

                    //Setting last roll to current roll
                    lastRoll=currentRoll;

                    break;

                case "s":
                    //System.out.println("You entered s");
                    //Rolling dice
                    die1.roll();
                    die2.roll();

                    //Printing face values of each die
                    System.out.println(die1);
                    System.out.println(die2);

                    //Calculating current roll
                    currentRoll = die1.getValue() + die2.getValue();

                    //Printing total value of current roll
                    System.out.println("Your new roll is a(n):" + currentRoll);

                    //Compare last roll to current roll
                    if (currentRoll == lastRoll )
                    {
                        score=score+1;
                        System.out.println("Correct!");
                    }
                    else
                    {
                        numIncorrect=numIncorrect+1;
                        System.out.println("Sorry,that is not correct");
                    }
                    //Printing your Score
                    System.out.println();
                    System.out.println("Score:" + score + "     Incorrect Guesses:" + numIncorrect);

                    //Printing total value of the last roll
                    System.out.println("Last roll was:" + currentRoll);
                    System.out.println();

                    //Setting last roll to current roll
                    lastRoll=currentRoll;

                    break;

                default:
                    System.out.println();
                    System.out.println("Please enter l for lower, h for higheer or s for same.");
                    System.out.println();
                    continue;
            }
        }
        System.out.println("Your final score is: " + score);
        System.out.println("Game Over");
    }
}