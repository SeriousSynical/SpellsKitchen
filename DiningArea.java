import java.util.ArrayList;

public class DiningArea extends Rooms
{
    public DiningArea(String roomName, String roomDescription)
    {
        super(roomName,roomDescription);
        ArrayList<Item> diningItems = new ArrayList<>();
        NPC butlerGoblin = new NPC("Leonardo",Pronouns.masculine,"Rude yet sophisticated");
        Item knife = new Item("Knife", "A very sharp knife",true,false,false,false,0);
        Item breadBox = new Item("Bread Box", "A locked bread box",false,false,true,true,0);

        setNpc(butlerGoblin);

        diningItems.add(knife);
        diningItems.add(breadBox);
        setItems(diningItems);
    }
}

