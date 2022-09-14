package exercises;

import java.util.Scanner;

public class Q3
{
    //TODO Add a user choice instead of commenting out
    public static void run()
    {
        convertNumber();
//        convertNumberWithNegative();
    }

    /**
     * Convert numbers. Negative numbers will be displayed as they should be
     */
    private static void convertNumberWithNegative()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value to convert: ");
        int value = scanner.nextInt();

        String sign = Integer.signum(value) == -1 ? "-" : ""; // should minus sign or not
        value = Math.abs(value); // makes the number always positive

        System.out.println("The value in binary is: " + sign + Integer.toBinaryString(value));
        System.out.println("The value in octal is: " + sign + Integer.toOctalString(value));
        System.out.println("The value in hexadecimal is: " + sign + Integer.toHexString(value));
    }

    /**
     * Convert numbers. Negative number will be displayed as they are stored in the memory
     */
    private static void convertNumber()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value to convert: ");
        int value = scanner.nextInt(); // Try a negative number here

        System.out.println("The value in binary is: " + Integer.toBinaryString(value));
        System.out.println("The value in octal is: " + Integer.toOctalString(value));
        System.out.println("The value in hexadecimal is: " + Integer.toHexString(value));
    }
}
