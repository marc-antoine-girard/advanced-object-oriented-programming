package exercises;


import java.util.Scanner;

/**
 * Write a method to check whether a year (integer) entered by the user is a leap year or not.
 */
public class Q11
{
    public static void run()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean leapYear = isLeapYear(year);

        if(leapYear)
            System.out.println("The year " + year + " is a leap year");
        else
            System.out.println("The year " + year + " is not a leap year");
    }

    public static boolean isLeapYear(int year)
    {
        // if the year is divided by 4
        if (year % 4 != 0)
            return false;
        else if(year % 400 == 0)
            return true;
        else if (year % 100 == 0)
            return false;

        return true;
    }
}
