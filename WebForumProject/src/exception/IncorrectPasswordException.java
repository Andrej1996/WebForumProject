package exception;

public class IncorrectPasswordException extends RuntimeException {

    /**
     * Constructor for NotFoundException. The input message is
     * returned in toString() message.
     */
    public IncorrectPasswordException(String message) {
        super(message);
    }
}
