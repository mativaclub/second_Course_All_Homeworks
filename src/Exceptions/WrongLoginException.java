package Exceptions;

public class WrongLoginException extends RuntimeException {

    private static final String DEFAULT_MESSAGE1 = "Login must be less then 20 symbols";

    public WrongLoginException() {
        this(DEFAULT_MESSAGE1);
    }
    public WrongLoginException(String message) {
        super(message);
    }



}
