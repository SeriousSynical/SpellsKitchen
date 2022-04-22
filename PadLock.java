import java.util.Scanner;

public class PadLock {

    public void padLock(Player player, Rooms pantry, Item item, InteractableObjects io)
    {
        Scanner s = new Scanner(System.in);

        if (item.objectConnection == io.itemConnection)
        {
            System.out.println("The Pantry is now unlocked!");
            pantry.locked = false;
        }
        else
        {
            System.out.println(player.name + ": That doesn't work...");
        }
        


    }
}
