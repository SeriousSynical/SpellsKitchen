import java.util.ArrayList;

public class Pantry extends Rooms
{
    public Pantry(String roomName, String roomDescription)
    {
        super(roomName,roomDescription);

        ArrayList<Item> pantryItems = new ArrayList<>();
        ArrayList<InteractableObjects> pantryObjects = new ArrayList<>();
        ArrayList<HiddenItems> hiddenPantryItems = new ArrayList<>();
/*
        NPC pantryGoblin = new NPC("Bob",Pronouns.masculine,"A little dunce even for a goblin");
        Item knob = new Item("Knob", "A knob that looks like it goes to something",true,false,false,false,2);
        Item wood = new Item("Bundle of wood", "Just a bundle of oak wood",true,false,false,false,0);
        InteractableObjects rope = new InteractableObjects("Rope","A Rope tied to the wall holding something up above" +
                " the counter",1,1);
        InteractableObjects oven = new InteractableObjects("Oven", "A Rusty old oven, looks to be missing a knob",2,2);
        HiddenItems keyTest  = new HiddenItems("keytest","test",false,false,false,false ,0,99);

        //setRoomDescription();
        setNpc(pantryGoblin);
        //setActionMessage();
       // setActionMessage2();
        setRoomDescription2("Well, that sure did cause a mess...");



        pantryItems.add(knob);
        pantryItems.add(wood);
        hiddenPantryItems.add(keyTest);
        setHiddenItems(hiddenPantryItems);

        setItems(pantryItems);

        pantryObjects.add(rope);
        pantryObjects.add(oven);
        setObjects(pantryObjects);
*/


    }
}
