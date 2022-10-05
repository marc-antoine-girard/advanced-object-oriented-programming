package generics;

public class Demo
{
    public static void main(String[] args)
    {
        IntegerBox box = new IntegerBox(10);
        System.out.println(box.getValue());

        StringBox stringBox = new StringBox("This is a message");
        System.out.println(stringBox.getValue());

         ObjectBox message = new ObjectBox(1.5f);
        // String value = (String) message.getValue(); // downcast, dangerous
        // System.out.println(value.toLowerCase()); // RuntimeException

        // Changing the generic type argument to Integer would raise a Compile time exception (easy to debug)
        GenericBox<String> stringGenericBox = new GenericBox<>("GENERIC STRING");

        // now it knows getValue can only return a string. No need to cast it
        System.out.println(stringGenericBox.getValue().toLowerCase());

        KeyValuePair<Integer, String> keyValuePair = new KeyValuePair<>(1, "asd");

        System.out.println(keyValuePair.getValue());
        System.out.println(keyValuePair.getKey());
    }
}


