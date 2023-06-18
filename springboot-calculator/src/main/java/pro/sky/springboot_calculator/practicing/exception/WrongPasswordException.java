package pro.sky.springboot_calculator.practicing.exception;

public class WrongPasswordException extends RuntimeException {

    private static final String DEFAULT_MESSAGE = "Passwords must be equal";

    public WrongPasswordException() {
        this(DEFAULT_MESSAGE);
    }
    public WrongPasswordException(String message) {
        super(message);
    }




}
