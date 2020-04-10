package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * class description
 *
 * @author hotheadfactory
 */
public class MenuTest {
    @Test // TODO: 20. 4. 10. MethodSource로 바꾸기 (시간 남으면)
    @DisplayName("이 메뉴가 치킨인지 구별하는 기능 테스트")
    void isChickenTest() {
        Menu friedChicken = new Menu(1, "후라이드", Category.CHICKEN, 16_000);
        Menu cola = new Menu(21, "콜라", Category.BEVERAGE, 1_000);
        assertTrue(friedChicken.isChicken());
        assertFalse(cola.isChicken());
    }

    @Test
    @DisplayName("메뉴의 번호가 맞는지 확인하는 기능 테스트")
    void isNumberOfTest() {
        Menu friedChicken = new Menu(1, "후라이드", Category.CHICKEN, 16_000);
        assertTrue(friedChicken.isNumberOf(1));
    }
}
