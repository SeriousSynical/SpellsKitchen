public class KeyLock extends Lock {

    // Initialization
    protected Key key;


    // Constructors
    public KeyLock(Container container, Key key) {

        super(container);
        this.key = key;

    }


    // Getters
    public Key getKey() {

        return key;

    }


    // Setters
    public void setKey(Key key) {

        this.key = key;

    }


    // Empty Methods
    public void lock(Key key) {



    }

    public void unlock(Key key) {



    }

}