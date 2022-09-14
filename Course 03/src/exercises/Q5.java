package exercises;

import java.util.Scanner;

/**
 * Write a program that takes a String given by the user and check if it is a palindrome
 */
public class Q5
{
    public static void run()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String msg = scanner.nextLine().toLowerCase();
        String reverseMessage = new StringBuilder(msg).reverse().toString();

        boolean isPalindrome = msg.equals(reverseMessage);

        System.out.println(isPalindrome ? "It is a palindrome" : "It is not a palindrome");
    }
}
