package domain.payment;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 지불 방법 선택자 테스트
 *
 * @author hotheadfactory
 */
public class PaymentSelectorTest {
    @Test
    void paymentSelectTest() {
        assertThat(PaymentSelector.getPaymentMethod(1))
                .isInstanceOf(CardPaymentMethod.class);
        assertThat(PaymentSelector.getPaymentMethod(2))
                .isInstanceOf(CashPaymentMethod.class);
    }
}
