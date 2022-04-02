import java.util.ArrayList;

public class DiningArea extends Rooms
{
    public DiningArea(String roomName, String roomDescription)
    {
        super(roomName,roomDescription);
        ArrayList<Item> diningItems = new ArrayList<>();
        NPC butlerGoblin = new NPC("Leonardo",Pronouns.masculine,"Rude yet sophisticated");


        setNpc(butlerGoblin);


        setItems(diningItems);
    }
}

