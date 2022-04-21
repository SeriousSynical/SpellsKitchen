import java.util.ArrayList;
import java.util.Scanner;

public class Kitchen extends Rooms
{
    public Kitchen(String roomName, String roomDescription)
    {
        super(roomName,roomDescription);
        ArrayList<Item> kitchenItems = new ArrayList<>();
        ArrayList<InteractableObjects> kitchenObjects = new ArrayList<>();
        ArrayList<HiddenItems> hiddenKitchenItems = new ArrayList<>();

        NPC kitchenGoblin = new NPC("Henry",Pronouns.masculine,"A devilish creature yet a heavenly cook", false);
        Item knife = new Item("Knife", "A very sharp knife",true,false,false,false,1,"");
        Item breadBox = new Item("Bread Box", "A locked bread box",false,false,true,false,0,"");
        Item wood =  new Item("Bundle of wood","Smells like oak",true,false,false,false,20,"");


        InteractableObjects rope = new InteractableObjects("Rope","A Rope tied to the wall holding something up above" +
                " the counter",1,1);
        InteractableObjects pantryDoorLock = new InteractableObjects("Pantry Pad Lock","Pad lock for the pantry door",2
                ,3);
       // InteractableObjects oven = new InteractableObjects("Oven", "A Rusty old oven, looks to be missing a knob",
        // 2,2);

        HiddenItems key = new HiddenItems("Key","A Shiny key",true,false,false,false,2,1,"");
        HiddenItems cookieJar = new HiddenItems("Cookie Jar", "Cookies in a cookie jar",false,true,false,false,0,1,
                "Look! After eating the cookies the bottom of the jar shows a piece of paper that reads '9564' ");
        HiddenItems finalKeyPiece1 = new HiddenItems("Red Crystal","Piece of a larger Crystal",false,false,false,
                false,0,1,"");

        setRoomDescription("Wow this place is massive... There seems to be something hanging from the ceiling. I Bet there are all kinds of goodies stashed there! \n Now how to cut them down...?");
        setNpc(kitchenGoblin);
        setActionMessage("BANG, The rope holding something fell to the counter, What is in it?",1);
        setActionMessage2("Well Things sure got alot warmer in here.",2);
        setRoomDescription2("Well, that sure did cause a mess...");



        kitchenItems.add(knife);
        kitchenItems.add(breadBox);
        kitchenItems.add(wood);

        hiddenKitchenItems.add(key);
        hiddenKitchenItems.add(finalKeyPiece1);
        hiddenKitchenItems.add(cookieJar);


        setHiddenItems(hiddenKitchenItems);

        setItems(kitchenItems);



        kitchenObjects.add(rope);
       // kitchenObjects.add(oven);
        kitchenObjects.add(pantryDoorLock);
        pantryDoorLock.setHide(true);
        setObjects(kitchenObjects);

    }

}
