package exercises;

import java.util.Scanner;

/**
 * Write a method that takes a word (String) entered by the user and shuffles the letters randomly.
 * Make sure to hide the uppercases
 */
public class Q7
{
    public static void run()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your word: ");
        String s = scanner.nextLine();

        char[] chars = s.toCharArray();

        shuffle(chars);

        String result = new String(chars).toLowerCase();

        System.out.println("Scrambled: " + result);
    }

    private static void shuffle(char[] chars)
    {
        for (int i = 0; i < chars.length; i++)
        {
            int randomIndex = (int) (Math.random() * chars.length);

            char temp = chars[i];
            chars[i] = chars[randomIndex];
            chars[randomIndex] = temp;
        }
    }
}
