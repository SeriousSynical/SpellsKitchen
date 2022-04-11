public class GiveFood {
    public void giveFood(Player player, Rooms room,  Item item, InteractableObjects io)
    {


        if (item.objectConnection == io.itemConnection)
        {
            System.out.println(room.npc.name+": YES YES YES This is it!!!! I just LOVE eggs!!!!");
            System.out.println(room.npc.name+": Thank you so much!!! to open the freezer you need four crystal " +
                    "pieces! \n I actually have one of them! Here ill lay it on the shelf while I snack on this egg!");

            room.addItemsToRoom(new Item("Blue Crystal","Piece of a larger Crystal",false,false,false,
                    false,0,""));
            player.inventory.remove(item);

        }
        else
        {
            System.out.println(room.npc.name+": No... unfortunately no...");
        }

    }
}
