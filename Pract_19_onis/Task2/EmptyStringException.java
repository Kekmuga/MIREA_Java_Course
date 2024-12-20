package Pract_19_onis.Task2;

public class EmptyStringException extends RuntimeException {
    public EmptyStringException(String message) {
        super(":) string is empty" + message);
    }
}
