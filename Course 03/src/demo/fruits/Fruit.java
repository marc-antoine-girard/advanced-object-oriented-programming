package demo.fruits;

public abstract class Fruit
{
    public static int amountOfFruits;

    protected final String species;
    protected int ageInDays;
    protected Color color = Color.GREEN;

    public Fruit(String species)
    {
        this.species = species;
        amountOfFruits++;
    }

    public Fruit()
    {
        this.species = "Regular";
        amountOfFruits++;
    }

    public abstract void grow(int days);

    public void grow()
    {
        grow(1);
    }

    public final String getSpecies()
    {
        return species;
    }


    @Override
    public String toString()
    {
        return String.format("%s is %d days old. It is now %s", this.species, this.ageInDays, this.color.toString().toLowerCase());
    }
}
