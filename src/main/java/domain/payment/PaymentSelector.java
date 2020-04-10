package domain.payment;

import java.util.Arrays;

/**
 * class description
 *
 * @author hotheadfactory
 */
public enum PaymentSelector {
    CARD(1, new CardPaymentMethod()),
    CASH(2, new CashPaymentMethod());

    private final int selection;
    private final PaymentMethod paymentMethod;


    PaymentSelector(int selection, PaymentMethod paymentMethod) {
        this.selection = selection;
        this.paymentMethod = paymentMethod;
    }

    public static PaymentMethod getPaymentMethod(int selection) {
        return Arrays.stream(values())
                .filter(pm -> pm.selection == selection)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("잘못된 선택입니다."))
                .paymentMethod;
    }
}
