import java.util.Scanner;


public class Main
{

    public static void main(String[] args) throws InterruptedException
    {
    
        Character character = new Character("",Pronouns.masculine,"");
        //Player player = new Player("",Pronouns.masculine,"");
        Rooms kitchenRoom = new Kitchen("Kitchen", "The room where all the food is prepped");
        Rooms pantry = new Pantry("Pantry", "A room that holds many of the ordinary ingredients");
        Rooms diningRoom = new DiningArea("Dining Room", "The room where all the evil goblins come to eat");
        Rooms magicShelf = new MagicShelf("The Magic Shelf", "A shelf that holds on the magical ingredients");
        pantry.locked=true;
        diningRoom.locked=true;
        magicShelf.locked=true;



        System.out.println("Welcome to...");

        System.out.println("█████████████████████████████████████████████████████████████████████████████████" + 
                           "\n█─▄▄▄▄█▄─▄▄─█▄─▄▄─█▄─▄███▄─▄███─▄▄▄▄█████▄─█─▄█▄─▄█─▄─▄─█─▄▄▄─█─█─█▄─▄▄─█▄─▀█▄─▄█"+
                           "\n█▄▄▄▄─██─▄▄▄██─▄█▀██─██▀██─██▀█▄▄▄▄─██████─▄▀███─████─███─███▀█─▄─██─▄█▀██─█▄▀─██"+
                           "\n▀▄▄▄▄▄▀▄▄▄▀▀▀▄▄▄▄▄▀▄▄▄▄▄▀▄▄▄▄▄▀▄▄▄▄▄▀▀▀▀▀▄▄▀▄▄▀▄▄▄▀▀▄▄▄▀▀▄▄▄▄▄▀▄▀▄▀▄▄▄▄▄▀▄▄▄▀▀▄▄▀");
        System.out.println("");
        System.out.println("Here you will search for the magical object");
        System.out.println("by finding clues and hints. GOODLUCK");
        System.out.println("");

     

        Player player = new Player("",Pronouns.masculine,"").createPlayer();


        boolean doorUnlocked = false;
        int choice;
        Scanner kb = new Scanner(System.in);

        while(doorUnlocked == false)
        {
            System.out.println("Select an action");
            System.out.println("\t 1. Inspect room ");
            System.out.println("\t 2. View inventory");
            System.out.println("\t 3. (The freezer/'exit')");
            choice = kb.nextInt();
        

            switch (choice)
            {
                //Inspect room
                case 1:
                    int roomChoice;
                    boolean goBack = false;

                    while(goBack == false)
                    {
                        System.out.println();
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
                                int actionChoice;
                                boolean goBackFromKitchen = false;
                                while(goBackFromKitchen == false) {

                                    //System.out.println(kitchenRoom.roomName);
                                    System.out.println(" █▄▀ █ ▀█▀ █▀▀ █░█ █▀▀ █▄░█" +
                                                     "\n █░█ █ ░█░ █▄▄ █▀█ ██▄ █░▀█");
                                    System.out.println();
                                    System.out.println("Select an action");
                                    System.out.println("\t 1. Inspect room ");
                                    System.out.println("\t 2. Talk to (NPC) ");
                                    System.out.println("\t 3. View inventory");
                                    System.out.println("\t 4. Bird???");
                                    System.out.println("\t 0. Go Back");

                                    actionChoice = kb.nextInt();
                                    switch (actionChoice) {
                                        //Kitchen Actions
                                        case 1:
                                            int inspectChoice;
                                            boolean goBackFromInspectKitchen = false;
                                                    while(goBackFromInspectKitchen ==false) {
                                                        if (kitchenRoom.objects.size()<2)
                                                        {
                                                            System.out.println(kitchenRoom.roomDescription2);
                                                        }
                                                        else
                                                        {
                                                            System.out.println(kitchenRoom.roomDescription);
                                                        }
                                                        System.out.println();
                                                        if (kitchenRoom.items.size() >0)
                                                        {
                                                            System.out.println("The Items in the room are");
                                                            kitchenRoom.listItems();
                                                        }
                                                        else
                                                        {
                                                            System.out.println("There are no more items of interest in this room");
                                                        }
                                                        System.out.println();
                                                        if (kitchenRoom.objects.size()>0)
                                                        {
                                                            System.out.println("Some other interesting things are ");
                                                            System.out.println(kitchenRoom.objects);
                                                        }
                                                        else
                                                        {
                                                            System.out.println("There are no interesting objects left in this room");
                                                        }
                                                        System.out.println("\t 1. Add Item to Inventory");
                                                        System.out.println("\t 0. Go Back");

                                                        inspectChoice = kb.nextInt();
                                                        switch (inspectChoice) {
                                                            case 1:
                                                                kitchenRoom.takeItemFromRoom(player);
                                                                break;

                                                            case 0:
                                                                goBackFromInspectKitchen = true;
                                                                System.out.println();
                                                                System.out.println("--Back to kitchen--");
                                                                break;

                                                            default:
                                                                System.out.println("Try again");
                                                                break;
                                                        }

                                                        break;
                                                    }
                                                    break;
                                        case 2:
                                            player.chat(player, kitchenRoom.npc);
                                            break;

                                        /*case 3:
                                            System.out.println();
                                            System.out.println("Inventory Items");
                                            System.out.println(player.checkInventory());
                                            break;*/
                                        case 3:
                                            int itemChoice1;
                                            System.out.println();
                                            System.out.println("█ █▄░█ █░█ █▀▀ █▄░█ ▀█▀ █▀█ █▀█ █▄█    █ ▀█▀ █▀▀ █▀▄▀█ █▀" +
                                                             "\n█ █░▀█ ▀▄▀ ██▄ █░▀█ ░█░ █▄█ █▀▄ ░█░    █ ░█░ ██▄ █░▀░█ ▄█");
                                            System.out.println();                    
                                            System.out.println(player.checkInventory());
                                            System.out.println("Select inventory action");
                                            System.out.println("\t 1. Inspect item");
                                            System.out.println("\t 2. Use");
                                            System.out.println("\t 3. Eat");
                                            System.out.println("\t 4. Break");
                                            System.out.println("\t 0. Go back");

                                            itemChoice1 = kb.nextInt();
                                            switch (itemChoice1)
                                            {
                                                //Inspect
                                                case 1:
                                                    System.out.println(" Which Item do you want to check?");
                                                    player.listInventory();
                                                    System.out.println(player.inventory.get(kb.nextInt()).description);
                                                    break;

                                                //Use
                                                case 2:
                                                    if (player.inventory.size()>0 && kitchenRoom.objects.size()>0) {
                                                        System.out.println(" Which Item do you want to use and what do you want to use it on?");
                                                        player.listInventory();
                                                        kitchenRoom.listInteractiveObjects();
                                                        player.useItem(player, player.inventory.get(kb.nextInt()), kitchenRoom.objects.get(kb.nextInt()), kitchenRoom);
                                                    }
                                                    else if (player.inventory.size()<=0 && kitchenRoom.objects.size()>0)
                                                    {
                                                        System.out.println(player.name + ": What am i going to use? Ive got nothing in my bag..");
                                                    }
                                                    else
                                                    {
                                                        System.out.println(player.name + ": There isnt anything  " +
                                                                "left in here to interact with");
                                                    }

                                                    break;

                                                //Eat
                                                case 3:
                                                    player.listInventory();
                                                    player.eat(player, player.inventory.get(kb.nextInt()));

                                                    break;

                                                //Break
                                                case 4:
                                                    System.out.println("Fix Break items");

                                                    break;

                                                default:
                                                    System.out.println("Error in Inventory action selection ");
                                            }
                                            break;

                                        case 4:
                                            NumberPuzzle numberPuzzle2 = new NumberPuzzle();
                                            numberPuzzle2.NumberPuzzle(pantry);

                                            break;

                                        case 0:
                                            goBackFromKitchen = true;
                                            System.out.println();
                                            System.out.println("--Back to room selection--");
                                            break;


                                        default:
                                            System.out.println("Try again");
                                    }//end switch
                                }//end while go back

                                    break;




                            //pantry
                            case 2:
                                if(pantry.locked==true) {
                                    boolean goBackFromPantry = false;
                                    while (goBackFromPantry == false) {
                                        int actionChoice2;
                                        //System.out.println(pantry.roomName);
                                        System.out.println("█▀█ ▄▀█ █▄░█ ▀█▀ █▀█ █▄█" +
                                                          "\n█▀▀ █▀█ █░▀█ ░█░ █▀▄ ░█░");
                                        System.out.println();
                                        System.out.println("Select an action");
                                        System.out.println("\t 1. Inspect room ");
                                        System.out.println("\t 2. Talk to (NPC) ");
                                        System.out.println("\t 3. View inventory");
                                        System.out.println("\t 0. Go Back");

                                        actionChoice = kb.nextInt();
                                        switch (actionChoice) {
                                            //Pantry
                                            case 1:
                                                int inspectChoice2;
                                                boolean goBackFromInspectPantry = false;
                                                while (goBackFromInspectPantry == false) {
                                                    System.out.println(pantry.roomDescription);
                                                    System.out.println("The Items in the room are: " + pantry.items);
                                                    System.out.println("\t 1. Add Item to Inventory");
                                                    System.out.println("\t 0. Go Back");

                                                    inspectChoice2 = kb.nextInt();
                                                    switch (inspectChoice2) {
                                                        case 1:
                                                            pantry.takeItemFromRoom(player);

                                                            break;

                                                        case 0:
                                                            goBackFromInspectPantry = true;
                                                            System.out.println();
                                                            System.out.println("--Back to Pantry--");
                                                            break;

                                                        default:
                                                            System.out.println("Try again");
                                                            break;
                                                    }

                                                    break;
                                                }
                                                break;

                                            case 2:
                                                player.chat(player, pantry.npc);
                                                break;

                                            case 3:
                                                int itemChoice1;
                                                System.out.println();
                                                System.out.println("█ █▄░█ █░█ █▀▀ █▄░█ ▀█▀ █▀█ █▀█ █▄█    █ ▀█▀ █▀▀ █▀▄▀█ █▀" +
                                                                 "\n█ █░▀█ ▀▄▀ ██▄ █░▀█ ░█░ █▄█ █▀▄ ░█░    █ ░█░ ██▄ █░▀░█ ▄█");
                                                System.out.println();
                                                System.out.println(player.checkInventory());         
                                                System.out.println("Select inventory action");
                                                System.out.println("\t 1. Inspect item");
                                                System.out.println("\t 2. Use");
                                                System.out.println("\t 3. Eat");
                                                System.out.println("\t 4. Other");
                                                System.out.println("\t 0. Go back");

                                                itemChoice1 = kb.nextInt();
                                                switch (itemChoice1) {
                                                    //Inspect
                                                    case 1:
                                                        System.out.println(" Which Item do you want to check?");
                                                        player.listInventory();
                                                        System.out.println(player.inventory.get(kb.nextInt()).description);
                                                        break;

                                                    //Use
                                                    case 2:
                                                        if (player.inventory.size()>0 && pantry.objects.size()>0) {
                                                            System.out.println(" Which Item do you want to use and what do you want to use it on?");
                                                            player.listInventory();
                                                            pantry.listInteractiveObjects();
                                                            player.useItem(player, player.inventory.get(kb.nextInt()), pantry.objects.get(kb.nextInt()), pantry);
                                                        }
                                                        else if (player.inventory.size()<=0 && pantry.objects.size()>0)
                                                        {
                                                            System.out.println(player.name + ": What am i going to use? Ive got nothing in my bag..");
                                                        }
                                                        else
                                                        {
                                                            System.out.println(player.name + ": There isnt anything  " +
                                                                    "left in here to interact with");
                                                        }
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
                                                break;


                                            case 0:
                                                goBackFromPantry = true;
                                                System.out.println();
                                                System.out.println("--Back to room selection--");
                                                break;
                                        }
                                    }
                                    break;
                                }
                                else {
                                    System.out.println(player.name + ": Dang I cant get in there..");
                                    System.out.println();
                                    goBack=false;
                                    break;
                                }

                            //dining
                            case 3:
                                if (diningRoom.locked==true) {
                                    boolean goBackFromDinning = false;
                                    while (goBackFromDinning == false) {
                                        int actionChoice3;
                                        //System.out.println(diningRoom.roomName);
                                        System.out.println("█▀▄ █ █▄░█ █ █▄░█ █▀▀     █▀█ █▀█ █▀█ █▀▄▀█" +
                                                         "\n█▄▀ █ █░▀█ █ █░▀█ █▄█     █▀▄ █▄█ █▄█ █░▀░█");
                                        System.out.println();
                                        System.out.println("Select an action");
                                        System.out.println("\t 1. Inspect room ");
                                        System.out.println("\t 2. Talk to (NPC) ");
                                        System.out.println("\t 3. View inventory");
                                        System.out.println("\t 0. Go Back");

                                        actionChoice = kb.nextInt();
                                        switch (actionChoice) {
                                            //Dining Actions
                                            case 1:
                                                int inspectChoice3;
                                                boolean goBackFromInspectDining = false;
                                                while (goBackFromInspectDining == false) {
                                                    System.out.println(diningRoom.roomDescription);
                                                    System.out.println("The Items in the room are: " + diningRoom.items);
                                                    System.out.println("\t 1. Add Item to Inventory");
                                                    System.out.println("\t 0. Go Back");

                                                    inspectChoice3 = kb.nextInt();
                                                    switch (inspectChoice3) {
                                                        case 1:
                                                            diningRoom.takeItemFromRoom(player);

                                                            break;

                                                        case 0:
                                                            goBackFromInspectDining = true;
                                                            System.out.println();
                                                            System.out.println("--Back to Dining--");
                                                            break;

                                                        default:
                                                            System.out.println("Try again");
                                                            break;
                                                    }

                                                    break;
                                                }
                                                break;

                                            case 2:
                                                player.chat(player, diningRoom.npc);
                                                break;

                                            case 3:
                                                int itemChoice1;
                                                System.out.println();
                                                System.out.println("█ █▄░█ █░█ █▀▀ █▄░█ ▀█▀ █▀█ █▀█ █▄█    █ ▀█▀ █▀▀ █▀▄▀█ █▀" +
                                                                 "\n█ █░▀█ ▀▄▀ ██▄ █░▀█ ░█░ █▄█ █▀▄ ░█░    █ ░█░ ██▄ █░▀░█ ▄█");
                                                System.out.println();
                                                System.out.println(player.checkInventory());
                                                System.out.println("Select inventory action");
                                                System.out.println("\t 1. Inspect item");
                                                System.out.println("\t 2. Use");
                                                System.out.println("\t 3. Eat");
                                                System.out.println("\t 4. Other");
                                                System.out.println("\t 0. Go back");

                                                itemChoice1 = kb.nextInt();
                                                switch (itemChoice1) {
                                                    //Inspect
                                                    case 1:
                                                        System.out.println(" Which Item do you want to check?");
                                                        player.listInventory();
                                                        System.out.println(player.inventory.get(kb.nextInt()).description);
                                                        break;

                                                    //Use
                                                    case 2:
                                                        if (player.inventory.size()>0 && diningRoom.objects.size()>0) {
                                                            System.out.println(" Which Item do you want to use and what do you want to use it on?");
                                                            player.listInventory();
                                                            diningRoom.listInteractiveObjects();
                                                            player.useItem(player, player.inventory.get(kb.nextInt()), diningRoom.objects.get(kb.nextInt()), diningRoom);
                                                        }
                                                        else if (player.inventory.size()<=0 && diningRoom.objects.size()>0)
                                                        {
                                                            System.out.println(player.name + ": What am i going to use? Ive got nothing in my bag..");
                                                        }
                                                        else
                                                        {
                                                            System.out.println(player.name + ": There isnt anything  " +
                                                                    "left in here to interact with");
                                                        }
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
                                                break;


                                            case 0:
                                                goBackFromDinning = true;
                                                System.out.println();
                                                System.out.println("--Back to room selection--");
                                                break;
                                        }
                                    }
                                    break;
                                }
                                else
                                {
                                    System.out.println(player.name + ": Dang I cant get in there..");
                                    System.out.println();
                                    goBack=false;
                                    break;
                                }
                            //Magic shelf
                            case 4:
                                if (magicShelf.locked==true) {
                                    boolean goBackFromMagicShelf = false;
                                    while (goBackFromMagicShelf == false) {
                                        int actionChoice4;
                                        //System.out.println(magicShelf.roomName);
                                        System.out.println("█▀▄▀█ ▄▀█ █▀▀ █ █▀▀   █▀ █░█ █▀▀ █░░ █▀▀" + 
                                                         "\n█░▀░█ █▀█ █▄█ █ █▄▄   ▄█ █▀█ ██▄ █▄▄ █▀░");
                                        System.out.println();
                                        System.out.println("Select an action");
                                        System.out.println("\t 1. Inspect room ");
                                        System.out.println("\t 2. Talk to (NPC) ");
                                        System.out.println("\t 3. View inventory");
                                        System.out.println("\t 0. Go Back");

                                        actionChoice4 = kb.nextInt();
                                        switch (actionChoice4) {
                                            //Kitchen Actions
                                            case 1:
                                                int inspectChoice4;
                                                boolean goBackFromInspectMagicShelf = false;
                                                while (goBackFromInspectMagicShelf == false) {
                                                    System.out.println(magicShelf.roomDescription);
                                                    System.out.println("The Items in the room are: " + magicShelf.items);
                                                    System.out.println("\t 1. Add Item to Inventory");
                                                    System.out.println("\t 0. Go Back");

                                                    inspectChoice4 = kb.nextInt();
                                                    switch (inspectChoice4) {
                                                        case 1:
                                                            magicShelf.takeItemFromRoom(player);
                                                            break;

                                                        case 0:
                                                            goBackFromInspectMagicShelf = true;
                                                            System.out.println("--Back to kitchen--");
                                                            break;

                                                        default:
                                                            System.out.println("Try again");
                                                            break;
                                                    }

                                                    break;
                                                }
                                                break;
                                            case 2:
                                                player.chat(player, magicShelf.npc);
                                                break;

                                            case 3:
                                                int itemChoice1;
                                                System.out.println();
                                                System.out.println("█ █▄░█ █░█ █▀▀ █▄░█ ▀█▀ █▀█ █▀█ █▄█    █ ▀█▀ █▀▀ █▀▄▀█ █▀" +
                                                                 "\n█ █░▀█ ▀▄▀ ██▄ █░▀█ ░█░ █▄█ █▀▄ ░█░    █ ░█░ ██▄ █░▀░█ ▄█");
                                                System.out.println();
                                                System.out.println(player.checkInventory());
                                                System.out.println("Select inventory action");
                                                System.out.println("\t 1. Inspect item");
                                                System.out.println("\t 2. Use");
                                                System.out.println("\t 3. Eat");
                                                System.out.println("\t 4. Other");
                                                System.out.println("\t 0. Go back");

                                                itemChoice1 = kb.nextInt();
                                                switch (itemChoice1) {
                                                    //Inspect
                                                    case 1:
                                                        System.out.println(" Which Item do you want to check?");
                                                        player.listInventory();
                                                        System.out.println(player.inventory.get(kb.nextInt()).description);
                                                        break;

                                                    //Use
                                                    case 2:
                                                        if (player.inventory.size()>0 && magicShelf.objects.size()>0) {
                                                            System.out.println(" Which Item do you want to use and what do you want to use it on?");
                                                            player.listInventory();
                                                            magicShelf.listInteractiveObjects();
                                                            player.useItem(player, player.inventory.get(kb.nextInt()), magicShelf.objects.get(kb.nextInt()), magicShelf);
                                                        }
                                                        else if (player.inventory.size()<=0 && magicShelf.objects.size()>0)
                                                        {
                                                            System.out.println(player.name + ": What am i going to use? Ive got nothing in my bag..");
                                                        }
                                                        else
                                                        {
                                                            System.out.println(player.name + ": There isnt anything  " +
                                                                    "left in here to interact with");
                                                        }

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
                                                break;


                                            case 0:
                                                goBackFromMagicShelf = true;
                                                System.out.println();
                                                System.out.println("--Back to room selection--");
                                                break;
                                        }
                                    }
                                    break;
                                }
                                else
                                {
                                    System.out.println(player.name + ": Dang I cant get in there..");
                                    System.out.println();
                                    goBack=false;
                                    break;
                                }
                            case 0:
                                goBack = true;
                                System.out.println();
                                System.out.println("-------Going back------");

                                break;

                            default:
                            System.out.println("Invalid selection...Try Again");

                        }//end roomChoice menu
                    
                    }
                break;

                //View inventory
                case 2:
                    int itemChoice;
                    System.out.println();
                    System.out.println("█ █▄░█ █░█ █▀▀ █▄░█ ▀█▀ █▀█ █▀█ █▄█" +
                                     "\n█ █░▀█ ▀▄▀ ██▄ █░▀█ ░█░ █▄█ █▀▄ ░█░");
                    System.out.println();
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
                            player.listInventory();
                            System.out.println(player.inventory.get(kb.nextInt()).description);
                            break;
            
                        //Use
                        case 2:
                            System.out.println("I need to be in a room to use anything.");
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
                break;

                //the freezer/'Exit'
                case 3:
                    System.out.println("Ah yes Gordon's freezer");
                    break;

                default:
                    System.out.println("Invalid selection...Try Again");

            }//end Choice action
        }
        kb.close();
    }//End Main

}//end Main