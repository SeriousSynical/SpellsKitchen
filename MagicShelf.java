public class MagicShelf extends Rooms
{

    public MagicShelf(String roomName, String roomDescription)
    {
        super(roomName, roomDescription);
        NPC elfOnTheShelf = new NPC("Tinker",Pronouns.feminine,"A sweet little elf!!");
        Item knife = new Item("Knife", "A very sharp knife",true,false,false,false);
        Item breadBox = new Item("Bread Box", "A locked bread box",false,false,true,true);
        setNpc(elfOnTheShelf);
    }
}

