package exercises;

import java.util.Scanner;

/**
 * Write a program that takes a String given by the user and reverses it. Print the result
 */
public class Q4
{
    public static void run()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a message to reverse: ");
        String msg = scanner.nextLine();

        StringBuilder buff = new StringBuilder(msg);

        System.out.println("The reverse is: \n" + buff.reverse());
    }
}
