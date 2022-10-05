package exceptions.demo;

class MyCustomException extends Exception
{
    public MyCustomException()
    {
    }

    public MyCustomException(String msg)
    {
        super(msg);
    }
}

