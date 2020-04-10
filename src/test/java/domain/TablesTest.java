package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * class description
 *
 * @author hotheadfactory
 */
public class TablesTest {
    @Test
    @DisplayName("테이블 중에서 특정 테이블을 찾아 음식을 주문하는 것을 테스트")
    void orderFoodTest() {
        Tables tables = new Tables(new ArrayList<>(TableRepository.tables()));
        tables.order(1, MenuRepository.findByNumber(1), 2);
        assertTrue(tables.isOrdered(1));
    }
}
