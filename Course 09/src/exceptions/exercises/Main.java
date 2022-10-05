package exceptions.exercises;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int value = 0;

        boolean keepAsking = false;
        do
        {
            if (keepAsking)
                System.out.print("Enter an integer again: ");
            else
                System.out.print("enter an integer: ");

            keepAsking = false;
            try
            {
                value = getInteger();
            }
            catch (InvalidInputException e)
            {
                System.out.println(e.getMessage());
                keepAsking = true;
            }
        } while (keepAsking);

        System.out.println("The value entered is: " + value);
    }

    public static int getInteger() throws InvalidInputException
    {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt())
        {
            if (scanner.hasNextBigDecimal())
            {
                throw new InvalidInputException("Input was a decimal number, was expecting an integer");
            }
            throw new InvalidInputException("The given input was not an integer");
        }

        int value = scanner.nextInt();

        if (value < 0)
        {
            throw new InvalidInputException("Integer must be positive");
        }
        return value;
    }
}
