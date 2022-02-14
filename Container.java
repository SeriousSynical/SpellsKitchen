import java.util.ArrayList;

public class Container extends Item {

    // Initialization
    protected Lock lock;
    protected boolean isLocked;
    protected ArrayList<Object> contents;

    // Constructors
    public Container(String name, String description, boolean[] interactions) {

        super(name, description, interactions);
        this.contents = new ArrayList<>();
        this.isLocked = false;
        this.lock = null;

    }

    public Container(String name, String description, boolean[] interactions, boolean isLocked, Lock lock) {

        super(name, description, interactions);
        this.contents = new ArrayList<>();
        this.isLocked = isLocked;
        this.lock = lock;

    }

}