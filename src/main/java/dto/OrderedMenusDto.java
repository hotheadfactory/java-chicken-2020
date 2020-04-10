package dto;

import domain.Menu;

import java.util.Map;

/**
 * class description
 *
 * @author hotheadfactory
 */
public class OrderedMenusDto {
    private final Map<Menu, Integer> orderedMenus;

    public OrderedMenusDto(Map<Menu, Integer> orderedMenus) {
        this.orderedMenus = orderedMenus;
    }

    public Map<Menu, Integer> getOrderedMenus() {
        return orderedMenus;
    }
}
