package domain;

import dto.OrderedMenusDto;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

    public int checkOut() {
        int sum = 0;
        Set<Menu> menuVariety = menus.keySet();
        for (Menu menu : menuVariety) {
            sum += menu.getPrice() * menus.get(menu);
        }
        sum -= discountPrice(menuVariety);
        return sum;
    }

    private long discountPrice(Set<Menu> menuVariety) {
        long chickenCount = menuVariety.stream()
                .filter(Menu::isChicken)
                .count();
        return chickenCount / 10 * 10000;
    }

    public OrderedMenusDto toDto() {
        return new OrderedMenusDto(Collections.unmodifiableMap(menus));
    }
}
