package fruits;

public class Banana extends Fruit
{
    public static int amountOfBananas;

    public Banana(String species)
    {
        super(species);
        amountOfBananas++;
    }

    public Banana()
    {
        super();
        amountOfBananas++;
    }

    @Override
    public void grow(int days)
    {
        ageInDays += days;

        if (ageInDays > 6)
            color = Color.BROWN;
        else if (ageInDays > 5)
            color = Color.YELLOW;
    }


    @Override
    public String toString()
    {
        return String.format("%s banana is %d days old. It is now %s", this.species, this.ageInDays, this.color.toString().toLowerCase());
    }
}
