import java.util.Objects;

public class DynamicArray<E>
{
    private static final int DEFAULT_CAPACITY = 2;
    private Object[] elements;
    private int count;

    public DynamicArray()
    {
        elements = new Object[DEFAULT_CAPACITY];
        count = 0;
    }

    public DynamicArray(int capacity)
    {
        elements = new Object[capacity];
        count = 0;
    }

    public int capacity()
    {
        return elements.length;
    }

    public int size()
    {
        return count;
    }

    public void add(E value)
    {
        if (count == elements.length)
        {

            Object[] temp = new Object[count * 2];
            System.arraycopy(elements, 0, temp, 0, count);
            elements = temp;
        }
        elements[count] = value;
        count++;
    }

    public void trimToSize()
    {
        if(count == elements.length)
            return;

        Object[] temp = new Object[count];
        System.arraycopy(elements, 0, temp, 0, count);
        elements = temp;
    }

    public E get(int index)
    {
        Objects.checkIndex(index, count);
        return elementData(index);
    }

    @SuppressWarnings("unchecked")
    private E elementData(int index)
    {
        return (E) elements[index];
    }

    public boolean remove(E value)
    {
        if (Objects.equals(value, null))
            return false;

        for (int i = 0; i < count; i++)
        {
            if (Objects.equals(elements[i], value))
            {
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    public E removeAt(int index)
    {
        Objects.checkIndex(index, count);
        E result = elementData(index);

        for (int i = index; i < count - 1; i++)
        {
            elements[i] = elements[i + 1];
        }
        elements[count - 1] = null;
        count--;
        return result;
    }

    public void clear()
    {
        for (int i = 0; i < count; i++)
        {
            elements[i] = null;
        }
        count = 0;
    }

    public void print()
    {
        printInternal(count);
    }

    public void print(boolean usingCapacity)
    {
        printInternal(usingCapacity ? elements.length : count);
    }

    private void printInternal(int upperLimit)
    {
        for (int i = 0; i < upperLimit; i++)
        {
            System.out.println("Array[" + i + "] = " + elements[i]);
        }
    }
}
