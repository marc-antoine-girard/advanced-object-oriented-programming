package exercises;

import java.util.Scanner;

/**
 * Write a method to check whether a number (positive integer) entered by the user is a prime number.
 */
public class Q8
{
    public static void run()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int value = scanner.nextInt();

        boolean isPrime = isPrime(value);

        if(isPrime)
            System.out.println("The number " + value + " is a prime number");
        else
            System.out.println("The number " + value + " is not a prime number");
    }

    private static boolean isPrime(int value)
    {
        int half = value / 2;

        boolean isPrime = value > 1;
        for (int i = 2; i <= half; i++)
        {
            if(value % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
