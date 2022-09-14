package exercises;

public class Mouse extends Animal
{
    public Mouse(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void sound()
    {
        System.out.println("Squeak");
    }

    @Override
    public void eat()
    {
        System.out.println(getName() + " ate cheese.");
    }
}
