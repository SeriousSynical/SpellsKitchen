import java.util.ArrayList;

public class MagicShelf extends Rooms
{

    public MagicShelf(String roomName, String roomDescription)
    {
        super(roomName, roomDescription);
        ArrayList<Item> magicShelfItems = new ArrayList<>();
        NPC elfOnTheShelf = new NPC("Tinker",Pronouns.feminine,"A sweet little elf!!");

        setNpc(elfOnTheShelf);

        setItems(magicShelfItems);
    }
}

