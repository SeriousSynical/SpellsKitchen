import java.util.ArrayList;

public class Player extends Character {

    // Initialization
    protected ArrayList<Object> inventory;

    // Constructors
    public Player(String name, Pronouns pronouns, String description, boolean[] interactions) {

        super(name, pronouns, description, interactions);
        this.inventory = new ArrayList<>();

    }

}