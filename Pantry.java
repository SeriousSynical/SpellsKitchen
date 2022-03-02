public class Pantry extends Rooms
{
    public Pantry(String roomName, String roomDescription)
    {
        super(roomName,roomDescription);
        NPC pantryGoblin = new NPC("Bob",Pronouns.masculine,"A little dunce even for a goblin");
        Item vase = new Item("Vase", "A small vase",false,false,true,false);
        Item wood = new Item("Bundle of wood", "Just a bundle of oak wood",true,false,false,false);

        setNpc(pantryGoblin);
    }
}
