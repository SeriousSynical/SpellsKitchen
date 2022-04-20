import java.util.Scanner;

public class   Riddle
{
    public void RiddlePuzzle( Rooms room) 
    {
        //Scanner
        Scanner kb = new Scanner(System.in);

        //Variables
        boolean solved = false;
        String answer = new String("egg");
        String response = new String();
        int helpingHand = 0;
        int choice;
        System.out.println(room.npc.name + ": So you're the one that's been sneaking around.\nI heard you were trying " +
                "to get in to the chef's freezer.");
        System.out.println();
        System.out.println("1. Yeah, I need in that freezer!");
        System.out.println("2. No way! Im just new here. ");

        choice = kb.nextInt();

        if (choice == 1) 
        {

            System.out.println(room.npc.name+": Since you're honest i may have a riddle that will help..");

            //No hints
            while (solved == false && helpingHand < 2) 
            {
                System.out.println(room.npc.name + ": What has to be broken before you can use it? (Type answer " +
                        "below)");
                response = kb.next();

                if (response.equalsIgnoreCase(answer)) 
                {
                    solved = true;
                    System.out.println(room.npc.name + ": Such a wise thief...");
                    System.out.println("                      ████████      ");
                    System.out.println("                    ██        ██     ");
                    System.out.println("                  ██▒▒▒▒        ██   "); 
                    System.out.println("                ██▒▒▒▒▒▒      ▒▒▒▒██     ");
                    System.out.println("                ██▒▒▒▒▒▒      ▒▒▒▒██ ");
                    System.out.println("              ██  ▒▒▒▒        ▒▒▒▒▒▒██ ");                                                                      
                    System.out.println("              ██                ▒▒▒▒██ ");
                    System.out.println("            ██▒▒      ▒▒▒▒▒▒          ██ ");
                    System.out.println("            ██      ▒▒▒▒▒▒▒▒▒▒        ██ ");
                    System.out.println("            ██      ▒▒▒▒▒▒▒▒▒▒    ▒▒▒▒██ ");
                    System.out.println("            ██▒▒▒▒  ▒▒▒▒▒▒▒▒▒▒  ▒▒▒▒▒▒██");
                    System.out.println("              ██▒▒▒▒  ▒▒▒▒▒▒     ▒▒▒▒██ ");
                    System.out.println("              ██▒▒▒▒            ▒▒▒▒██ ");
                    System.out.println("                ██▒▒              ██ ");
                    System.out.println("                  ████        ████ ");
                    System.out.println("                      ████████");
                    System.out.println("");


                    //add final puzzle clue to inventory
                } 
                else 
                {
                    System.out.println(room.npc.name + ": You'll have to try again");
                }
                helpingHand++;
            }

            //Hint 1
            while (solved == false && helpingHand < 3) 
            {
                System.out.println(room.npc.name + ": What has to be broken before you can use it? (Type answer " +
                        "below)");
                response = kb.next();

                if (response.equalsIgnoreCase(answer)) 
                {
                    solved = true;
                    System.out.println(room.npc.name + ": Good job...");
                    //add final puzzle clue to inventory
                } 
                else 
                {
                    System.out.println(room.npc.name + ": You'll have to try again, it's a food item: ");
                }
                helpingHand++;
            }

            //Hint 2
            while (solved == false && helpingHand < 4) 
            {
                System.out.println(room.npc.name + ": What has to be broken before you can use it? (Type answer " +
                        "below)");
                response = kb.next();

                if (response.equalsIgnoreCase(answer)) 
                {
                    solved = true;
                    System.out.println(room.npc.name + ": ...I suppose we can't all be as smart as the Chef");
                    //add final puzzle clue to inventory
                } 
                else 
                {
                    System.out.println(room.npc.name + ": You'll have to try again, it has to do with chickens: ");
                }
                helpingHand++;
            }

            //Hint 3
            while (solved == false) 
            {
                System.out.println(room.npc.name + ": What has to be broken before you can use it? (Type answer " +
                        "below)");
                response = kb.next();

                if (response.equalsIgnoreCase(answer)) 
                {
                    solved = true;
                    System.out.println(room.npc.name + ": Well...I mean... you got there eventually....I guess");
                    //add final puzzle clue to inventory
                } 
                else 
                {
                    System.out.println(room.npc.name + ": My goodness man its an egg! ");
                    solved=true;
                }
            }
        }
        else if (choice == 2)
        {
            System.out.println(room.npc.name+": Being a thief is one thing, but being a liar is pathetic! Get away " +
                    "from me!");
        }
        else
        {
            System.out.println("Invalid selection");

        }

    }
}
