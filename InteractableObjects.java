public class InteractableObjects {
    protected String name;
    protected String description;
    protected int itemConnection;
    protected String action;

    public InteractableObjects(String name, String description, int itemConnection)
    {
        this.name=name;
        this.description=description;
        this.itemConnection=itemConnection;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getItemConnection() {
        return itemConnection;
    }

    public void setItemConnection(int itemConnection) {
        this.itemConnection = itemConnection;
    }

    public String toString()
    {

        return name;
    }

}
