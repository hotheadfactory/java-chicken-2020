package domain;

public class Table {
    private final int number;
    private Menus menus = new Menus();

    public Table(final int number) {
        this.number = number;
    }

    public boolean isNumberOf(int number) {
        return this.number == number;
    }

    public void orderMenu(Menu menu, int amount) {
        this.menus = menus.addMenu(menu, amount);
    }

    public boolean isOrdered() {
        return menus.isOrdered();
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
