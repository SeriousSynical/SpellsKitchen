import java.util.ArrayList;

public class DiningArea extends Rooms
{
    public DiningArea(String roomName, String roomDescription)
    {
        super(roomName,roomDescription);
        ArrayList<Item> diningItems = new ArrayList<>();
        ArrayList<InteractableObjects> dinningRoomObjects = new ArrayList<>();
        ArrayList<HiddenItems> hiddenDinningRoomItems = new ArrayList<>();

        Item finalKeyPiece3 = new Item("Green Crystal","Piece of a larger Crystal",false,false,false,
                false,0,"");

        InteractableObjects fireplace = new InteractableObjects("A small dwindling fire","So small it barley puts off" +
                " any heat",20,1);
        InteractableObjects leverKey = new InteractableObjects("Lever Mechanism","This is how to get to the magic " +
                "shelf",2,1);

        HiddenItems lever = new HiddenItems("Lever","Used to open the door to the magic shelf!",false,false,false,
                false,2,1,"");


        NPC butlerGoblin = new NPC("Leonardo",Pronouns.masculine,"Rude yet sophisticated", false);



        setRoomDescription("Its so cold in here everything is frozen!\nThe lever to open the next room is broken, ive" +
                " got to find it under all this ice!");
        setRoomDescription2("Now its nice and toasty in here. Look the lever handle is unfrozen on the floor");

        leverKey.hide=true;

        setActionMessage("Wow that fire is hot now!",2);
        setNpc(butlerGoblin);

        diningItems.add(finalKeyPiece3);

        hiddenDinningRoomItems.add(lever);

        setHiddenItems(hiddenDinningRoomItems);
        setItems(diningItems);

        dinningRoomObjects.add(fireplace);
        dinningRoomObjects.add(leverKey);


        setObjects(dinningRoomObjects);

    }
}

