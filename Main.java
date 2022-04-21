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
        GiveFood food = new GiveFood();
        pantry.locked=false;
        diningRoom.locked=false;
        magicShelf.locked=false;

        Scanner kb = new Scanner(System.in);


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
        int choice =0;

        while(doorUnlocked == false)
        {
            {
                do
                {
                    System.out.println("Select an action");
                    System.out.println("\t 1. Inspect room ");
                    System.out.println("\t 2. View inventory");
                    System.out.println("\t 3. (The freezer/'exit')");
                    try
                    {
                        choice = kb.nextInt();
                    }
                    catch (Exception e)
                    {
                        choice = 0;
                        System.out.println("Incorrect Input Type...Try Again");
                        System.out.println("");
                        kb.nextLine();
                    }
                }
                while (choice == 0);
                kb.nextLine();
            }


            switch (choice)
            {
                //Inspect room
                case 1:

                    int roomChoice;
                    boolean goBack = false;

                    while (goBack == false)
                    {
                        do
                        {
                            System.out.println();
                            System.out.println("Select an area to inspect");
                            System.out.println("\t 1. The kitchen");
                            System.out.println("\t 2. The pantry");
                            System.out.println("\t 3. The dining area");
                            System.out.println("\t 4. Magic ingredient shelf");
                            System.out.println("\t 0. Go back");

                            try
                            {
                                roomChoice = kb.nextInt();
                            }
                            catch (Exception e)
                            {
                                roomChoice = -1;
                                System.out.println("Incorrect Input Type...Try Again");
                                System.out.println("");
                                kb.nextLine();
                            }
                        }
                        while (roomChoice == -1);
                        kb.nextLine();

                        switch (roomChoice)
                        {
                            //KITCHEN
                            case 1:
                                int actionChoice;
                                boolean goBackFromKitchen = false;
                                while (goBackFromKitchen == false)
                                {
                                    do
                                    {
                                        System.out.println(" █▄▀ █ ▀█▀ █▀▀ █░█ █▀▀ █▄░█" +
                                                "\n █░█ █ ░█░ █▄▄ █▀█ ██▄ █░▀█");
                                        System.out.println();
                                        System.out.println("Select an action");
                                        System.out.println("\t 1. Inspect room ");
                                        System.out.println("\t 2. Talk to (NPC) ");
                                        System.out.println("\t 3. View inventory");
                                        System.out.println("\t 4. Bird???");
                                        System.out.println("\t 5. Padlock");
                                        System.out.println("\t 0. Go Back");
                                        try
                                        {
                                            actionChoice = kb.nextInt();
                                        }
                                        catch (Exception e)
                                        {
                                            actionChoice = -1;
                                            System.out.println("Incorrect Input Type...Try Again");
                                            System.out.println("");
                                            kb.nextLine();
                                        }
                                    }
                                    while (actionChoice == -1);
                                    kb.nextLine();

                                    //KITCHEN ACTIONS
                                    switch (actionChoice)
                                    {
                                        //INSPECT ROOM
                                        case 1:

                                            int inspectChoice;

                                            boolean goBackFromInspectKitchen = false;
                                            while (goBackFromInspectKitchen == false)
                                            {
                                                do
                                                {
                                                    if (kitchenRoom.objects.size() < 2)
                                                    {
                                                        System.out.println(kitchenRoom.roomDescription2);
                                                    } else
                                                    {
                                                        System.out.println(kitchenRoom.roomDescription);
                                                    }
                                                    System.out.println();

                                                    if (kitchenRoom.items.size() > 0)
                                                    {
                                                        System.out.println("The Items in the room are");
                                                        kitchenRoom.listItems();
                                                    } else
                                                    {
                                                        System.out.println("There are no more items of interest in this room");
                                                    }
                                                    System.out.println();

                                                    if (kitchenRoom.objects.size() > 0)
                                                    {
                                                        System.out.println("Some other interesting things are ");
                                                        System.out.println(kitchenRoom.objects);
                                                    } else
                                                    {
                                                        System.out.println("There are no interesting objects left in this room");
                                                    }

                                                    System.out.println("\t 1. Add Item to Inventory");
                                                    System.out.println("\t 0. Go Back");
                                                    try
                                                    {
                                                        inspectChoice = kb.nextInt();
                                                    }
                                                    catch (Exception e)
                                                    {
                                                        inspectChoice = -1;
                                                        System.out.println("Incorrect Input Type...Try Again");
                                                        System.out.println("");
                                                        kb.nextLine();
                                                    }
                                                } while (inspectChoice == -1);

                                                switch (inspectChoice)
                                                {
                                                    case 1:

                                                        if (kitchenRoom.items.size() > 0)
                                                        {
                                                            try
                                                            {
                                                                kitchenRoom.takeItemFromRoom(player);
                                                            }
                                                            catch (Exception e)
                                                            {
                                                                System.out.println("Invalid Input");
                                                                System.out.println("");
                                                                kb.nextLine();
                                                            }
                                                        } else
                                                        {
                                                            System.out.println(player.name + ": Cant add " +
                                                                    "anything to my inventory if there is " +
                                                                    "nothing to add!");
                                                        }


                                                        break;

                                                    case 0:
                                                        goBackFromInspectKitchen = true;
                                                        System.out.println();
                                                        System.out.println("--Back to kitchen--");
                                                        break;

                                                    default:
                                                        System.out.println("Try again");
                                                        System.out.println("");
                                                        break;
                                                }

                                                break;
                                            }//end while
                                            break;

                                        //TALK TO NPC
                                        case 2:

                                            boolean flag = false;
                                            int answer;

                                            do
                                            {
                                                System.out.println("1. Who are you?");
                                                System.out.println("2. How can i open this?");
                                                System.out.println("3. Why are you here?");
                                                System.out.println("0. Exit");

                                                try
                                                {
                                                    answer = kb.nextInt();
                                                    if (answer == 1)
                                                    {
                                                        System.out.println();
                                                        System.out.println(player.name + ": Who are you?");
                                                        System.out.println("Hemisworth: I am Hemisworth the devilish cook.");
                                                        System.out.println();

                                                    } else if (answer == 2)
                                                    {
                                                        System.out.println();
                                                        System.out.println(player.name + ": How can I open the freezer?");
                                                        System.out.println("Hemisworth: The freezer?? Even I haven't unlocked the freezer.");
                                                        System.out.println("Hemisworth: It is seemingly locked by four things.");
                                                        System.out.println("Hemisworth: Oh what great ingredients it holds.");
                                                        System.out.println();

                                                    } else if (answer == 3)
                                                    {
                                                        System.out.println();
                                                        System.out.println(player.name + ": Why are you here?");
                                                        System.out.println("Hemisworth: There is a wooden crate loosely hanging on the ceiling... watch your headed.");
                                                        System.out.println();

                                                    } else if (answer == 0)
                                                    {
                                                        flag = true;
                                                    } else
                                                    {
                                                        System.out.println("Invalid input for chat action...");
                                                        System.out.println("");
                                                        System.out.println();
                                                    }
                                                }
                                                catch (Exception e)
                                                {
                                                    answer = -1;
                                                    System.out.println("Incorrect Input Type...Try Again");
                                                    System.out.println("");
                                                    kb.nextLine();
                                                }

                                            } while (!flag);

                                            break;

                                        //VIEW INVENTORY
                                        case 3:
                                            int itemChoice1;
                                            do
                                            {
                                                System.out.println("");
                                                System.out.println("█ █▄░█ █░█ █▀▀ █▄░█ ▀█▀ █▀█ █▀█ █▄█    █ ▀█▀ █▀▀ █▀▄▀█ █▀" +
                                                        "\n█ █░▀█ ▀▄▀ ██▄ █░▀█ ░█░ █▄█ █▀▄ ░█░    █ ░█░ ██▄ █░▀░█ ▄█");
                                                System.out.println();
                                                System.out.println(player.checkInventory());
                                                System.out.println("Select inventory action");
                                                System.out.println("\t 1. Inspect item");
                                                System.out.println("\t 2. Use");
                                                System.out.println("\t 3. Eat");
                                                System.out.println("\t 0. Go back");


                                                try
                                                {
                                                    itemChoice1 = kb.nextInt();

                                                }
                                                catch (Exception e)
                                                {
                                                    itemChoice1 = -1;
                                                    System.out.println("Incorrect Input Type...Try Again");
                                                    System.out.println("");
                                                    kb.nextLine();
                                                }
                                            }
                                            while (itemChoice1 == -1);
                                            kb.nextLine();

                                            switch (itemChoice1)
                                            {

                                                //Inspect
                                                case 1:

                                                    try
                                                    {
                                                        System.out.println(" Which Item do you want to check?");
                                                        player.listInventory();
                                                        System.out.println(player.inventory.get(kb.nextInt()).description);
                                                    }
                                                    catch (Exception e)
                                                    {
                                                        System.out.println("INVALID INPUT");
                                                        System.out.println("");
                                                    }
                                                    break;

                                                //Use
                                                case 2:
                                                    try
                                                    {

                                                        if (player.inventory.size() > 0 && kitchenRoom.objects.size() > 0)
                                                        {
                                                            System.out.println(" Choose inventory item number first and press enter, then choose object number and press enter.");
                                                            System.out.println("Inventory Items"
                                                            );
                                                            player.listInventory();
                                                            System.out.println("----------");
                                                            System.out.println("Room Objects");
                                                            kitchenRoom.listInteractiveObjects();
                                                            player.useItem(player, player.inventory.get(kb.nextInt()), kitchenRoom.objects.get(kb.nextInt()), kitchenRoom);

                                                        } else if (player.inventory.size() <= 0 && kitchenRoom.objects.size() > 0)
                                                        {
                                                            System.out.println(player.name + ": What am i going to use? Ive got nothing in my bag..");
                                                        } else
                                                        {
                                                            System.out.println(player.name + ": There isnt anything  " +
                                                                    "left in here to interact with");
                                                        }
                                                    }
                                                    catch (Exception e)
                                                    {
                                                        System.out.println("INVALID INPUT");
                                                        System.out.println("");
                                                        kb.nextLine();
                                                    }
                                                    break;

                                                //Eat
                                                case 3:
                                                    try
                                                    {
                                                        player.listInventory();
                                                        player.eat(player, player.inventory.get(kb.nextInt()));
                                                    }
                                                    catch (Exception e)
                                                    {
                                                        System.out.println("INVALID INPUT");
                                                        System.out.println("");
                                                        kb.nextLine();
                                                    }
                                                    break;


                                                default:
                                                    System.out.println("Error in Inventory action selection ");
                                                    System.out.println("");


                                                    System.out.println("INVALID INPUT");
                                                    System.out.println("");
                                                    kb.nextLine();
                                                    goBackFromKitchen = true;
                                                    System.out.println("");
                                                    System.out.println("--Back to room selection--");
                                                    System.out.println("");

                                            }
                                            break;

                                        //CROW??
                                        case 4:
                                            try
                                            {
                                                NumberPuzzle numberPuzzle2 = new NumberPuzzle();
                                                numberPuzzle2.NumberPuzzle(pantry);
                                            }
                                            catch (Exception e)
                                            {
                                                System.out.println("Incorrect Input Type you FOOL...");
                                                System.out.println("");

                                            }
                                            break;

                                        //PADLOCk
                                        case 5:
                                            try
                                            {
                                                PadLock padlock = new PadLock();
                                                System.out.println(" Choose inventory item number first and press enter, then choose object number and press enter.");
                                                System.out.println("Inventory Items");
                                                player.listInventory();
                                                System.out.println("----------");
                                                System.out.println("Room Objects");
                                                kitchenRoom.listInteractiveObjectsHidden();
                                                padlock.padLock(player, pantry, player.inventory.get(kb.nextInt()),
                                                        kitchenRoom.objects.get(kb.nextInt()));
                                            }
                                            catch (Exception e)
                                            {
                                                System.out.println("INVALID INPUT");
                                                System.out.println("");
                                            }
                                            break;

                                        //GO BACK
                                        case 0:
                                            try
                                            {
                                                goBackFromKitchen = true;
                                                System.out.println("");
                                                System.out.println("--Back to room selection--");
                                                System.out.println("");
                                            }
                                            catch (Exception e)
                                            {
                                                System.out.println("INVALID INPUT");
                                                System.out.println("");
                                            }
                                            break;


                                        default:
                                            System.out.println("Try again");
                                            System.out.println("");
                                    }//end switch
                                }//end while go back
                                break;

                            //PANTRY
                            case 2:
                                try
                                {

                                    if (pantry.locked == false)
                                    {
                                        boolean goBackFromPantry = false;
                                        while (goBackFromPantry == false)
                                        {
                                            do
                                            {
                                                //System.out.println(pantry.roomName);
                                                System.out.println("");
                                                System.out.println("█▀█ ▄▀█ █▄░█ ▀█▀ █▀█ █▄█" +
                                                        "\n█▀▀ █▀█ █░▀█ ░█░ █▀▄ ░█░");
                                                System.out.println();
                                                System.out.println("Select an action");
                                                System.out.println("\t 1. Inspect room ");
                                                System.out.println("\t 2. Talk to (NPC) ");
                                                System.out.println("\t 3. View inventory");
                                                System.out.println("\t 4. Attempt Passcode");
                                                System.out.println("\t 0. Go Back");

                                                try
                                                {
                                                    actionChoice = kb.nextInt();
                                                }
                                                catch (Exception e)
                                                {
                                                    actionChoice = -1;
                                                    System.out.println("Invalid Input, you'll have to try that again!");
                                                    System.out.println("");
                                                    kb.nextLine();
                                                }
                                            }
                                            while (actionChoice == -1);
                                            kb.nextLine();


                                            switch (actionChoice)
                                            {
                                                //INSPECT ROOM
                                                case 1:
                                                    try
                                                    {
                                                        int inspectChoice2;
                                                        boolean goBackFromInspectPantry = false;
                                                        while (goBackFromInspectPantry == false)
                                                        {
                                                            if (pantry.objects.size() < 1)
                                                            {
                                                                System.out.println(pantry.roomDescription2);
                                                            } else
                                                            {
                                                                System.out.println(pantry.roomDescription);
                                                            }
                                                            System.out.println();
                                                            if (pantry.items.size() > 0)
                                                            {
                                                                System.out.println("The Items in the room are");
                                                                pantry.listItems();
                                                            } else
                                                            {
                                                                System.out.println("There are no more items of interest in this room");
                                                            }
                                                            System.out.println();
                                                            if (pantry.objects.size() > 0)
                                                            {
                                                                System.out.println("Some other interesting things are ");
                                                                System.out.println(pantry.objects);
                                                            } else
                                                            {
                                                                System.out.println("There are no interesting objects left in this room");
                                                            }
                                                            System.out.println("\t 1. Add Item to Inventory");
                                                            System.out.println("\t 0. Go Back");


                                                            inspectChoice2 = kb.nextInt();
                                                            switch (inspectChoice2)
                                                            {
                                                                case 1:
                                                                    try
                                                                    {
                                                                        if (pantry.items.size() > 0)
                                                                        {
                                                                            pantry.takeItemFromRoom(player);
                                                                        } else
                                                                        {
                                                                            System.out.println(player.name + ": Cant add " +
                                                                                    "anything to my inventory if there is " +
                                                                                    "nothing to add!");
                                                                        }
                                                                    }
                                                                    catch (Exception e)
                                                                    {
                                                                        System.out.println("Invalid Input");
                                                                        System.out.println("");
                                                                    }
                                                                    break;

                                                                case 0:
                                                                    goBackFromInspectPantry = true;
                                                                    System.out.println("");
                                                                    System.out.println("--Back to Pantry--");
                                                                    System.out.println("");
                                                                    break;

                                                                default:
                                                                    System.out.println("Try again");
                                                                    System.out.println("");
                                                                    break;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    catch (Exception e)
                                                    {
                                                        System.out.println("INVALID INPUT");
                                                        System.out.println("");
                                                    }
                                                    break;

                                                //TALK TO NPC
                                                case 2:
                                                    try
                                                    {
                                                        player.chat(player, pantry.npc);
                                                    }
                                                    catch (Exception e)
                                                    {
                                                        System.out.println("INVALID INPUT");
                                                        System.out.println("");
                                                    }
                                                    break;

                                                //VIEW INVENTORY
                                                case 3:
                                                    try
                                                    {
                                                        int itemChoice1;
                                                        System.out.println("");
                                                        System.out.println("█ █▄░█ █░█ █▀▀ █▄░█ ▀█▀ █▀█ █▀█ █▄█    █ ▀█▀ █▀▀ █▀▄▀█ █▀" +
                                                                "\n█ █░▀█ ▀▄▀ ██▄ █░▀█ ░█░ █▄█ █▀▄ ░█░    █ ░█░ ██▄ █░▀░█ ▄█");
                                                        System.out.println();
                                                        System.out.println(player.checkInventory());
                                                        System.out.println("Select inventory action");
                                                        System.out.println("\t 1. Inspect item");
                                                        System.out.println("\t 2. Use");
                                                        System.out.println("\t 3. Eat");
                                                        System.out.println("\t 0. Go back");

                                                        itemChoice1 = kb.nextInt();
                                                        switch (itemChoice1)
                                                        {
                                                            //Inspect
                                                            case 1:
                                                                try
                                                                {
                                                                    System.out.println(" Which Item do you want to check?");
                                                                    player.listInventory();
                                                                    System.out.println(player.inventory.get(kb.nextInt()).description);
                                                                    break;
                                                                }
                                                                catch (Exception e)
                                                                {
                                                                    System.out.println("INVALID INPUT");
                                                                    System.out.println("");

                                                                }

                                                                //Use
                                                            case 2:
                                                                try
                                                                {
                                                                    if (player.inventory.size() > 0 && pantry.objects.size() > 0)
                                                                    {
                                                                        System.out.println(" Choose inventory item number first and press enter, then choose object number and press enter.");
                                                                        System.out.println("Inventory Items");
                                                                        player.listInventory();
                                                                        System.out.println("----------");
                                                                        System.out.println("Room Objects");
                                                                        pantry.listInteractiveObjects();
                                                                        player.useItem(player, player.inventory.get(kb.nextInt())
                                                                                , pantry.objects.get(kb.nextInt()), pantry);

                                                                    } else if (player.inventory.size() <= 0 && pantry.objects.size() > 0)
                                                                    {
                                                                        System.out.println(player.name + ": What am i going to use? Ive got nothing in my bag..");
                                                                    } else
                                                                    {
                                                                        System.out.println(player.name + ": There isnt anything  " +
                                                                                "left in here to interact with");
                                                                    }
                                                                    break;
                                                                }
                                                                catch (Exception e)
                                                                {
                                                                    System.out.println("INVALID INPUT");
                                                                    System.out.println("");
                                                                }

                                                                //Eat
                                                            case 3:
                                                                try
                                                                {
                                                                    player.listInventory();
                                                                    player.eat(player, player.inventory.get(kb.nextInt()));
                                                                    break;
                                                                }
                                                                catch (Exception e)
                                                                {
                                                                    System.out.println("INVALID INPUT");
                                                                    System.out.println("");
                                                                }

                                                            default:
                                                                System.out.println("Error in Inventory action selection ");
                                                                System.out.println("");
                                                        }
                                                        break;
                                                    }
                                                    catch (Exception e)
                                                    {
                                                        System.out.println("INVALID INPUT");
                                                        System.out.println("");
                                                    }

                                                    //ATTEMPT PASSCODE
                                                case 4:
                                                    try
                                                    {
                                                        CodeLock code = new CodeLock();
                                                        code.passcode(player, diningRoom);
                                                        break;
                                                    }
                                                    catch (Exception e)
                                                    {
                                                        System.out.println("INVALID INPUT");
                                                        System.out.println("");
                                                    }

                                                    //GO BACK
                                                case 0:
                                                    try
                                                    {
                                                        goBackFromPantry = true;
                                                        System.out.println("");
                                                        System.out.println("--Back to room selection--");
                                                        System.out.println("");
                                                        break;
                                                    }
                                                    catch (Exception e)
                                                    {
                                                        System.out.println("INVALID INPUT");
                                                        System.out.println("");
                                                    }

                                            }
                                        }
                                        break;
                                    } else
                                    {
                                        System.out.println(player.name + ": Dang I cant get in there... yet");
                                        System.out.println();
                                        goBack = false;
                                        break;
                                    }
                                }
                                catch (Exception e)
                                {
                                    System.out.println("INVALID INPUT");
                                    System.out.println("");
                                }

                                //dining
                            case 3:
                                try
                                {
                                    if (diningRoom.locked == false)
                                    {
                                        boolean goBackFromDinning = false;
                                        while (goBackFromDinning == false)
                                        {
                            do{
                                            //System.out.println(diningRoom.roomName);
                                            System.out.println("");
                                            System.out.println("█▀▄ █ █▄░█ █ █▄░█ █▀▀     █▀█ █▀█ █▀█ █▀▄▀█" +
                                                    "\n█▄▀ █ █░▀█ █ █░▀█ █▄█     █▀▄ █▄█ █▄█ █░▀░█");
                                            System.out.println();
                                            System.out.println("Select an action");
                                            System.out.println("\t 1. Inspect room ");
                                            System.out.println("\t 2. Talk to (NPC) ");
                                            System.out.println("\t 3. View inventory");
                                            System.out.println("\t 4. Lever Lock");
                                            System.out.println("\t 0. Go Back");

                                            try
                                            {
                                                actionChoice = kb.nextInt();
                                            }
                                            catch (Exception e)
                                            {
                                                actionChoice = -1;
                                                System.out.println("Invalid Input, you'll have to try that again!");
                                                System.out.println("");
                                                kb.nextLine();
                                            }
                                        }
                                        while (actionChoice == -1) ;
                                        kb.nextLine();

                                        //DINING ACTIONS
                                        switch (actionChoice)
                                        {
                                            //INSPECT ROOM
                                            case 1:

                                                int inspectChoice3;
                                                boolean goBackFromInspectDining = false;
                                                while (goBackFromInspectDining == false)
                                                {
                                                    if (diningRoom.objects.size() < 2)
                                                    {
                                                        System.out.println(diningRoom.roomDescription2);
                                                    } else
                                                    {
                                                        System.out.println(diningRoom.roomDescription);
                                                    }
                                                    System.out.println();

                                                    if (diningRoom.items.size() > 0)
                                                    {
                                                        System.out.println("The Items in the room are");
                                                        diningRoom.listItems();
                                                    } else
                                                    {
                                                        System.out.println("There are no more items of interest in this room");
                                                    }
                                                    System.out.println();

                                                    if (diningRoom.objects.size() > 0)
                                                    {
                                                        System.out.println("Some other interesting things are ");
                                                        System.out.println(diningRoom.objects);
                                                    } else
                                                    {
                                                        System.out.println("There are no interesting objects left in this room");
                                                    }
                                                    System.out.println("\t 1. Add Item to Inventory");
                                                    System.out.println("\t 0. Go Back");

                                                    inspectChoice3 = kb.nextInt();
                                                    switch (inspectChoice3)
                                                    {
                                                        case 1:
                                                            try
                                                            {
                                                                if (diningRoom.items.size() > 0)
                                                                {
                                                                    try
                                                                    {
                                                                        diningRoom.takeItemFromRoom(player);
                                                                    }
                                                                    catch (Exception e)
                                                                    {
                                                                        System.out.println("Invalid Input");
                                                                        System.out.println("");
                                                                        kb.nextLine();
                                                                    }
                                                                } else
                                                                {
                                                                    System.out.println(player.name + ": Cant add " +
                                                                            "anything to my inventory if there is " +
                                                                            "nothing to add!");
                                                                }
                                                                break;
                                                            }
                                                            catch (Exception e)
                                                            {
                                                                System.out.println("Invalid Input");
                                                                System.out.println("");
                                                            }

                                                        case 0:

                                                            goBackFromInspectDining = true;
                                                            System.out.println("");
                                                            System.out.println("--Back to Dining--");
                                                            System.out.println("");
                                                            break;


                                                        default:
                                                            System.out.println("Try again");
                                                            System.out.println("");
                                                            break;
                                                    }
                                                    break;
                                                }
                                                break;

                                            //TALk TO NPC
                                            case 2:
                                                try
                                                {
                                                    //player.chat(player, diningRoom.npc);
                                                    Riddle riddle = new Riddle();
                                                    riddle.RiddlePuzzle(diningRoom);
                                                    break;
                                                }
                                                catch (Exception e)
                                                {
                                                    System.out.println("Invalid Input");
                                                    System.out.println("");
                                                    kb.nextLine();
                                                }

                                                //VIEW INVENTORY
                                            case 3:
                                                int itemChoice1;
                                                do
                                                {
                                                    System.out.println();
                                                    System.out.println("");
                                                    System.out.println("█ █▄░█ █░█ █▀▀ █▄░█ ▀█▀ █▀█ █▀█ █▄█    █ ▀█▀ █▀▀ █▀▄▀█ █▀" +
                                                            "\n█ █░▀█ ▀▄▀ ██▄ █░▀█ ░█░ █▄█ █▀▄ ░█░    █ ░█░ ██▄ █░▀░█ ▄█");
                                                    System.out.println();
                                                    System.out.println(player.checkInventory());
                                                    System.out.println("Select inventory action");
                                                    System.out.println("\t 1. Inspect item");
                                                    System.out.println("\t 2. Use");
                                                    System.out.println("\t 3. Eat");
                                                    System.out.println("\t 0. Go back");

                                                    try
                                                    {
                                                        itemChoice1 = kb.nextInt();
                                                    }
                                                    catch (Exception e)
                                                    {
                                                        itemChoice1 = -1;
                                                        System.out.println("Invalid Input, you'll have to try that again!");
                                                        System.out.println("");
                                                        kb.nextLine();
                                                    }
                                                }
                                                while (itemChoice1 == -1);
                                                kb.nextLine();


                                                switch (itemChoice1)
                                                {
                                                    //Inspect
                                                    case 1:
                                                        try
                                                        {
                                                            System.out.println(" Which Item do you want to check?");
                                                            player.listInventory();
                                                            System.out.println(player.inventory.get(kb.nextInt()).description);
                                                            break;
                                                        }
                                                        catch (Exception e)
                                                        {
                                                            System.out.println("Invalid Input");
                                                            System.out.println("");
                                                        }

                                                        //Use
                                                    case 2:
                                                        try
                                                        {
                                                            if (player.inventory.size() > 0 && diningRoom.objects.size() > 0)
                                                            {
                                                                System.out.println(" Choose inventory item number first and press enter, then choose object number and press enter.");
                                                                System.out.println("Inventory Items"
                                                                );
                                                                player.listInventory();
                                                                System.out.println("----------");
                                                                System.out.println("Room Objects");
                                                                diningRoom.listInteractiveObjects();
                                                                player.useItem(player, player.inventory.get(kb.nextInt())
                                                                        , diningRoom.objects.get(kb.nextInt()), diningRoom);

                                                            } else if (player.inventory.size() <= 0 && diningRoom.objects.size() > 0)
                                                            {
                                                                System.out.println(player.name + ": What am i going to use? Ive got nothing in my bag..");
                                                            } else
                                                            {
                                                                System.out.println(player.name + ": There isnt anything  " +
                                                                        "left in here to interact with");
                                                            }
                                                            break;
                                                        }
                                                        catch (Exception e)
                                                        {
                                                            System.out.println("Invalid Input");
                                                            System.out.println("");
                                                        }

                                                        //Eat
                                                    case 3:
                                                        try
                                                        {
                                                            player.listInventory();
                                                            player.eat(player, player.inventory.get(kb.nextInt()));

                                                            break;
                                                        }
                                                        catch (Exception e)
                                                        {
                                                            System.out.println("Invalid Input");
                                                            System.out.println("");
                                                        }
                                                    default:
                                                        System.out.println("Error in Inventory action selection ");
                                                }
                                                break;

                                            case 4:
                                                try
                                                {
                                                    System.out.println("Choose inventory item number first and press enter, then choose object number and press enter");
                                                    player.listInventory();
                                                    System.out.println("-----");
                                                    diningRoom.listInteractiveObjectsHidden();
                                                    LeverLock lock = new LeverLock();
                                                    lock.leverLock(player, player.inventory.get(kb.nextInt()),
                                                            diningRoom.objects.get(kb.nextInt()), magicShelf);
                                                    break;
                                                }
                                                catch (Exception e)
                                                {
                                                    System.out.println("Invalid Input");
                                                    System.out.println("");
                                                }

                                            case 0:
                                                try
                                                {
                                                    goBackFromDinning = true;
                                                    System.out.println("");
                                                    System.out.println("--Back to room selection--");
                                                    System.out.println("");
                                                    break;
                                                }
                                                catch (Exception e)
                                                {
                                                    System.out.println("Invalid Input");
                                                    System.out.println("");
                                                }
                                        }
                                    }
                                    break;
                                }

                                else
                            {
                                System.out.println(player.name + ": Dang I cant get in there... yet");
                                System.out.println();
                                goBack = false;
                                break;
                            }
                                }
                                catch (Exception e)
                                {
                                    System.out.println("INVALID INPUT");
                                    System.out.println("");
                                }
                            //Magic shelf
                            case 4:

                                    if (magicShelf.locked==false) 
                                    {
                                        boolean goBackFromMagicShelf = false;
                                        while (goBackFromMagicShelf == false)
                                        {
                                            int actionChoice4;
                                            //System.out.println(magicShelf.roomName);
                                            System.out.println("");
                                            System.out.println("█▀▄▀█ ▄▀█ █▀▀ █ █▀▀   █▀ █░█ █▀▀ █░░ █▀▀" +
                                                             "\n█░▀░█ █▀█ █▄█ █ █▄▄   ▄█ █▀█ ██▄ █▄▄ █▀░");
                                            System.out.println();
                                            System.out.println("Select an action");
                                            System.out.println("\t 1. Inspect room ");
                                            System.out.println("\t 2. Talk to (NPC) ");
                                            System.out.println("\t 3. View inventory");
                                            System.out.println("\t 4. Give a Treat");
                                            System.out.println("\t 0. Go Back");

                                            actionChoice4 = kb.nextInt();
                                            switch (actionChoice4) {

                                                case 1:

                                                    int inspectChoice4=-1;

                                                    boolean goBackFromInspectMagicShelf = false;
                                                    while (goBackFromInspectMagicShelf == false) 
                                                    {

                                                        if (magicShelf.objects.size()<2)
                                                        {
                                                            System.out.println(magicShelf.roomDescription2);
                                                        }
                                                        else
                                                        {
                                                            System.out.println(magicShelf.roomDescription);
                                                        }
                                                        System.out.println();
                                                        if (magicShelf.items.size() >0)
                                                        {
                                                            System.out.println("The Items in the room are");
                                                            magicShelf.listItems();
                                                        }
                                                        else
                                                        {
                                                            System.out.println("There are no more items of interest in this room");
                                                        }
                                                        System.out.println();
                                                        if ( magicShelf.objects.size()>0)
                                                        {
                                                            System.out.println("Some other interesting things are ");
                                                            System.out.println(magicShelf.objects);
                                                        }
                                                        else
                                                        {
                                                            System.out.println("There are no interesting objects left in this room");
                                                        }
                                                        System.out.println("\t 1. Add Item to Inventory");
                                                        System.out.println("\t 0. Go Back");
                                                        do
                                                        {
                                                            try
                                                            {
                                                                inspectChoice4 = kb.nextInt();
                                                            }
                                                            catch (Exception e)
                                                            {
                                                                System.out.println("Invalid input");
                                                                kb.nextLine();
                                                            }
                                                        }
                                                        while (inspectChoice4 ==-1);
                                                        switch (inspectChoice4) 
                                                        {
                                                            case 1:

                                                                    if (magicShelf.items.size()>0)
                                                                    {

                                                                        try
                                                                        {
                                                                        magicShelf.takeItemFromRoom(player);
                                                                        }
                                                                        catch (Exception e)
                                                                        {
                                                                            System.out.println("Invalid Input");
                                                                            System.out.println("");
                                                                            kb.nextLine();
                                                                        }
                                                                    }
                                                                    else
                                                                    {
                                                                        System.out.println(player.name + ": Cant add " +
                                                                                "anything to my inventory if there is " +
                                                                                "nothing to add!");
                                                                    }

                                                                    break;


                                                            case 0:
                                                                goBackFromInspectMagicShelf = true;
                                                                System.out.println("");
                                                                System.out.println("--Back to Magic Shelf--");
                                                                System.out.println("");
                                                                break;

                                                            default:
                                                                System.out.println("Try again");
                                                                break;
                                                        }

                                                        break;
                                                    }
                                                    break;


                                                case 2:

                                                    if (food.foodflag==false)
                                                    {
                                                        try
                                                        {
                                                            player.chat(player, magicShelf.npc);
                                                            break;
                                                        }
                                                        catch (Exception e)
                                                        {
                                                            System.out.println("Invalid Input");
                                                            System.out.println("");
                                                        }
                                                    }
                                                    else
                                                    {
                                                        try
                                                        {
                                                            player.chatSuccess(player, magicShelf.npc);
                                                            break;
                                                        }
                                                        catch (Exception e)
                                                        {
                                                            System.out.println("Invalid Input");
                                                            System.out.println("");
                                                        }
                                                    }

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
                                                        System.out.println("\t 0. Go back");

                                                        itemChoice1 = kb.nextInt();
                                                        switch (itemChoice1) 
                                                        {
                                                            //Inspect
                                                            case 1:
                                                                try{
                                                                System.out.println(" Which Item do you want to check?");
                                                                player.listInventory();
                                                                System.out.println(player.inventory.get(kb.nextInt()).description);
                                                                break;
                                                                }
                                                                catch (Exception e)
                                                                {
                                                                    System.out.println("Invalid Input");
                                                                    System.out.println("");
                                                                }

                                                            //Use
                                                            case 2:
                                                                try
                                                                {
                                                                    if (player.inventory.size()>0 && magicShelf.objects.size()>0) 
                                                                    {
                                                                        System.out.println(" Choose inventory item number first and press enter, then choose object number and press enter.");
                                                                        System.out.println("Inventory Items"
                                                                        );
                                                                        player.listInventory();
                                                                        System.out.println("----------");
                                                                        System.out.println("Room Objects");
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
                                                                    break;
                                                                }
                                                                catch (Exception e)
                                                                {
                                                                    System.out.println("Invalid Input");
                                                                    System.out.println("");
                                                                }

                                                            //Eat
                                                            case 3: try
                                                            {
                                                                player.listInventory();
                                                                player.eat(player, player.inventory.get(kb.nextInt()));

                                                                break;
                                                            }
                                                            catch (Exception e)
                                                            {
                                                                System.out.println("Invalid Input");
                                                                System.out.println("");
                                                            }
                                                    }
                                                    break;


                                                case 4:
                                                    try
                                                    {
                                                        System.out.println(magicShelf.npc.name + ": Have you brought me my " +
                                                                "favorite " +
                                                                "treat!?!?!?");
                                                        System.out.println(player.name + ": How about this?");
                                                        player.listInventory();
                                                        System.out.println("------");
                                                        magicShelf.listInteractiveObjects();

                                                        food.giveFood(player, magicShelf,player.inventory.get(kb.nextInt()),
                                                                magicShelf.objects.get(kb.nextInt()));
                                                        break;
                                                    }
                                                    catch (Exception e)
                                                    {
                                                        System.out.println("Invalid Input");
                                                        System.out.println("");
                                                    }


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
                                        System.out.println(player.name + ": Dang I cant get in there... yet");
                                        System.out.println();
                                        goBack=false;
                                        break;
                                    }



                            case 0:
                                goBack = true;
                        
                                System.out.println("");
                                System.out.println("-------Going back------");
                                System.out.println("");

                                break;

                            default:
                            System.out.println("Invalid selection...Try Again");
                            System.out.println("");

                        }//end roomChoice menu
                    }
                break;

                //View inventory
                case 2:
                    try
                    {
                        int itemChoice;
                        System.out.println("");
                        System.out.println("█ █▄░█ █░█ █▀▀ █▄░█ ▀█▀ █▀█ █▀█ █▄█" +
                                         "\n█ █░▀█ ▀▄▀ ██▄ █░▀█ ░█░ █▄█ █▀▄ ░█░");
                        System.out.println();
                        System.out.println(player.checkInventory());
                        System.out.println("Select inventory action");
                        System.out.println("\t 1. Inspect item");
                        System.out.println("\t 2. Use");
                        System.out.println("\t 3. Eat");
                        System.out.println("\t 0. Go back");

                        itemChoice = kb.nextInt();
                        switch (itemChoice)
                        {
                            //Inspect item
                            case 1:
                                try{
                                System.out.println(" Which Item do you want to check?");
                                player.listInventory();
                                System.out.println(player.inventory.get(kb.nextInt()).description);
                                break;
                                }
                                catch (Exception e)
                                {
                                    System.out.println("Invalid Input");
                                    System.out.println("");
                                }

                            //Use item
                            case 2:
                                try
                                {
                                    System.out.println("I need to be in a room to use anything.");
                                    break;
                                }
                                catch (Exception e)
                                {
                                    System.out.println("Invalid Input");
                                    System.out.println("");
                                }

                            //Eat item
                            case 3:
                                try
                                {
                                    player.listInventory();
                                    player.eat(player, player.inventory.get(kb.nextInt()));

                                break;
                                }
                                catch (Exception e)
                                {
                                    System.out.println("Invalid Input");
                                    System.out.println("");
                                }

                            default:
                            System.out.println("Error in Inventory action selection ");
                            System.out.println("");
                        }
                        break;
                    }
                    catch (Exception e)
                    {
                        System.out.println("Invalid Input");
                        System.out.println("");
                    }

                //THE FREEZER/ "EXIT"
                case 3: 
                    try
                    {
                        if (player.inventory.size()>3) 
                        {
                            Freezer freezer = new Freezer();
                            System.out.println("Now to place the four key pieces in order.");
                            player.listInventory();
                            freezer.Freezer(player, player.inventory.get(kb.nextInt()), player.inventory.get(kb.nextInt()), player.inventory.get(kb.nextInt()), player.inventory.get(kb.nextInt()));
                        }
                        else 
                        {
                            System.out.println("The freezer has four keys.. I don't even have four items in my inventory");
                        }
                        break;
                    }
                    catch (Exception e)
                    {
                        System.out.println("Invalid Input");
                        System.out.println("");
                    }

                default:
                    System.out.println("Invalid selection...Try Again");
                    System.out.println("");

            }//end Choice action
        }//End while door is unlocked
    }//End Main
}//end Main