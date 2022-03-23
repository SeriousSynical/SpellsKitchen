import java.util.ArrayList;

public class Kitchen extends Rooms
{
    public Kitchen(String roomName, String roomDescription)
    {
        super(roomName,roomDescription);
        ArrayList<Item> kitchenItems = new ArrayList<>();
        ArrayList<InteractableObjects> kitchenObjects = new ArrayList<>();
        ArrayList<HiddenItems> hiddenKitchenItems = new ArrayList<>();

        NPC kitchenGoblin = new NPC("Henry",Pronouns.masculine,"A devilish creature yet a heavenly cook");
        Item knife = new Item("Knife", "A very sharp knife",true,false,false,false,1);
        Item breadBox = new Item("Bread Box", "A locked bread box",false,false,true,true,0);
        InteractableObjects rope = new InteractableObjects("Rope","A Rope tied to the wall holding something up above the counter",1);
        HiddenItems key = new HiddenItems("Key","A Shiny key",true,false,false,false,0);

        setRoomDescription("Wow this place is massive... There seems to be something hanging from the ceiling. I Bet there are all kinds of goodies stashed there! \n Now how to cut them down...?");
        setNpc(kitchenGoblin);
        setActionMessage("BANG, The rope holding something fell to the counter, What is in it?");
        setRoomDescription2("Well, that sure did cause a mess...");



        kitchenItems.add(knife);
        kitchenItems.add(breadBox);
        hiddenKitchenItems.add(key);
        setHiddenItems(hiddenKitchenItems);

        setItems(kitchenItems);

        kitchenObjects.add(rope);
        setObjects(kitchenObjects);







    }


}
