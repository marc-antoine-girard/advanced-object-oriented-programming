package exercises;

public abstract class Animal
{
    private final String name;
    private int age;

    public Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    public abstract void sound();

    public abstract void eat();
}
