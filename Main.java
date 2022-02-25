import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        run();


    }

    public static void run() {

        // Initialization
        boolean flag;
        boolean[] array = {true};
        int pronounsInt = 0;
        String name = null;
        Pronouns pronouns = null;
        Scanner keyboard = new Scanner(System.in);

        // just using these to try new methods out -- Brandon


        Player player = new Player("",pronouns, "", new boolean[5]);
        NPC npc = new NPC("Skwash the gourdless",Pronouns.masculine,"Fowl and Hideously wrinkly", new boolean[5]);
        Item i1 = new Item("squash","smelly squash", new boolean[2]);
        Item i2 = new Item("key","golden key", new boolean[2]);
        Item i3 = new Item("hammer","rusty hammer", new boolean[2]);






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

// Testing the chat method, add method, break method, and checking inventory-- Brandon
        player.chat(player,npc);
        player.addItem(player,i1);
        player.addItem(player,i2);
        player.addItem(player,i3);

        System.out.println(player.checkInventory());

        player.breakItem(i1);

        System.out.println(player.checkInventory());

    }

}