package exception;

public class UserNotFoundException extends RuntimeException {

    /**
     * Constructor for UserNotFoundException. The input message is
     * returned in toString() message.
     */
    public UserNotFoundException(String message) {
        super(message);
    }

}
