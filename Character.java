public class Character {

    // Initialization
    protected String name;
    protected Pronouns pronouns;
    protected String description;
    protected boolean[] interactions;

    // Constructors
    public Character(String name, Pronouns pronouns, String description, boolean[] interactions) {

        this.name = name;
        this.description = description;
        this.interactions = interactions;

    }

}