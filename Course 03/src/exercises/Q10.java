package exercises;

import java.util.Scanner;

/**
 * Write a method that takes a number as an argument and displays the first N numbers of the Fibonacci sequence.
 * Add data validation
 */
public class Q10
{
    public static void run()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int firstNumber = 0, secondNumber = 1, temp;

        System.out.print(firstNumber + " " + secondNumber);
        for (int i = 2; i < number; i++)
        {
            temp = firstNumber + secondNumber;

            System.out.print(" " + temp);

            firstNumber = secondNumber;
            secondNumber = temp;
        }


    }
}
