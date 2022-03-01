public class CombinationLock extends Lock {

    // Initialization
    protected int[] key;
    protected int[] combination;


    // Constructors
    public CombinationLock(Container container, int[] key, int[] combination) {

        super(container);
        this.key = key;
        this.combination = combination;

    }


    // Getters
    public int[] getKey() {

        return key;

    }

    public int[] getCombination() {

        return combination;

    }


    // Setters
    public void setKey(int[] key) {

        this.key = key;

    }

    public void setCombination(int[] combination) {

        this.combination = combination;

    }


    // Lock & Unlock
    public void lock() {

        this.isLocked = true;

    }

    public void unlock(int[] combination) {

        this.combination = combination;
        if (this.combination == this.key) {

            this.isLocked = false;

        }

    }

}