public class LeverLock {
    public void leverLock(Player player, Item item, InteractableObjects io ,Rooms room)
    {
        if(item.objectConnection == io.itemConnection)
        {
            System.out.println("The door opened to the Magic Shelf!!");
            room.locked=false;

        }
        else
        {
            System.out.println(player.name+": Well, that didnt work.");
        }
    }
}
