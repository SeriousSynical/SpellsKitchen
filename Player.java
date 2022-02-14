import java.util.ArrayList;

public class Player extends Character {

    // Initialization
    protected ArrayList<Object> inventory;

    // Constructors
    public Player(String name, String description, boolean[] interactions) {

        super(name, description, interactions);
        this.inventory = new ArrayList<>();

    }

}