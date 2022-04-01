import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Scanner;

public class Rooms
{
    String roomName;
    String roomDescription;
    String roomDescription2;
    NPC npc;
    ArrayList<Item> items;
    ArrayList<InteractableObjects> objects;
    ArrayList<HiddenItems> hiddenItems;
    Player player = new Player("",Pronouns.masculine,"");
    boolean locked;
    String actionMessage;
    boolean flag= false;

    Scanner kb = new Scanner(System.in);

    public Rooms(String roomName, String roomDescription)
    {
        this.roomDescription = roomDescription;
        this.roomName = roomName;
    }

    public String getRoomName()
    {
        return roomName;
    }

    public void setRoomName(String roomName)
    {
        this.roomName = roomName;
    }

    public String getRoomDescription()
    {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription)
    {

            this.roomDescription = roomDescription;
        }

    public void setRoomDescription2(String roomDescription2)
    {

            this.roomDescription2=roomDescription2;
        }

public void setFlag(boolean b){
        this.flag=b;
}

    public NPC getNpc()
    {
        return npc;
    }

    public void setNpc(NPC npc)
    {
        this.npc = npc;
    }

    public ArrayList<Item> getItems()
    {
        return items;
    }

    public void setItems(ArrayList<Item> items)
    {
        this.items = items;
    }

    public void displayItems()
    {
        System.out.println(items);
    }

    public void addItemsToRoom(Item item)
    {
        this.items.add(item);
    }

    public ArrayList<InteractableObjects> getObjects() {
        return objects;
    }

    public void setObjects(ArrayList<InteractableObjects> objects) {
        this.objects = objects;
    }
    public void setHiddenItems(ArrayList<HiddenItems> Items)
    {
        this.hiddenItems=Items;
    }

    public void deleteItemsFromRoom(Item item)
    {
        items.remove(item);
    }
    public Item takeItemFromRoom(Player player)
    {
        System.out.println("Which Item would you like to add?");
        for (int i = 0; i < items.size() ; i++)
        {
            System.out.println(i  + ": " + items.get(i));
        }
        int selection;
        selection=kb.nextInt();
        player.addItem(items.get(selection));
        System.out.println("You just added "+ items.get(selection).name + " to your inventory");
        deleteItemsFromRoom(items.get(selection));
        System.out.println();
        return null;

    }
    public void listInteractiveObjects()
    {
        for (int i = 0; i < objects.size(); i++) {

            System.out.println(i +": " + objects.get(i));

        }
    }

    public void listItems()
    {
        System.out.println(items);
    }

    public String getActionMessage() {
        return actionMessage;
    }

    public void setActionMessage(String actionMessage) {
        this.actionMessage = actionMessage;
    }



}
