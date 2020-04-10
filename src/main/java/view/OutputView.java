package view;

import domain.Menu;
import domain.Table;
import dto.OrderedMenusDto;
import dto.TablesDto;

import java.util.List;
import java.util.Map;

public class OutputView {
    private static final String TOP_LINE = "┌ ─ ┐";
    private static final String TABLE_FORMAT = "| %s |";
    private static final String BOTTOM_LINE_FORMAT = "└ %s ┘";

    public static void printTables(TablesDto tablesDto) {
        System.out.println("## 테이블 목록");
        List<Table> tables = tablesDto.getTables();
        final int size = tables.size();
        printLine(TOP_LINE, size);
        printTableNumbers(tables);
        printBottomLine(tables);
    }

    public static void printMenus(final List<Menu> menus) {
        for (final Menu menu : menus) {
            System.out.println(menu);
        }
    }

    private static void printLine(final String line, final int count) {
        for (int index = 0; index < count; index++) {
            System.out.print(line);
        }
        System.out.println();
    }

    private static void printTableNumbers(final List<Table> tables) {
        for (final Table table : tables) {
            System.out.printf(TABLE_FORMAT, table);
        }
        System.out.println();
    }

    private static void printBottomLine(final List<Table> tables) {
        for (final Table table : tables) {
            System.out.printf(BOTTOM_LINE_FORMAT, orderLightParser(table));
        }
        System.out.println();
    }

    private static String orderLightParser(Table table) {
        if (table.isOrdered()) {
            return "￦";
        }
        return "-";
    }

    public static void printBill(OrderedMenusDto orderedMenusDto) {
        Map<Menu, Integer> orderedMenus = orderedMenusDto.getOrderedMenus();
        System.out.println("## 주문 내역\n메뉴 수량 금액");
        for (Menu menu : orderedMenus.keySet()) {
            int amount = orderedMenus.get(menu);
            int totalPricePerMenu = menu.getPrice() * amount;
            System.out.println(menu.getName() + " " + amount + " " + totalPricePerMenu);
        }
        System.out.println();
    }
}
