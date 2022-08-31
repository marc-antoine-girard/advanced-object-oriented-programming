package fruits;

public class Apple extends Fruit
{
    public static int amountOfApples;

    public Apple(String species)
    {
        super(species);
        amountOfApples++;
    }

    public Apple()
    {
        super();
        amountOfApples++;
    }

    @Override
    public void grow(int days)
    {
        ageInDays += days;

        if (ageInDays > 10)
            color = Color.BROWN;
        else if (ageInDays > 5)
            color = Color.RED;
    }

    @Override
    public String toString()
    {
        return String.format("%s apple is %d days old. It is now %s", this.species, this.ageInDays, this.color.toString().toLowerCase());
    }
}
