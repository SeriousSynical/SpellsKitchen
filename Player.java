import java.util.ArrayList;

public class Player extends Character {

    // Initialization
    protected ArrayList<Item> inventory;


    // Constructors
    public Player(String name, Pronouns pronouns, String description, boolean[] interactions) {

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

    // Breaking an item -- Brandon
    public Item breakItem (Item item)
    {
        if ((item.breakable = true) && (item.breakableClue = true))
        {
            System.out.println("You just broke the " + item + ".");
            Item i1 = new Item("broken" + item.name, "Just a plain broken" + item.name,false,false,false, false);
            Item i2 = new Item("Key","A key hidden inside the " + item.name,true,false,false,false);

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
        return item;
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


}
