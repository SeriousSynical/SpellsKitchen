public class DiningArea extends Rooms
{
    public DiningArea(String roomName, String roomDescription)
    {
        super(roomName,roomDescription);
        NPC butlerGoblin = new NPC("Leonardo",Pronouns.masculine,"Rude yet sophisticated");
        Item knife = new Item("Knife", "A very sharp knife",true,false,false,false);
        Item breadBox = new Item("Bread Box", "A locked bread box",false,false,true,true);

        setNpc(butlerGoblin);
    }
}
