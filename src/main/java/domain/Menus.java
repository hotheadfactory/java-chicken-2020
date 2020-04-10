package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * class description
 *
 * @author hotheadfactory
 */
public class Menus {
    private final List<Menu> menus;

    public Menus(List<Menu> menus) {
        this.menus = Collections.unmodifiableList(menus);
    }

    public Menus() {
        this(new ArrayList<>());
    }

    public Menus addMenu(Menu menu) {
        List<Menu> menusCache = new ArrayList<>(menus);
        menusCache.add(menu);
        return new Menus(menusCache);
    }

    public boolean isOrdered() {
        return menus.size() > 0;
    }
}
