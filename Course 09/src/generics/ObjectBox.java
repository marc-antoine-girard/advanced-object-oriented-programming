package generics;

public class ObjectBox
{
    private Object value;

    public ObjectBox(Object value)
    {
        this.value = value;
    }

    public Object getValue()
    {
        return value;
    }

    public void setValue(Object value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return value.toString();
    }
}
