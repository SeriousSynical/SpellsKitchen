import java.util.ArrayList;

public class MagicShelf extends Rooms
{

    public MagicShelf(String roomName, String roomDescription)
    {
        super(roomName, roomDescription);
        ArrayList<Item> magicShelfItems = new ArrayList<>();
        ArrayList<InteractableObjects> magicShelfObjects = new ArrayList<>();
        ArrayList<HiddenItems> hiddenMagicShelfItems = new ArrayList<>();

        Item book = new Item("Cook Book","Has all kinds of delicous treats",false,false,false,false,0,"");


        NPC elfOnTheShelf = new NPC("Tinker",Pronouns.feminine,"A sweet little elf!!", true);

        InteractableObjects junk = new InteractableObjects("junk","junk",0,0);

        InteractableObjects tinker = new InteractableObjects("Tinker","Tinker the elf",10,0);

        setNpc(elfOnTheShelf);

        setItems(magicShelfItems);

        magicShelfObjects.add(tinker);

        setObjects(magicShelfObjects);
    }
}

