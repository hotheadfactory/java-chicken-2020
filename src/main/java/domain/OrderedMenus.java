package domain;

import dto.OrderedMenusDto;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 주문한 메뉴들을 저장하는 클래스
 *
 * @author hotheadfactory
 */
public class OrderedMenus {
    private final Map<Menu, Integer> menus;

    public OrderedMenus(Map<Menu, Integer> menus) {
        this.menus = Collections.unmodifiableMap(menus);
    }

    public OrderedMenus() {
        this(new HashMap<>());
    }

    public OrderedMenus addMenu(Menu menu, int amount) {
        Map<Menu, Integer> menusCache = new HashMap<>(menus);
        if (menusCache.putIfAbsent(menu, amount) != null) {
            menusCache.put(menu, menusCache.get(menu) + amount);
        }
        return new OrderedMenus(menusCache);
    }

    public boolean isOrdered() {
        return menus.size() > 0;
    }

    public OrderedMenusDto toDto() {
        return new OrderedMenusDto(Collections.unmodifiableMap(menus));
    }
}
