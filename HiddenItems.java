public class HiddenItems extends Item {

    public HiddenItems(String name, String description, boolean usable, boolean eatable, boolean breakable,
                       boolean breakableClue,int objectConnection, int actionConnection, String eatableDescription)
    {
        super(name, description, usable, eatable, breakable, breakableClue,objectConnection, eatableDescription);
        this.actionConnection = actionConnection;
    }

}
