package exercises;


import java.util.Scanner;

/**
 * Write a program to compare two numbers and prints the biggest one
 */
public class Q1
{
    public static void run()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();

        System.out.println("The biggest value is: " + Math.max(first, second));
    }
}
