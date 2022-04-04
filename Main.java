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
                                    System.out.println("\t 5. Padlock");
                                    System.out.println("\t 0. Go Back");

                                    actionChoice = kb.nextInt();
                                    switch (actionChoice) {
                                        //Kitchen Actions
                                        case 1:
                                            try {
                                                int inspectChoice;
                                                boolean goBackFromInspectKitchen = false;
                                                while (goBackFromInspectKitchen == false) {
                                                    if (kitchenRoom.objects.size() < 2) {
                                                        System.out.println(kitchenRoom.roomDescription2);
                                                    } else {
                                                        System.out.println(kitchenRoom.roomDescription);
                                                    }
                                                    System.out.println();
                                                    if (kitchenRoom.items.size() > 0) {
                                                        System.out.println("The Items in the room are");
                                                        kitchenRoom.listItems();
                                                    } else {
                                                        System.out.println("There are no more items of interest in this room");
                                                    }
                                                    System.out.println();
                                                    if (kitchenRoom.objects.size() > 0) {
                                                        System.out.println("Some other interesting things are ");
                                                        System.out.println(kitchenRoom.objects);
                                                    } else {
                                                        System.out.println("There are no interesting objects left in this room");
                                                    }
                                                    System.out.println("\t 1. Add Item to Inventory");
                                                    System.out.println("\t 0. Go Back");

                                                    inspectChoice = kb.nextInt();
                                                    switch (inspectChoice) {
                                                        case 1:
                                                            try {
                                                                if (kitchenRoom.items.size() > 0) {
                                                                    kitchenRoom.takeItemFromRoom(player);
                                                                } else {
                                                                    System.out.println(player.name + ": Cant add " +
                                                                            "anything to my inventory if there is " +
                                                                            "nothing to add!");
                                                                }
                                                            } catch (Exception e) {
                                                                System.out.println("Invalid Input");
                                                            }
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
                                            }
                                            catch (Exception e)
                                            {
                                                System.out.println("INVALID INPUT");
                                            }
                                        case 2:
                                            try{
                                            player.chat(player, kitchenRoom.npc);
                                            }
                                            catch (Exception e)
                                            {
                                                System.out.println("INVALID INPUT");
                                            }
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
                                                    try{
                                                    System.out.println(" Which Item do you want to check?");
                                                    player.listInventory();
                                                    System.out.println(player.inventory.get(kb.nextInt()).description);
                                                    }
                                                    catch (Exception e)
                                                    {
                                                        System.out.println("INVALID INPUT");
                                                    }
                                                    break;

                                                //Use
                                                case 2:
                                                    try {

                                                    if (player.inventory.size()>0 && kitchenRoom.objects.size()>0) {
                                                        System.out.println(" Choose inventory item number first and press enter, then choose object number and press enter.");
                                                        System.out.println("Inventory Items"
                                                        );
                                                        player.listInventory();
                                                        System.out.println("----------");
                                                        System.out.println("Room Objects");
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
                                                    }
                                                    catch (Exception e)
                                                    {
                                                        System.out.println("INVALID INPUT");
                                                    }

                                                    break;

                                                //Eat
                                                case 3:
                                                    try{
                                                    player.listInventory();
                                                    player.eat(player, player.inventory.get(kb.nextInt()));
                                                    }
                                                    catch (Exception e)
                                                    {
                                                        System.out.println("INVALID INPUT");
                                                    }
                                                    break;

                                                //Break ------------------------------------------------fix
                                                case 4:
                                                    System.out.println("Fix Break items");

                                                    break;

                                                default:
                                                    System.out.println("Error in Inventory action selection ");
                                            }
                                            break;

                                        case 4:
                                            try {
                                            NumberPuzzle numberPuzzle2 = new NumberPuzzle();
                                            numberPuzzle2.NumberPuzzle(pantry);
                                            }
                                            catch (Exception e)
                                            {
                                                System.out.println("INVALID INPUT");
                                            }


                                            break;

                                        case 5:
                                            try{
                                            PadLock padlock = new PadLock();
                                                System.out.println(" Choose inventory item number first and press enter, then choose object number and press enter.");
                                                System.out.println("Inventory Items"
                                                );
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
                                            }
                                            break;

                                        case 0:
                                            try {
                                            goBackFromKitchen = true;
                                            System.out.println();
                                            System.out.println("--Back to room selection--");
                                            }
                                            catch (Exception e)
                                            {
                                                System.out.println("INVALID INPUT");
                                            }
                                            break;


                                        default:
                                            System.out.println("Try again");
                                    }//end switch
                                }//end while go back

                                    break;




                            //pantry
                            case 2:
                                try{
                                if(pantry.locked==false) {
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
                                        System.out.println("\t 4. Attempt Passcode");
                                        System.out.println("\t 0. Go Back");

                                        actionChoice = kb.nextInt();
                                        switch (actionChoice) {
                                            //Pantry
                                            case 1:
                                                try {
                                                int inspectChoice2;
                                                boolean goBackFromInspectPantry = false;
                                                while (goBackFromInspectPantry == false) {
                                                    if (pantry.objects.size()<1)
                                                    {
                                                        System.out.println(pantry.roomDescription2);
                                                    }
                                                    else
                                                    {
                                                        System.out.println(pantry.roomDescription);
                                                    }
                                                    System.out.println();
                                                    if (pantry.items.size() >0)
                                                    {
                                                        System.out.println("The Items in the room are");
                                                        pantry.listItems();
                                                    }
                                                    else
                                                    {
                                                        System.out.println("There are no more items of interest in this room");
                                                    }
                                                    System.out.println();
                                                    if (pantry.objects.size()>0)
                                                    {
                                                        System.out.println("Some other interesting things are ");
                                                        System.out.println(pantry.objects);
                                                    }
                                                    else
                                                    {
                                                        System.out.println("There are no interesting objects left in this room");
                                                    }
                                                    System.out.println("\t 1. Add Item to Inventory");
                                                    System.out.println("\t 0. Go Back");


                                                    inspectChoice2 = kb.nextInt();
                                                    switch (inspectChoice2) {
                                                        case 1:
                                                            try {


                                                            if (pantry.items.size()>0) {
                                                                pantry.takeItemFromRoom(player);
                                                            }
                                                            else
                                                            {
                                                                System.out.println(player.name + ": Cant add " +
                                                                        "anything to my inventory if there is " +
                                                                        "nothing to add!");
                                                            }
                                                            }
                                                            catch (Exception e)
                                                            {
                                                                System.out.println("Invalid Input");
                                                            }
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
                                                }
                                                catch (Exception e)
                                                {
                                                    System.out.println("INVALID INPUT");
                                                }
                                                break;

                                            case 2:
                                                try {


                                                player.chat(player, pantry.npc);
                                                }
                                                catch (Exception e)
                                                {
                                                    System.out.println("INVALID INPUT");
                                                }
                                                break;

                                            case 3:
                                                try {


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
                                                        try {
                                                        System.out.println(" Which Item do you want to check?");
                                                        player.listInventory();
                                                        System.out.println(player.inventory.get(kb.nextInt()).description);
                                                        break;
                                                        }
                                                        catch (Exception e)
                                                        {
                                                            System.out.println("INVALID INPUT");
                                                        }

                                                    //Use
                                                    case 2:
                                                        try{
                                                        if (player.inventory.size()>0 && pantry.objects.size()>0) {
                                                            System.out.println(" Choose inventory item number first and press enter, then choose object number and press enter.");
                                                            System.out.println("Inventory Items");
                                                            player.listInventory();
                                                            System.out.println("----------");
                                                            System.out.println("Room Objects");
                                                            pantry.listInteractiveObjects();
                                                            player.useItem(player, player.inventory.get(kb.nextInt())
                                                                    , pantry.objects.get(kb.nextInt()), pantry);

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
                                                        }
                                                        catch (Exception e)
                                                        {
                                                            System.out.println("INVALID INPUT");
                                                        }

                                                    //Eat
                                                    case 3:
                                                        try {
                                                            player.listInventory();
                                                            player.eat(player, player.inventory.get(kb.nextInt()));
                                                            break;
                                                        }
                                                          catch (Exception e)
                                                    {
                                                        System.out.println("INVALID INPUT");
                                                    }


                                                    //Other
                                                    case 4:
                                                        try {
                                                            CodeLock code = new CodeLock();
                                                            code.passcode(player, diningRoom);
                                                            break;
                                                        }
                                                          catch (Exception e)
                                                            {
                                                                System.out.println("INVALID INPUT");
                                                            }


                                                            default:
                                                        System.out.println("Error in Inventory action selection ");
                                                }
                                                break;
                                                }
                                                catch (Exception e)
                                                {
                                                    System.out.println("INVALID INPUT");
                                                }
                                            case 4:
                                                try {
                                                    CodeLock code = new CodeLock();
                                                    code.passcode(player, diningRoom);
                                                    break;
                                                }
                                                  catch (Exception e)
                                                    {
                                                        System.out.println("INVALID INPUT");
                                                    }



                                                    case 0:
                                                        try{
                                                goBackFromPantry = true;
                                                System.out.println();
                                                System.out.println("--Back to room selection--");
                                                break;
                                                        }
                                                        catch (Exception e)
                                                        {
                                                            System.out.println("INVALID INPUT");
                                                        }
                                        }
                                    }
                                    break;
                                }
                                else {
                                    System.out.println(player.name + ": Dang I cant get in there... yet");
                                    System.out.println();
                                    goBack=false;
                                    break;
                                }
                                }
                                catch (Exception e)
                                {
                                    System.out.println("INVALID INPUT");
                                }

                            //dining
                            case 3:
                                try {
                                if (diningRoom.locked==false) {
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
                                        System.out.println("\t 4. Lever Lock");
                                        System.out.println("\t 0. Go Back");

                                        actionChoice = kb.nextInt();
                                        switch (actionChoice) {
                                            //Dining Actions
                                            case 1:

                                                int inspectChoice3;
                                                boolean goBackFromInspectDining = false;
                                                while (goBackFromInspectDining == false) {
                                                    if (diningRoom.objects.size()<2)
                                                    {
                                                        System.out.println(diningRoom.roomDescription2);
                                                    }
                                                    else
                                                    {
                                                        System.out.println(diningRoom.roomDescription);
                                                    }
                                                    System.out.println();
                                                    if (diningRoom.items.size() >0)
                                                    {
                                                        System.out.println("The Items in the room are");
                                                        diningRoom.listItems();
                                                    }
                                                    else
                                                    {
                                                        System.out.println("There are no more items of interest in this room");
                                                    }
                                                    System.out.println();
                                                    if (diningRoom.objects.size()>0)
                                                    {
                                                        System.out.println("Some other interesting things are ");
                                                        System.out.println(diningRoom.objects);
                                                    }
                                                    else
                                                    {
                                                        System.out.println("There are no interesting objects left in this room");
                                                    }
                                                    System.out.println("\t 1. Add Item to Inventory");
                                                    System.out.println("\t 0. Go Back");

                                                    inspectChoice3 = kb.nextInt();
                                                    switch (inspectChoice3) {
                                                        case 1:
                                                            try {
                                                                if (diningRoom.items.size() > 0) {
                                                                    diningRoom.takeItemFromRoom(player);
                                                                } else {
                                                                    System.out.println(player.name + ": Cant add " +
                                                                            "anything to my inventory if there is " +
                                                                            "nothing to add!");
                                                                }
                                                                break;
                                                            }
                                                              catch (Exception e)
                                                        {
                                                            System.out.println("Invalid Input");
                                                        }

                                                        case 0:
                                                            try {
                                                                goBackFromInspectDining = true;
                                                                System.out.println();
                                                                System.out.println("--Back to Dining--");
                                                                break;
                                                            }  catch (Exception e)
                                                            {
                                                                System.out.println("Invalid Input");
                                                            }

                                                        default:
                                                            System.out.println("Try again");
                                                            break;
                                                    }

                                                    break;
                                                }
                                                break;

                                            case 2:
                                                try{
                                                //player.chat(player, diningRoom.npc);
                                                Riddle riddle = new Riddle();
                                                riddle.RiddlePuzzle(diningRoom);
                                                break;
                                                }  catch (Exception e)
                                                {
                                                    System.out.println("Invalid Input");
                                                }

                                            case 3: try{
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
                                                        try{
                                                        System.out.println(" Which Item do you want to check?");
                                                        player.listInventory();
                                                        System.out.println(player.inventory.get(kb.nextInt()).description);
                                                        break;
                                                        }  catch (Exception e)
                                                        {
                                                            System.out.println("Invalid Input");
                                                        }

                                                    //Use
                                                    case 2:
                                                        try{
                                                        if (player.inventory.size() > 0 && diningRoom.objects.size() > 0) {
                                                            System.out.println(" Choose inventory item number first and press enter, then choose object number and press enter.");
                                                            System.out.println("Inventory Items"
                                                            );
                                                            player.listInventory();
                                                            System.out.println("----------");
                                                            System.out.println("Room Objects");
                                                            diningRoom.listInteractiveObjects();
                                                            player.useItem(player, player.inventory.get(kb.nextInt())
                                                                    , diningRoom.objects.get(kb.nextInt()), diningRoom);

                                                        } else if (player.inventory.size() <= 0 && diningRoom.objects.size() > 0) {
                                                            System.out.println(player.name + ": What am i going to use? Ive got nothing in my bag..");
                                                        } else {
                                                            System.out.println(player.name + ": There isnt anything  " +
                                                                    "left in here to interact with");
                                                        }
                                                        break;
                                                        }  catch (Exception e)
                                                        {
                                                            System.out.println("Invalid Input");
                                                        }

                                                    //Eat
                                                    case 3:
                                                        try{
                                                        player.listInventory();
                                                        player.eat(player, player.inventory.get(kb.nextInt()));

                                                        break;
                                                        }  catch (Exception e)
                                                        {
                                                            System.out.println("Invalid Input");
                                                        }

                                                    //Other
                                                    case 4:
                                                        try{
                                                        System.out.println("Other actions");
                                                        break;
                                                        }  catch (Exception e)
                                                        {
                                                            System.out.println("Invalid Input");
                                                        }

                                                    default:
                                                        System.out.println("Error in Inventory action selection ");
                                                }
                                                break;
                                            }  catch (Exception e)
                                            {
                                                System.out.println("Invalid Input");
                                            }
                                            case 4:
                                                try{
                                                System.out.println("Choose inventory item number first and press enter, then choose object number and press enter");
                                                player.listInventory();
                                                System.out.println("-----");
                                                diningRoom.listInteractiveObjectsHidden();
                                                LeverLock lock = new LeverLock();
                                                lock.leverLock(player,player.inventory.get(kb.nextInt()),
                                                        diningRoom.objects.get(kb.nextInt()),magicShelf);
                                                break;
                                                }  catch (Exception e)
                                                {
                                                    System.out.println("Invalid Input");
                                                }
                                            case 0:
                                                try{
                                                goBackFromDinning = true;
                                                System.out.println();
                                                System.out.println("--Back to room selection--");
                                                break;
                                                }  catch (Exception e)
                                                {
                                                    System.out.println("Invalid Input");
                                                }
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
                                }
                                catch (Exception e)
                                {
                                    System.out.println("INVALID INPUT");
                                }
                            //Magic shelf
                            case 4:
                                try{
                                if (magicShelf.locked==false) {
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
                                        System.out.println("\t 4. Give a Treat");
                                        System.out.println("\t 0. Go Back");

                                        actionChoice4 = kb.nextInt();
                                        switch (actionChoice4) {
                                            //Kitchen Actions
                                            case 1:
                                                try{
                                                int inspectChoice4;
                                                boolean goBackFromInspectMagicShelf = false;
                                                while (goBackFromInspectMagicShelf == false) {
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

                                                    inspectChoice4 = kb.nextInt();
                                                    switch (inspectChoice4) {
                                                        case 1:
                                                            try{
                                                            if (magicShelf.items.size()>0) {
                                                                magicShelf.takeItemFromRoom(player);
                                                            }
                                                            else
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
                                                            }

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
                                                }  catch (Exception e)
                                                {
                                                    System.out.println("Invalid Input");
                                                }
                                            case 2:
                                                try{
                                                player.chat(player, magicShelf.npc);
                                                break;
                                                }
                                                catch (Exception e)
                                                {
                                                    System.out.println("Invalid Input");
                                                }

                                            case 3:
                                                try{
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
                                                        try{
                                                        System.out.println(" Which Item do you want to check?");
                                                        player.listInventory();
                                                        System.out.println(player.inventory.get(kb.nextInt()).description);
                                                        break;
                                                        }
                                                        catch (Exception e)
                                                        {
                                                            System.out.println("Invalid Input");
                                                        }

                                                    //Use
                                                    case 2:
                                                        try{
                                                        if (player.inventory.size()>0 && magicShelf.objects.size()>0) {
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
                                                        }

                                                    //Eat
                                                    case 3: try{
                                                        player.listInventory();
                                                        player.eat(player, player.inventory.get(kb.nextInt()));

                                                        break;
                                                    }
                                                    catch (Exception e)
                                                    {
                                                        System.out.println("Invalid Input");
                                                    }

                                                    //Other
                                                    case 4:
                                                        try{
                                                        System.out.println("Other actions");
                                                        break;
                                                        }
                                                        catch (Exception e)
                                                        {
                                                            System.out.println("Invalid Input");
                                                        }

                                                    default:
                                                        System.out.println("Error in Inventory action selection ");
                                                }
                                                break;
                                                }
                                                catch (Exception e)
                                                {
                                                    System.out.println("Invalid Input");
                                                }
                                            case 4:
                                                try{
                                                System.out.println(magicShelf.npc.name + ": Have you brought me my " +
                                                        "favorite " +
                                                        "treat!?!?!?");
                                                System.out.println(player.name + ": How about this?");
                                                player.listInventory();
                                                System.out.println("------");
                                                magicShelf.listInteractiveObjects();
                                                GiveFood food = new GiveFood();
                                                food.giveFood(player, magicShelf,player.inventory.get(kb.nextInt()),
                                                        magicShelf.objects.get(kb.nextInt()));
                                                break;
                                                }
                                                catch (Exception e)
                                                {
                                                    System.out.println("Invalid Input");
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
                                }  catch (Exception e)
                                {
                                    System.out.println("Invalid Input");
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
                    try{
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
                    System.out.println("\t 0. Go back");

                    itemChoice = kb.nextInt();
                    switch (itemChoice)
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
                            }

                        //Use
                        case 2:
                            try{
                            System.out.println("I need to be in a room to use anything.");
                            break;
                            }
                            catch (Exception e)
                            {
                                System.out.println("Invalid Input");
                            }

                        //Eat
                        case 3:
                            try{
                            player.listInventory();
                            player.eat(player, player.inventory.get(kb.nextInt()));

                            break;
                            }
                            catch (Exception e)
                            {
                                System.out.println("Invalid Input");
                            }

                        default:
                        System.out.println("Error in Inventory action selection ");
                    }
                break;
                    }
                    catch (Exception e)
                    {
                        System.out.println("Invalid Input");
                    }

                //the freezer/'Exit'
                case 3: try{
                    if (player.inventory.size()>3) {
                        Freezer freezer = new Freezer();
                        System.out.println("Now to place the four key pieces in order.");
                        player.listInventory();
                        freezer.Freezer(player, player.inventory.get(kb.nextInt()), player.inventory.get(kb.nextInt()), player.inventory.get(kb.nextInt()), player.inventory.get(kb.nextInt()));
                    }
                    else {
                        System.out.println("The freezer has four keys.. I don't even have four items in my inventory");
                    }
                    break;
                }
                catch (Exception e)
                {
                    System.out.println("Invalid Input");
                }

                default:
                    System.out.println("Invalid selection...Try Again");

            }//end Choice action
        }
    }//End Main
}//end Main