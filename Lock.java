public class Lock {

    // Initialization
    protected boolean isLocked;
    protected Container container;

    // Constructor
    public Lock(Container container) {

        this.isLocked = true;
        this.container = container;

    }

}