package demo;

public class ArrayDemo
{
    public static void demo()
    {
        int[] array = new int[10];

        // initializing the elements in the array
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; // assign at index i
            System.out.println(array[i]); // get the element at index i
        }

        for (int i : array)
        {
            System.out.println(i);
        }
    }
}
