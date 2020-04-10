package domain.payment;

/**
 * class description
 *
 * @author hotheadfactory
 */
public class CashPaymentMethod implements PaymentMethod {
    private static final double DISCOUNT = 0.95;

    @Override
    public int getBill(int price) {
        return (int) (price * DISCOUNT);
    }
}
