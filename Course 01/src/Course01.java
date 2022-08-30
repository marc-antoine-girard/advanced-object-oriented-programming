import java.util.Scanner;

public class Course01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        Object number1 = scanner.nextInt();

        System.out.println("Enter second number");
        int number2 = scanner.nextInt();

        System.out.print("The result is: " + number1 + number2);
    }
}