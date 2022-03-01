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


    // Getters
    public Lock getLock() {

        return lock;

    }

    public boolean isLocked() {

        return isLocked;

    }

    public ArrayList<Object> getContents() {

        return contents;

    }


    // Setters
    public void setLock(Lock lock) {

        this.lock = lock;

    }

    public void setLocked(boolean locked) {

        isLocked = locked;

    }

    public void setContents(ArrayList<Object> contents) {

        this.contents = contents;

    }


    // Empty Methods
    public void checkLock() {



    }

    public String inspect() {

        return null;

    }

    public void addItem(Player player) {



    }

    public void removeItem(Player player) {



    }
    
}
