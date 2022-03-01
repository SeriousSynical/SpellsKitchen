public class Lock {

    // Initialization
    protected boolean isLocked;
    protected Container container;


    // Constructors
    public Lock(Container container) {

        this.isLocked = true;
        this.container = container;

    }


    // Getters
    public boolean isLocked() {

        return isLocked;

    }

    public Container getContainer() {

        return container;

    }


    // Setters
    public void setLocked(boolean locked) {

        isLocked = locked;

    }

    public void setContainer(Container container) {

        this.container = container;

    }

}