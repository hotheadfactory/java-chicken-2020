package domain;

/**
 * 결제 방식을 정의한 인터페이스
 *
 * @author hotheadfactory
 */
public interface PaymentMethod {
    int getBill(int price);
}
