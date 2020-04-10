package domain;

import java.util.*;

/**
 * class description
 *
 * @author hotheadfactory
 */
public class Menus {
    private final Map<Menu, Integer> menus;

    public Menus(Map<Menu, Integer> menus) {
        this.menus = Collections.unmodifiableMap(menus);
    }

    public Menus() {
        this(new HashMap<>());
    }

    public Menus addMenu(Menu menu, int amount) {
        Map<Menu, Integer> menusCache = new HashMap<>(menus);
        if(menusCache.putIfAbsent(menu, amount) != null) {
            menusCache.put(menu, menusCache.get(menu) + amount);
        }
        return new Menus(menusCache);
    }

    public boolean isOrdered() {
        return menus.size() > 0;
    }
}
