package exercises;

public class Dog extends Animal
{
    public Dog(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void sound()
    {
        System.out.println("Woof");
    }

    @Override
    public void eat()
    {
        System.out.println(getName() + " ate dog food.");
    }
}
