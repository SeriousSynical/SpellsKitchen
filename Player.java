import java.util.ArrayList;

public class Player extends Character {

    // Initialization
    protected ArrayList<Object> inventory;


    // Constructors
    public Player(String name, Pronouns pronouns, String description, boolean[] interactions) {

        super(name, pronouns, description, interactions);
        this.inventory = new ArrayList<>();

    }


    // Getters
    public ArrayList<Object> getInventory() {

        return inventory;

    }


    // Setters
    public void setInventory(ArrayList<Object> inventory) {

        this.inventory = inventory;

    }

    //chat with NPC in room -- Brandon
    public void chat (Player player, NPC npc)
    {
        boolean flag = false;
        do
        {
            System.out.println("1. Who are you?");
            System.out.println("2. How can i open this?");
            System.out.println("3. Why are you here?");
            System.out.println("0. Exit");

            int answer = s.nextInt();
            {
                if (answer == 1)
                {
                    System.out.println();
                    System.out.println(player.name + ": Who are you?");
                    System.out.println(npc.name + ": I am " + npc.name + ".");
                    System.out.println();
                }
                else if (answer == 2)
                {
                    System.out.println();
                    System.out.println(player.name + ": How can I open this?");
                    System.out.println(npc.name + ": Now why would I tell you that?");
                    System.out.println();
                }
                else if (answer == 3)
                {
                    System.out.println();
                    System.out.println(player.name + ": Why are you here?");
                    System.out.println(npc.name + ": That is entirely none of your business, thief.");
                    System.out.println();
                }
                else if (answer == 0)
                {
                    flag = true;
                }
            }
        }
            while (flag == false);

    }

    // adds a new Item to Players Inventory -- Brandon -- This may not be needed at all..
    public void addItem(Player player, Item item)
    {
        player.inventory.add(item);

    }
}