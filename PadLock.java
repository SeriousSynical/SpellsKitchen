import java.util.Scanner;

public class PadLock {

    public void padLock(Player player, Rooms room, Item item, InteractableObjects io){
        Scanner s = new Scanner(System.in);

        if (item.objectConnection == io.itemConnection)
        {
            System.out.println("The room is now unlocked!");
            room.locked=false;
        }
        else
        {
            System.out.println(player.name + ": That doesn't work...");
        }


    }
}
