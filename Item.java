import java.util.Arrays;
import java.util.Scanner;

public class Item {

    // Initialization
    protected String name;
    protected String description;
    protected boolean[] interactions;
    Scanner s = new Scanner(System.in);
    boolean usable;
    boolean eatable;
    boolean breakable;
    boolean breakableClue;
    public static int count;


    // Constructors
    public Item(String name, String description, boolean usable, boolean eatable, boolean breakable, boolean breakableClue) {

        this.name = name;
        this.description = description;
        this.usable = usable;
        this.eatable = eatable;
        this.breakable = breakable;


    }

    public Item(String name, String description, boolean[] interactions)
    {
        this.name = name;
        this.description = description;
        this.interactions = interactions;
        count++;
    }


    // Getters
    public String getName() {

        return name;

    }

    public String getDescription() {

        return description;

    }

    public boolean[] getInteractions() {

        return interactions;

    }


    // Setters
    public void setName(String name) {

        this.name = name;

    }

    public void setDescription(String description) {

        this.description = description;

    }

    public void setInteractions(boolean[] interactions) {

        this.interactions = interactions;

    }

    @Override // Used to check inventory
    public String toString()
    {
        return "Item:" + name;
    }

    public void displayItemsInRoom ()
    {
        
    }

}