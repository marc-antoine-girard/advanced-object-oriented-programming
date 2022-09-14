package exercises;

import java.util.Objects;
import java.util.Scanner;

/**
 * Write a Java program to enter numbers as long as the user wants to,
 * and at the end the program should display the largest and smallest numbers entered
 */
public class Q9
{
    static Scanner scanner = new Scanner(System.in);

    public static void run()
    {
        int largetNumber = Integer.MIN_VALUE;

        boolean isRunning;
        do
        {
            int i = getValidNumber(); // with data validation

            if (i > largetNumber)
                largetNumber = i;

            System.out.print("Do you want to continue (Y/N): ");

            String s = scanner.next();

            isRunning = Objects.equals(s.toLowerCase(), "y");
        } while (isRunning);

        System.out.println("The largest number was: " + largetNumber);
    }

    private static int getValidNumber()
    {
        int number = 0;
        boolean isValid = false;
        do
        {
            System.out.print("Enter a number: ");
            if (!scanner.hasNextInt())
            {
                System.out.println("That's not a number, try again: ");
                scanner.next(); // discard buffer
            }
            else
            {
                number = scanner.nextInt();
                isValid = true;
            }

        } while (!isValid);

        return number;
    }
}
