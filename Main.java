import java.util.Scanner;

public class Main
{
    /*
    String[] actionArray = {"Inspect", "Use", "Eat", "Break"};
    String command = "";
    String action = "";
    String object = "";
    */

    public static void main(String[] args)
    {
        Character character = new Character("",Pronouns.masculine,"");
        Player player = new Player("",Pronouns.masculine,"");
        Rooms kitchenRoom = new Kitchen("Kitchen", "The room where all the food is prepped");
        Rooms pantry = new Pantry("Pantry", "A room that holds many of the ordinary ingredients");
        Rooms diningRoom = new DiningArea("Dining Room", "The room where all the evil goblins come to eat");
        Rooms magicShelf = new MagicShelf("The Magic Shelf", "A shelf that holds on the magical ingredients");


        System.out.println("");
        System.out.println("Welcome to Spells Kitchen");
        System.out.println("");
        System.out.println("Here you will search for the magical object");
        System.out.println("by finding clues and hints. GOODLUCK");
        System.out.println("");


        player.createPlayer();
        System.out.println(player.name);
        player.getName();
        System.out.println(player.name);
        System.out.println(kitchenRoom.roomDescription);



        boolean doorUnlocked = false;
        int choice;
        Scanner kb = new Scanner(System.in);

        while(doorUnlocked == false)
        {
            System.out.println("Select an action");
            System.out.println("\t 1. Inspect room ");
            System.out.println("\t 2. View inventory");
            System.out.println("\t 3. (other actions)");
            choice = kb.nextInt();
        

            switch (choice)
            {
                //Inspect room
                case 1:
                    int roomChoice;
                    
                    System.out.println("Select an area to inspect");
                    System.out.println("\t 1. The kitchen");
                    System.out.println("\t 2. The pantry");
                    System.out.println("\t 3. The dining area");
                    System.out.println("\t 4. Magic ingredient shelf");
                    System.out.println("\t 0. Go back");

                    roomChoice = kb.nextInt();
                
                    switch (roomChoice)
                    {
                        //kitchen
                        case 1:
                            kitchenChoice();
                            break;

                        //pantry
                        case 2:
                            pantryChoice();
                            break;

                        //dining
                        case 3:
                            diningChoice();
                            break;

                        //Magic shelf
                        case 4:
                            magicShelfChoice();
                            break;
                        
                        case 0:
                            break;

                        default:
                        
                        System.out.println("Going back");
                    
                    }
                    //do{}while(choice != 0);

                break;

                //View inventory
                case 2:
                    viewInventory();
                break;

                //Other actions
                case 3:
                    System.out.println("");
                    break;

                default:
                    System.out.println("Invalid");

            }//end Choice action
        }
        kb.close();
    }//End Main


    public static void kitchenChoice()
    {
        int actionChoice;
        System.out.println(kitchenRoom.roomName);
        System.out.println("Select an action");
        System.out.println("\t 1. Inspect room ");
        System.out.println("\t 2. Talk to (NPC) ");
        System.out.println("\t 3. View inventory");
        System.out.println("\t 4. (other actions)");

        actionChoice = kb.nextInt();
        switch (actionChoice)

        {
            //Kitchen Actions
            case 1:
                System.out.println(kitchenRoom.roomDescription);
                System.out.println(kitchenRoom.items);

                break;

            case 2:
                player.chat(player, kitchenRoom.npc);
                break;

            case 3:
                System.out.println(player.checkInventory());
                break;
        }
    }//end kitchenChoice()

    public static void pantryChoice()
    {
        int actionChoice2;
        System.out.println(kitchenRoom.roomName);
        System.out.println("Select an action");
        System.out.println("\t 1. Inspect room ");
        System.out.println("\t 2. Talk to (NPC) ");
        System.out.println("\t 3. View inventory");
        System.out.println("\t 4. (other actions)");

        actionChoice = kb.nextInt();
        switch (actionChoice)
        {
            //Pantry
            case 1:
                System.out.println(pantry.roomDescription);
                System.out.println(pantry.items);
                break;

            case 2:
                player.chat(player, pantry.npc);
                break;

            case 3:
                System.out.println(player.checkInventory());
                break;
        }
    }//end pantryChoice()

    public static void diningChoice()
    {
        int actionChoice3;
        System.out.println(diningRoom.roomName);
        System.out.println("Select an action");
        System.out.println("\t 1. Inspect room ");
        System.out.println("\t 2. Talk to (NPC) ");
        System.out.println("\t 3. View inventory");
        System.out.println("\t 4. (other actions)");

        actionChoice = kb.nextInt();
        switch (actionChoice)

        {
            //Dining Actions
            case 1:
                System.out.println(diningRoom.roomDescription);
                System.out.println(diningRoom.items);
                break;

            case 2:
                player.chat(player, diningRoom.npc);
                break;

            case 3:
                System.out.println(player.checkInventory());
                break;
        }
    }
    
    public static void magicShelfChoice()
    {
        int actionChoice4;
        System.out.println(magicShelf.roomName);
        System.out.println("Select an action");
        System.out.println("\t 1. Inspect room ");
        System.out.println("\t 2. Talk to (NPC) ");
        System.out.println("\t 3. View inventory");
        System.out.println("\t 4. (other actions)");

        actionChoice = kb.nextInt();
        switch (actionChoice)

        {
            //Kitchen Actions
            case 1:
                System.out.println(magicShelf.roomDescription);
                System.out.println(magicShelf.items);
                break;

            case 2:
                player.chat(player, magicShelf.npc);
                break;

            case 3:
                System.out.println(player.checkInventory());
                break;
        }
    }//magicShelfChoice()

    public static void viewInventory()
    {
        int itemChoice;

        System.out.println(player.checkInventory());
        System.out.println("Select inventory action");
        System.out.println("\t 1. Inspect item");
        System.out.println("\t 2. Use");
        System.out.println("\t 3. Eat");
        System.out.println("\t 4. Other");
        System.out.println("\t 0. Go back");

        itemChoice = kb.nextInt();
        switch (itemChoice)
        {
            //Inspect
            case 1:
                System.out.println(" Which Item do you want to check?");
                System.out.println(player.inventory.get(kb.nextInt()));
                break;

            //Use
            case 2:
                System.out.println("*Use item if condions are met use/fail to use*");

                break;

            //Eat
            case 3:
                System.out.println("*consuming certain foods do nothing, one will have a key piece embeded*");

                break;

            //Other
            case 4:
                System.out.println("Other actions");
                break;
            
            default:
            System.out.println("Error in Inventory action selection ");
        } 
    }


}//end Main