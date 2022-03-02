import java.util.ArrayList;

public class Rooms
{
    String roomName;
    String roomDescription;
    NPC npc;
    ArrayList<Item> items;

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




}
