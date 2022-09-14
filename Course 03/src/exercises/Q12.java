package exercises;

import java.util.Scanner;

/**
 * Write a method that takes a number as an argument and displays the first N numbers of the famous FizzBuzz game
 */
public class Q12
{
    /**
     * "FizzBuzz" if number is divisible by 3 and 5.
     * "Fizz" if number is divisible by 3.
     * "Buzz" if number is divisible by 5.
     */
    public static void run()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        fizzbuzz(scanner.nextInt());
    }

    private static void fizzbuzz(int number)
    {
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= number; i++)
        {
            builder.append(getString(i));
        }

        System.out.println(builder);
    }

    private static String getString(int value)
    {
        if (value % 5 == 0 && value % 3 == 0)
            return "FizzBuzz\n";
        else if (value % 3 == 0)
            return "Fizz\n";
        else if (value % 5 == 0)
            return "Buzz\n";

        return value + "\n";
    }
}
