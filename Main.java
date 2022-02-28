import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        run();

    }

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
        Item i1 = new Item("squash","smelly squash", false,true,false);
        Item i2 = new Item("key","golden key", true, false, false);
        Item i3 = new Item("hammer","rusty hammer", true, false,false);
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