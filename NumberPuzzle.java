import java.util.Scanner;
import java.util.Random;

public class NumberPuzzle //extends character
{
    public static void NumberPuzzle()
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

        //random insult generator
        String[] insults = {"Wrong number fool..." ,"Your mom could guess better...", 
                            "Don't you have a brain?", "Lost your head?", "Disgrace..."};
        String insult = insults[(int) (Math.random() * insults.length)];


        //System.out.println(x);
        System.out.println("You see a cabinet with a crow a top");
        System.out.println("Crow: Try a number between 1-1000 for the code");


        do
        {
            System.out.println("Crow: Guess a number again between 1-1000");
            guessedNumber = kb.nextInt();
            if(guessedNumber < randomNumber)//guess is low
            {
                message = "Crow: " + guessedNumber + " is to low..." + insult ;
                System.out.println(message);
            }
            else if(guessedNumber > randomNumber)//guess is high
            {
                message = "Crow: " + guessedNumber + " is to high..." + insult;
                System.out.println(message);
            }
            else//guess is correct
            {
                message = "Crow: " + guessedNumber + " is to correct...";
                System.out.println(message);
                correct = true;

            }
        }while(correct == false);

    //Add item to inventory
    
        kb.close();
    }
 
}
