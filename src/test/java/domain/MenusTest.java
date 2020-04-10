package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * class description
 *
 * @author hotheadfactory
 */
public class MenusTest {
    @Test
    void menuOrderTest() {
        Menus menus = new Menus();
        assertFalse(menus.isOrdered());
        menus = menus.addMenu(MenuRepository.menus().get(1), 1);
        assertTrue(menus.isOrdered());
    }
}
