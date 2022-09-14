package exercises;

public class EntryPoint
{
    public static void main(String[] args)
    {
        Cat fuzzy = new Cat("Fuzzy", 10);
        Animal dog = new Dog("Bernard", 2); // polymorphism
        Mouse mouse = new Mouse("Oliver", 1);

        System.out.println(fuzzy.getName());
        System.out.println(fuzzy.getAge());
        System.out.println(mouse.getAge());

        dog.setAge(3);
        System.out.println(dog.getAge());

        fuzzy.sound();
        dog.sound();
        mouse.sound();

        dog.eat();
        mouse.eat();
        fuzzy.eat();
        fuzzy.eat(mouse);
    }
}
