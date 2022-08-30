package model;


// Banana is a Class
// Its access modifier is public. It can be accessed anywhere
public class Banana
{
    public static int amountOfBananas;

    // species is an attribute
    // Its access modifier is private. It can only be access inside the scope of this class
    // Since we only set it once and never change it, we can make it final
    private final String species;

    // age is an attribute
    // Since it is not set in the constructor, its default value is 0
    private int ageInDays;

    // color is an attribute
    // Its type is Color. Color is an enum defined in the model package
    private Color color = Color.GREEN;

    public Banana(String species)
    {
        // The "this" here is to avoid confusion. It is usually optional
        // The left one belongs to the object, the right one is a local variable
        this.species = species;
        amountOfBananas++;
    }

    public Banana()
    {
        // even thought it is empty, we need to set it, otherwise, species will be null
        this.species = "Regular";
        amountOfBananas++;
    }

    // This is a getter. It has no parameter and returns a String
    // Methods should always be verbs
    public final String getSpecies()
    {
        return species;
    }

    // Method names should always be verbs
    public void grow(int days)
    {
        // shortcut operator. Means:
        // ageInDays = ageInDays + days;
        ageInDays += days;

        if (ageInDays > 6)
            color = Color.BROWN;
        else if (ageInDays > 5)
            color = Color.YELLOW;
    }

    @Override
    public String toString()
    {
        // https://www.javatpoint.com/java-string-format
        return String.format("%s banana is %d days old. It is now %s", this.species, this.ageInDays, this.color.toString().toLowerCase());
    }
}
