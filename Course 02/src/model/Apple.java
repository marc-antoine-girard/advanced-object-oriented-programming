package model;


// Apple is a Class
// Its access modifier is public. It can be accessed anywhere
public class Apple
{
    public static int amountOfApples;

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

    // Since a constructor is specified, the def
    public Apple(String species)
    {
        // The "this" here is to avoid confusion. It is usually optional
        // The left one belongs to the object, the right one is a local variable
        this.species = species;
        amountOfApples++;
    }

    public Apple()
    {
        // even thought it is empty, we need to set it, otherwise, species will be null
        this.species = "Regular";
        amountOfApples++;
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

        if (ageInDays > 10)
            color = Color.BROWN;
        else if (ageInDays > 5)
            color = Color.RED;
    }

    // Method overload
    public void grow()
    {
        grow(1);
    }

    @Override
    public String toString()
    {
        // https://www.javatpoint.com/java-string-format
        return String.format("%s Apple is %d days old. It is now %s", this.species, this.ageInDays, this.color.toString().toLowerCase());
    }
}
