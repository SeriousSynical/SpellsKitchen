import java.util.ArrayList;
import java.util.Scanner;

public class Player extends Character {

    int pronounsInt = 0;
    Scanner s = new Scanner(System.in);
    // Initialization
    protected ArrayList<Item> inventory;


    // Constructors
    public Player(String name, Pronouns pronouns, String description) {

        super(name, pronouns, description);
        this.inventory = new ArrayList<>();

    }


    // Getters
    public ArrayList<Item> getInventory() {

        return inventory;

    }


    // Setters
    public void setInventory(ArrayList<Item> inventory) {

        this.inventory = inventory;

    }

    //chat with NPC in room
    public void chat (Player player, NPC npc) {

        boolean flag = false;
        do {

            System.out.println("1. Who are you?");
            System.out.println("2. How can i open this?");
            System.out.println("3. Why are you here?");
            System.out.println("0. Exit");

            int answer = s.nextInt();
            if (answer == 1) {

                System.out.println();
                System.out.println(player.name + ": Who are you?");
                System.out.println(npc.name + ": I am " + npc.name + ".");
                System.out.println();

            } else if (answer == 2) {

                System.out.println();
                System.out.println(player.name + ": How can I open this?");
                System.out.println(npc.name + ": Now why would I tell you that?");
                System.out.println();

            } else if (answer == 3) {

                System.out.println();
                System.out.println(player.name + ": Why are you here?");
                System.out.println(npc.name + ": That is entirely none of your business, thief.");
                System.out.println();

            } else if (answer == 0) {

                flag = true;

            }

        } while (!flag);

    }

    // adds a new Item to Players Inventory
    public void addItem(Item item) {

        this.inventory.add(item);

    }

    // Breaking an item
    public void breakItem (Item item)
    {
        if ((item.breakable = true) && (item.breakableClue = true))
        {
            System.out.println("You just broke the " + item.name + ".");
            Item i1 = new Item("broken" + item.name, "Just a plain broken" + item.name,false,false,false,false,0);
            Item i2 = new Item("TestKey","A key  inside the " + item.name,true,false,false,false,0);

        }
        else if ((item.breakableClue = false) && (item.breakable = true))
        {
            System.out.println("You just broke the " + item.name);
            item.name = "Broken " + item.name;
            item.description = "Just a broken " + item.name;
        }
        else
        {
            System.out.println("You can't break that item");
        }

    }

    // Checking inventory
    public String checkInventory() {

        String inventories = "";

        for (int i = 0; i < inventory.size(); i++) {

            inventories += inventory.get(i) +"\n";

        }
        if (inventory.size()<1)
        {
            System.out.println("You have nothing in your inventory");
        }
        return inventories;

    }

    public void listInventory()
    {
        for (int i = 0; i < inventory.size(); i++) {

            System.out.println(i +": " + inventory.get(i));

        }
    }

    public Player createPlayer()
    {
        boolean flag =true;
        Player player1 = new Player("",Pronouns.masculine,"");
        do {

            try {

                System.out.print("What is your name? \nName: ");
                player1.name = s.nextLine();
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
                pronounsInt= s.nextInt();
                if (pronounsInt == 1) {

                    player1.pronouns = Pronouns.masculine;
                    flag = false;

                } else if (pronounsInt == 2) {

                    player1.pronouns = Pronouns.feminine;
                    flag = false;

                } else if (pronounsInt == 3) {

                    player1.pronouns = Pronouns.nonBinary;
                    flag = false;

                } else {

                    System.out.println("Input out of bounds. Try again.");

                }

            } catch (Exception e) {

                System.out.println("Invalid input. Try again.");
                s.nextLine();

            }


        } while (flag);
        System.out.println(s.nextLine());


        System.out.println("Describe yourself for me."); // created for the player description
        player1.description = s.nextLine();
        return player1;
    }

    public void useItem(Player player, Item item, InteractableObjects object, Rooms room)
    {

        if (item.objectConnection == object.itemConnection)
        {
            System.out.println(room.actionMessage);
            for (int i = 0; i <room.hiddenItems.size() ; i++) {


                room.items.add(new Item(room.hiddenItems.get(i).name, room.hiddenItems.get(i).description,
                        room.hiddenItems.get(i).usable, room.hiddenItems.get(i).eatable, room.hiddenItems.get(i).breakable,
                        room.hiddenItems.get(i).breakableClue, room.hiddenItems.get(i).objectConnection));
            }

            room.objects.remove(object);
            room.setFlag(true);

        }

        else
        {
            System.out.println(player.name + ": What am I thinking? That wont work");
        }

    }





}
