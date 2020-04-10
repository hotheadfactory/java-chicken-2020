package domain.payment;

/**
 * class description
 *
 * @author hotheadfactory
 */
public class CardPaymentMethod implements PaymentMethod {
    @Override
    public int getBill(int price) {
        return price;
    }
}
