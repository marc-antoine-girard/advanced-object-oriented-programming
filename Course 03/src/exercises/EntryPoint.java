package exercises;

import java.util.Scanner;

public class EntryPoint
{
    static Scanner scanner = new Scanner(System.in);

    /**
     * Uncomment to run the Exercices.
     */
    public static void main(String[] args)
    {
//        Q1.run();
//        Q2.run();
//        Q3.run();
//        Q4.run();
//        Q5.run();
//        Q6.run();
//        Q7.run();
//        Q8.run();
//        Q9.run();
//        Q10.run();
//        Q11.run();
//        Q12.run();

        runner();
    }


    public static void runner()
    {
        System.out.println("Which exercices do you want to run (1 - 12)");

        var number = getValidNumber(1, 12);

        switch (number)
        {
            case 1 -> Q1.run();
            case 2 -> Q2.run();
            case 3 -> Q3.run();
            case 4 -> Q4.run();
            case 5 -> Q5.run();
            case 6 -> Q6.run();
            case 7 -> Q7.run();
            case 8 -> Q8.run();
            case 9 -> Q9.run();
            case 10 -> Q10.run();
            case 11 -> Q11.run();
            case 12 -> Q12.run();
            default -> throw new IllegalStateException("Unexpected value: " + number);
        }
    }

    private static int getValidNumber(int min, int max)
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
                if (number >= min && number <= max)
                {
                    isValid = true;
                }
                else
                {
                    System.out.println("Number was outside the limits. Try again.");
                }
            }

        } while (!isValid);

        return number;
    }
}
