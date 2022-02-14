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

}