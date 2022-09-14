package exercises;

import java.util.Scanner;

/**
 * Write a program that takes a String given by the user and replace every "e" with "a".
 * Print the result.
 */
public class Q6
{
    public static void run()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some text: ");
        String s = scanner.nextLine();

        String replaced = s.replace('e', 'a');
        System.out.println(replaced);
    }
}
