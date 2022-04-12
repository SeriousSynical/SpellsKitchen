import java.util.Scanner;

public class Character
{

    // Initialization
    protected String name;
    protected Pronouns pronouns;
    protected String description;

    Scanner s = new Scanner(System.in);


    // Constructors
    public Character(String name, Pronouns pronouns, String description)
    {
        this.name = name;
        this.pronouns = pronouns;
        this.description = description;
    }


    // Getters
    public String getName()
    {
        return name;
    }

    public Pronouns getPronouns()
    {
        return pronouns;
    }

    public String getDescription()
    {
        return description;
    }

    // Setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setPronouns(Pronouns pronouns)
    {
        this.pronouns = pronouns;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

}