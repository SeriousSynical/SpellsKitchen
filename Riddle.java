import java.util.Scanner;

public class   Riddle
{
    public static void RiddlePuzzle()
    {
        //Scanner
        Scanner kb = new Scanner(System.in);

        //Variables
        boolean solved = false;
        String answer = new String("egg");
        String response = new String();
        int helpingHand =0;

        //No hints
        while (solved == false && helpingHand<2)
        {
            System.out.println("What has to be broken before you can use it?");
            response = kb.next();

            if (response.equalsIgnoreCase(answer)) {
                solved = true;
                System.out.println("Such a wise thief...");
                //add final puzzle clue to inventory
            } else {
                System.out.println("You'll have to try again");
            }
            helpingHand++;
        }

        //Hint 1
        while (solved == false &&helpingHand<4)
        {
            System.out.println("What has to be broken before you can use it?");
            response = kb.next();

            if (response.equalsIgnoreCase(answer)) {
                solved = true;
                System.out.println("Good job...");
                //add final puzzle clue to inventory
            } else {
                System.out.println("You'll have to try again, it's a food item: ");
            }
            helpingHand++;
        }

        //Hint 2
        while (solved == false && helpingHand<6)
        {
            System.out.println("What has to be broken before you can use it?");
            response = kb.next();

            if (response.equalsIgnoreCase(answer)) {
                solved = true;
                System.out.println("...I suppose we can't all be as smart as the Wizard");
                //add final puzzle clue to inventory
            } else {
                System.out.println("You'll have to try again, it has to do with chickens: ");
            }
            helpingHand++;
        }

        //Hint 3
        while (solved == false){
            System.out.println("What has to be broken before you can use it?");
            response = kb.next();

            if (response.equalsIgnoreCase(answer)) {
                solved = true;
                System.out.println("Well...I mean... you got there eventually....I guess");
                //add final puzzle clue to inventory
            } else {
                System.out.println("You'll have to try again, it's only 3 letters: ");
            }
        }
        kb.close();
    }
}
