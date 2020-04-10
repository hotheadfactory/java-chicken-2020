package exception;

/**
 * class description
 *
 * @author hotheadfactory
 */
public class OrderLimitException extends RuntimeException {
    public OrderLimitException(String s) {
        super(s);
    }
}
