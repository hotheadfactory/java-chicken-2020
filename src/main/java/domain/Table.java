package domain;

import dto.OrderedMenusDto;

public class Table {
    private final int number;
    private OrderedMenus orderedMenus = new OrderedMenus();

    public Table(final int number) {
        this.number = number;
    }

    public boolean isNumberOf(int number) {
        return this.number == number;
    }

    public void orderMenu(Menu menu, int amount) {
        this.orderedMenus = orderedMenus.addMenu(menu, amount);
    }

    public boolean isOrdered() {
        return orderedMenus.isOrdered();
    }

    public OrderedMenusDto checkBill() {
        return orderedMenus.toDto();
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
