import java.util.ArrayList;

public class Kitchen extends Rooms
{
    public Kitchen(String roomName, String roomDescription)
    {
        super(roomName,roomDescription);
        NPC kitchenGoblin = new NPC("henry",Pronouns.masculine,"A devilish creature yet a heavenly cook");
        Item knife = new Item("Knife", "A very sharp knife",true,false,false,false);
        Item breadBox = new Item("Bread Box", "A locked bread box",false,false,true,true);

        setNpc(kitchenGoblin);





    }


}
