package main;

import model.Banana;

import java.util.Scanner;

public class Course02
{
    // Entry point
    public static void main(String[] args)
    {
        bananaExample();
        operatorPrecedence();
        stringPool();
    }

    private static String pooledString = "test";

    private static void stringPool()
    {
        System.out.println("\nCourse02.stringPool");
        String localPooledString = "test";

        // true. Every String known at compile time are compared and stored in the string pool
        // The attribute and local variable will both reference the same instance
        // IDE should give a warning: String values are compared using '==', not 'equals()'
        System.out.println(localPooledString == pooledString);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        // Entered "test". This string is stored in the memory (heap)
        String localString = scanner.nextLine();

        // False. The == compares the instances (pointers), not the values
        // In C#, this would be the same as doing Object.ReferenceEquals(localString, pooledString);
        System.out.println(localString == pooledString);

        // True. String overrides the equals method and compares the String values
        System.out.println(localString.equals(pooledString));

        // True. The intern method takes the string, adds it in the String pool if it's not there, and
        // returns the string from the string pool
        // We don't usually do that. This is just to explain how the memory is managed. Use string.equals
        System.out.println(localString.intern().equals(pooledString));
    }


    //region Operator
    private static void operatorPrecedence()
    {
        System.out.println("\nCourse02.operatorPrecedence");
        int number1 = 5, number2 = 10;

        System.out.println("Add numbers: " + number1 + number2);
        System.out.println("Add numbers: " + (number1 + number2));
        System.out.println("Multiply numbers: " + number1 * number2);

//        Add numbers: 510
//        Add numbers: 15
//        Multiply numbers: 50
    }

    //endregion

    //region Banana
    private static void bananaExample()
    {
        System.out.println("\nCourse02.bananaExample");
        Banana plantain = new Banana("Plantain");
        printBanana(plantain);

        // Uses the other constructor
        // var is replaced at compile time to the right type
        // var does not mean dynamic. The type most be known.
        // var should only be used when the type is pretty obvious
        // Do not use var with primitive types
        var regular = new Banana();
        printBanana(regular);
    }

    private static void printBanana(Banana banana)
    {
        System.out.println(banana.getSpecies());

        banana.grow(5);
        System.out.println(banana.toString()); // Unnecessary 'toString()' call

        banana.grow();
        System.out.println(banana); // implicit call to .toString()

        banana.grow();
        System.out.println(banana);

        System.out.println("Amount of Banana: " + Banana.amountOfBananas);
    }
    //endregion
}
