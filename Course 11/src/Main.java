public class Main
{
    public static void main(String[] args)
    {
        DynamicArray<String> myList = new DynamicArray<>();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("E");
        myList.print(true);

        System.out.println("Capacity: " + myList.capacity());
        System.out.println("Count: " + myList.size());
        myList.removeAt(1);
        myList.removeAt(1);
        myList.removeAt(1);
        myList.removeAt(1);

        myList.print();
        System.out.println("Capacity: " + myList.capacity());
        System.out.println("Count: " + myList.size());
    }
}
