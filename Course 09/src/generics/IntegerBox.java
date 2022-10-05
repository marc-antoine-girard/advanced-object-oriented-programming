package generics;

public class IntegerBox
{
    private int value;

    public IntegerBox(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "" + value;
    }
}
