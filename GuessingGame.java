import java.util.*;
import java.lang.*;
public class GuessingGame 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my guessing game");
        System.out.println("Please guess a number between 1 - 100"); //Starts the game and ask user for input
        int personGuess = input.nextInt();
        int randomNumber = (int)((Math.random() * 100 - 1) + 1); //Computer generates number
        while(personGuess != randomNumber) // Checks if the numbers are not the same
        {
            /*If person input number is too high or low print 
              statement and ask for input again*/
            if(personGuess > randomNumber) 
            {
                System.out.println("Too high");
                personGuess = input.nextInt();
            }
            else if(personGuess < randomNumber)
            {
                System.out.println("Too low");
                personGuess = input.nextInt();
            }
        }
    }
}
