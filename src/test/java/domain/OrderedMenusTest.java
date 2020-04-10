package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * class description
 *
 * @author hotheadfactory
 */
public class OrderedMenusTest {
    @Test
    void menuOrderTest() {
        OrderedMenus orderedMenus = new OrderedMenus();
        assertFalse(orderedMenus.isOrdered());
        orderedMenus = orderedMenus.addMenu(MenuRepository.menus().get(1), 1);
        assertTrue(orderedMenus.isOrdered());
    }
}
