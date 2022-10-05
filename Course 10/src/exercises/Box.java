package exercises;

public class Box<T>
{
    private T value;

    public Box(T value)
    {
        this.value = value;
    }

    public void setValue(T value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return value.toString();
    }
}


class BoxTestDrive
{
    public static void main(String[] args)
    {
        Box<Integer> value = new Box<>(1);
        value.setValue(20);

        System.out.println(value);

        // bonus
        changeValue(value, 10);

        System.out.println(value);
    }

    public static <T> void changeValue(Box<T> value, T newValue)
    {
        value.setValue(newValue);
    }
}
/*
Output:
20
10
*/