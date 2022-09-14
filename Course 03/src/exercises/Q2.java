package exercises;

import java.util.Scanner;

/**
 * Write a program that takes a radius (radius: float) and finds the area of a circle
 */
public class Q2
{
    public static void run()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of a circle: ");
        float radius = scanner.nextFloat();

        double area = Math.PI * radius * radius;
        System.out.println("The area is: " + area);
    }
}
