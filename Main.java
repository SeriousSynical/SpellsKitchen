import java.util.Scanner;

    public class Main 
    {
        public static void main(String[] args) 
        {
            int choice;
            Scanner kb = new Scanner(System.in);

            System.out.println("");
            System.out.println("*Game greeting*");

            System.out.println("Select an action");
            System.out.println("\t 1. Inspect room ");
            System.out.println("\t 2. Talk to (NPC) ");
            System.out.println("\t 3. View inventory");
            System.out.println("\t 4. (other actions)");
            choice = kb.nextInt();

            switch(choice)
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



                        switch(roomChoice)
                            {
                                //kitchen
                                case 1:
                                    System.out.println("*Explore kitchen* + actions");
                                break;

                                //pantry
                                case 2:
                                    System.out.println("*Explore pantry* + actions");
                                break;

                                //dining
                                case 3:
                                    System.out.println("*Explore dining room* + actions");
                                break;

                                //Magic shelf
                                case 4:
                                    System.out.println("*Explore Shelf* + actions");
                                break;

                                default:
                                System.out.println("Invalid");
                            }   
                    //do{}while(choice != 0);

                break;

                //Talk to npc
                case 2:
                    System.out.println("*Talk to npc (gives clues)*");
                break;

                //View inventory
                case 3:
                    int itemChoice;

                    System.out.println("print getInventory();");
                    System.out.println("Select inventory action");
                    System.out.println("\t 1. Inspect item");
                    System.out.println("\t 2. Use");
                    System.out.println("\t 3. Eat");
                    System.out.println("\t 4. Other");
                    System.out.println("\t 0. Go back");

                    itemChoice = kb.nextInt();
                        switch(itemChoice)
                        {
                            //Inspect
                            case 1:
                                System.out.println("*select item and give description*");
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
                        }

                break;

                //Other actions
                case 4:
                    System.out.println("");
                break;

                default:
                System.out.println("Invalid");
            }//end Choice actions
        kb.close();
        }

    }
        //=========================================Action choices that link to other methods^^
        run();

  }//end Main

    public static void run() {

        // Initialization
        boolean flag;
        int pronounsInt = 0;
        String name = null;
        Pronouns pronouns = null;
        Scanner keyboard = new Scanner(System.in);
        String[] actionArray = {"Inspect", "Use", "Eat", "Break"};
        String command = "";
        String action = "";
        String object = "";

        // Testing Objects
        Player player = new Player("",pronouns, "", new boolean[5]);
        NPC npc = new NPC("Skwash the gourdless",Pronouns.masculine,"Fowl and Hideously wrinkly", new boolean[5]);
        Item i1 = new Item("squash","smelly squash", false,true,false,false);
        Item i2 = new Item("key","golden key", true, false, false, false);
        Item i3 = new Item("hammer","rusty hammer", true, false,false, false);
        player.addItem(i1);


        // Prompt Name & Pronouns
        flag = true;
        do {

            try {

                System.out.print("What is your name? \nName: ");
                player.name = keyboard.nextLine(); //had to adjust to assign player name
                flag = false;

            } catch (Exception e) {

                System.out.println("Invalid input. Try again.");

            }

        } while (flag);
        System.out.println();

        flag = true;
        do {

            try {

                System.out.print("What are your pronouns? \n1: he/him \n2: she/her \n3: they/them \nPronouns: ");
                pronounsInt= keyboard.nextInt();
                if (pronounsInt == 1) {

                    pronouns = Pronouns.masculine;
                    flag = false;

                } else if (pronounsInt == 2) {

                    pronouns = Pronouns.feminine;
                    flag = false;

                } else if (pronounsInt == 3) {

                    pronouns = Pronouns.nonBinary;
                    flag = false;

                } else {

                    System.out.println("Input out of bounds. Try again.");

                }

            } catch (Exception e) {

                System.out.println("Invalid input. Try again.");
                keyboard.nextLine();

            }

        } while (flag);
        System.out.println(keyboard.nextLine());


        System.out.println("Describe yourself for me."); // created for the player description
        player.description = keyboard.nextLine();


        // Input Action
        System.out.print("Command: ");
        command = keyboard.nextLine();
        command.replace(" ", "");

        // Decipher Action
        action = "";
        flag = true;
        for (int i = 0; i < command.length(); i++) {

            if (flag) {

                action += command.charAt(i);

            } else {

                object += command.charAt(i);

            }

            for (String viableAction : actionArray) {

                if (action.equalsIgnoreCase(viableAction)) {

                    flag = false;

                }

            }

        }

        flag = true;
        if (action.equalsIgnoreCase("Inspect")) {

            for (Item item : player.getInventory()) {

                if (object.equalsIgnoreCase(item.getName())) {

                    System.out.println(item.getDescription());
                    flag = false;

                }

            }

            if (flag) {

                System.out.println("You do not have that item.");

            }

        } else {

            System.out.println("I'm not sure how to do that.");

        }

    }

}
