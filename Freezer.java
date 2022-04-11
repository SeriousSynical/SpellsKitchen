public class Freezer {
    public void Freezer(Player player, Item i1, Item i2, Item i3, Item i4)
    {
        if (i1.name.equals("Red Crystal") && i2.name.equals("Yellow Crystal") && i3.name.equals("Green Crystal") && i4.name.equals("Blue Crystal"))
        {
            System.out.println("CONGRATULATIONS!!! "+player.name+ " YOU'VE WON THE GAME!!!");
            System.exit(0);
        }
        else
        {
            System.out.println(player.name+": Dang... That's not it...");
        }
    }
}
