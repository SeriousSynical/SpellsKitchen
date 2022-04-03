public class NPC extends Character {

    boolean hasClue;

    // Constructors
    public NPC(String name, Pronouns pronouns, String description, Boolean hasClue) {

        super(name, pronouns, description);
        this.hasClue = hasClue;

    }

}