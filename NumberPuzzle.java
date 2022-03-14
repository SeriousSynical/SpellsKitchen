import java.util.Scanner;
import java.util.Random;

public class NumberPuzzle //extends character
{
    public void NumberPuzzle(Rooms room) {
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
            System.out.println("You see a cabinet with a crow a top");
            // System.out.println("Crow: Guess the correct number to pass" + name + "!!");
            //System.out.println(name +":" + " Time to spam numbers");
            System.out.println("Crow: Try a number between 1-1000 for the code");
            do {
                System.out.println("Crow: Guess a number again between 1-1000");
                guessedNumber = kb.nextInt();
                if (guessedNumber < randomNumber)//guess is low
                {
                    message = "Crow: " + guessedNumber + " is to low fool";
                    System.out.println(message);
                } else if (guessedNumber > randomNumber)//guess is high
                {
                    message = "Crow: " + guessedNumber + " is to high fool";
                    System.out.println(message);
                } else//guess is correct
                {
                    message = "Crow: " + guessedNumber + " is to correct";
                    System.out.println(message);
                    correct = true;

                    System.out.println("The " + room.roomName + " is now unlocked!");
                    room.locked=false;


                }
            } while (correct == false);

            //Add item to inventory


        }
    }

