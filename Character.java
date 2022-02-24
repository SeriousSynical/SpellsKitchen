import java.util.Scanner;

public class Character {

    // Initialization
    protected String name;
    protected Pronouns pronouns;
    protected String description;
    protected boolean[] interactions;

    Scanner s = new Scanner(System.in);


    // Constructors
    public Character(String name, Pronouns pronouns, String description, boolean[] interactions) {

        this.name = name;
        this.description = description;
        this.interactions = interactions;

    }


    // Getters
    public String getName() {

        return name;

    }

    public Pronouns getPronouns() {

        return pronouns;

    }

    public String getDescription() {

        return description;

    }

    public boolean[] getInteractions() {

        return interactions;

    }


    // Setters
    public void setName(String name) {

        this.name = name;

    }

    public void setPronouns(Pronouns pronouns) {

        this.pronouns = pronouns;

    }

    public void setDescription(String description) {

        this.description = description;

    }

    public void setInteractions(boolean[] interactions) {

        this.interactions = interactions;

    }




}