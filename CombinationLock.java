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

}