package exercises;

public class Cat extends Animal
{
    public Cat(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void sound()
    {
        System.out.println("Meow");
    }

    @Override
    public void eat()
    {
        System.out.println(getName() + " ate cat food");
    }

    public void eat(Mouse mouse)
    {
        // https://www.javatpoint.com/java-string-format

        String yearString = mouse.getAge() > 1 ? "years" : "year";

        String format = String.format("%1$s ate %2$s. %2$s lived %3$d wonderful %4$s.", getName(), mouse.getName(), mouse.getAge(), yearString);
        System.out.println(format);
    }
}
