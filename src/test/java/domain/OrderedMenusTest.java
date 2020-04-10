package domain;

import exception.OrderLimitException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderedMenusTest {
    @Test
    @DisplayName("주문 테스트")
    void menuOrderTest() {
        OrderedMenus orderedMenus = new OrderedMenus();
        assertFalse(orderedMenus.isOrdered());
        orderedMenus = orderedMenus.addMenu(MenuRepository.menus().get(1), 1);
        assertTrue(orderedMenus.isOrdered());
    }

    @Test
    void orderLimitTest() {
        OrderedMenus orderedMenus = new OrderedMenus();
        orderedMenus = orderedMenus.addMenu(MenuRepository.menus().get(1), 99);
        OrderedMenus finalOrderedMenus = orderedMenus;
        assertThatThrownBy(() -> finalOrderedMenus.addMenu(MenuRepository.menus().get(1), 1))
                .isInstanceOf(OrderLimitException.class)
                .hasMessageContaining("더 이상");

    }

    @Test
    void checkOutTest() {
        OrderedMenus orderedMenus = new OrderedMenus();
        orderedMenus = orderedMenus.addMenu(MenuRepository.menus().get(1), 15);
        assertThat(orderedMenus.checkOut()).isEqualTo(240000);
    }
}
