public class PatternLock extends Lock {

    // Initialization
    protected Object[] key;
    protected Object[] combination;


    // Constructors
    public PatternLock(Container container, Object[] key, Object[] combination) {

        super(container);
        this.key = key;
        this.combination = combination;

    }


    // Getters
    public Object[] getKey() {

        return key;

    }

    public Object[] getCombination() {

        return combination;

    }


    // Setters
    public void setKey(Object[] key) {

        this.key = key;

    }

    public void setCombination(Object[] combination) {

        this.combination = combination;

    }

}