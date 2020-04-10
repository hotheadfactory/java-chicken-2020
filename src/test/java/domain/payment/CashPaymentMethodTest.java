package domain.payment;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * class description
 *
 * @author hotheadfactory
 */
public class CashPaymentMethodTest {
    @ParameterizedTest
    @DisplayName("현금 결제시 정률 할인을 잘 수행하는지 확인")
    @CsvSource(value = {"100,95", "10000, 9500"})
    void discountTest(int bill, int expected) {
        PaymentMethod cash = new CashPaymentMethod();
        assertThat(cash.getBill(bill)).isEqualTo(expected);
    }
}
