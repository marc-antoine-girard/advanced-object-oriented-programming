package exceptions.demo;

class InvalidMessageException extends Exception{
    public InvalidMessageException() {
        super("String is empty");
    }
    public InvalidMessageException(String message) {
        super(message);
    }
}

