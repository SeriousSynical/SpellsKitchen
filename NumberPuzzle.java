import java.util.Scanner;
import java.util.Random;

public class NumberPuzzle
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        Random random = new Random();
        
        //variables
        int randomNumber;
        int guessedNumber;
        String message;
        boolean correct = false;

        //random number generator
        randomNumber = random.nextInt(1000) + 1;
        

        //System.out.println(x);
        System.out.println("You see a cabinet with a crow a top, ''Guess the correct number to pass'' screeches the crow");
        System.out.println("Time to spam numbers");
        System.out.println("Try a number between 1-1000 for the code");
        do
        {
            System.out.println("Guess a number again between 1-1000");
            guessedNumber = kb.nextInt();
            if(guessedNumber < randomNumber)//guess is low
            {
                message = guessedNumber + " is to low fool";
                System.out.println(message);
            }
            else if(guessedNumber > randomNumber)//guess is high
            {
                message = guessedNumber + " is to high fool";
                System.out.println(message);
            }
            else//guess is correct
            {
                message = guessedNumber + " is to correct";
                System.out.println(message);
                correct = true;

            }
        }while(correct == false);

        kb.close();
    }
 
}