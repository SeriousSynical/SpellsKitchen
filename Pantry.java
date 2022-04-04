import java.util.ArrayList;

public class Pantry extends Rooms
{
    public Pantry(String roomName, String roomDescription)
    {
        super(roomName,roomDescription);

        ArrayList<Item> pantryItems = new ArrayList<>();
        ArrayList<InteractableObjects> pantryObjects = new ArrayList<>();
        ArrayList<HiddenItems> hiddenPantryItems = new ArrayList<>();

        NPC pantryGoblin = new NPC("Bob",Pronouns.masculine,"A little dunce even for a goblin", false);

        Item soup = new Item("Can of Soup","Chicken noodle soup",false,true,false,false,0,"Just like mom made");
        Item whisk = new Item("Whisk", "Just a plain metal whisk",false,false,false,false,0,"");
        Item bread =  new Item("Loaf of bread","Pumpernickel",false,true,false,false,0,"buttery goodness!");
        Item egg = new Item("Egg","A HUGE egg",true,false,false,false,10,"");
        Item finalKeyPiece2 = new Item("Yellow Crystal","Piece of a larger Crystal",false,false,false,
                false,0,"");

        InteractableObjects junk = new InteractableObjects("junk","junk",100,1000);


        setRoomDescription("Lots and lots of food stuffs in here! There seems to be a Passcode lock on the next " +
                "door\n Is that cookie crumbs on on the number pad?");

        setNpc(pantryGoblin);

        pantryItems.add(soup);
        pantryItems.add(whisk);
        pantryItems.add(bread);
        pantryItems.add(egg);
        pantryItems.add(finalKeyPiece2);

        pantryObjects.add(junk);




        setItems(pantryItems);

        setObjects(pantryObjects);

        setHiddenItems(hiddenPantryItems);




    }
}
