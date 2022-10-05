package exceptions.demo;

public class Demo
{
    public static void main(String[] args)
    {
        arithmeticExceptionDemo();
        customExceptionDemo();
        invalidMessageDemo();
    }

    private static void invalidMessageDemo()
    {
        String msg1 = "Voldemort";
        String msg2 = "";
        try {
            isMessage(msg1);
        }
        catch (InvalidMessageException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            isMessage(msg2);
        }
        catch (InvalidMessageException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static void isMessage(String msg) throws InvalidMessageException
    {
        if(msg.equals("")){
            throw new InvalidMessageException();
        }
        else if(msg.equals("Voldemort")){
            throw new InvalidMessageException("You cannot say his name...");
        }
        else{
            System.out.println("Your message is: " + msg);
        }
    }


    private static void customExceptionDemo()
    {
        // no need to catch it. The code should simply avoid it
        runtimeExceptionMethod();

        try{
            // must catch it, or propagate
            doSomething(true);
        }
        catch (Exception e){
            System.out.println("failed");
        }
    }

    // throws a RuntimeException. No need to throw it though. The error should simply be avoided
    public static void runtimeExceptionMethod() throws NullPointerException {
        String s = null;
        s.toLowerCase(); // will produce a NullPointerException
    }


    // throws a custom Exception, derives from Exception
    public static void doSomething(boolean fail) throws MyCustomException
    {
        if (fail) {
            throw new MyCustomException("My error message should be set here");
        }
        else {
            System.out.println("There was no exception thrown");
        }
    }


    private static void arithmeticExceptionDemo()
    {
        int i = 3;
        int j = 0;
        try {
            System.out.println("result = " + (i / j));
        }
        catch (ArithmeticException e) {
            System.out.println("getmessage");
            System.out.println(e.getMessage());
            System.out.println(" ");
            System.out.println("toString");
            System.out.println(e.toString());
            System.out.println(" ");
            System.out.println("printStackTrace");
            e.printStackTrace();
        }
        finally {
            // Always executed, even if a return statement was in the try / catch block
            System.out.println("action faite systématiquement");
        }
    }
}
