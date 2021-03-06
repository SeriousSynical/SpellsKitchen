import java.util.Scanner;

public class Item 
{

    // Initialization
    protected String name;
    protected String description;
    protected boolean[] interactions;
    Scanner s = new Scanner(System.in);
    boolean usable;
    boolean eatable;
    boolean breakable;
    boolean breakableClue;
    int actionConnection;
    String eatableDescription;

    
    public static int count;
    int objectConnection;
    int breakableItemConnection;


    // Constructors
    public Item(String name, String description, boolean usable, boolean eatable, boolean breakable,
                boolean breakableClue,int objectConnection,String eatableDescription) 
    {

        this.name = name;
        this.description = description;
        this.usable = usable;
        this.eatable = eatable;
        this.breakable = breakable;
        this.breakableClue = breakableClue;
        this.objectConnection = objectConnection;
        this.eatableDescription = eatableDescription;


    }

    public String getEatableDescription() 
    {
        return eatableDescription;
    }

    public void setEatableDescription(String eatableDescription) 
    {
        this.eatableDescription = eatableDescription;
    }

    public Item(String name, String description, boolean[] interactions)
    {
    }


    // Getters
    public String getName() 
    {

        return name;

    }

    public String getDescription() 
    {

        return description;

    }

    public boolean[] getInteractions() 
    {

        return interactions;

    }


    // Setters
    public void setName(String name) 
    {

        this.name = name;

    }

    public void setDescription(String description) 
    {

        this.description = description;

    }

    public void setInteractions(boolean[] interactions) 
    {

        this.interactions = interactions;

    }

    @Override // Used to check inventory
    public String toString()
    {

        return name;
    }

    public void displayItemsInRoom ()
    {
        
    }

}