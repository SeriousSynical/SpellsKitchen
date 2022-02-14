public class KeyLock extends Lock {

    // Initialization
    protected Key key;

    // Constructors
    public KeyLock(Container container, Key key) {

        super(container);
        this.key = key;

    }

}