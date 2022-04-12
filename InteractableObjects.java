public class InteractableObjects 
{
    protected String name;
    protected String description;
    protected int itemConnection;
    protected String action;
    protected int actionConnection;
    protected boolean hide;

    public InteractableObjects(String name, String description, int itemConnection, int actionConnection)
    {
        this.name=name;
        this.description=description;
        this.itemConnection=itemConnection;
        this.actionConnection = actionConnection;

    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public int getItemConnection() 
    {
        return itemConnection;
    }

    public void setItemConnection(int itemConnection) 
    {
        this.itemConnection = itemConnection;
    }

    public boolean isHide() 
    {
        return hide;
    }

    public void setHide(boolean hide) 
    {
        this.hide = hide;
    }

    public String toString()
    {

        return name;
    }

}
