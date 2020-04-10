package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * class description
 *
 * @author hotheadfactory
 */
public class Tables {
    private final List<Table> tables;

    public Tables(List<Table> tables) {
        this.tables = tables;
    }

    private Table findTableByNumber(int tableNumber) {
        return tables.stream()
                .filter(table -> table.isNumberOf(tableNumber))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("없는 테이블 입니다."));
    }

    public void order(int tableNumber, Menu menu, int amount) {
        Table table = findTableByNumber(tableNumber);
        table.orderMenu(menu, amount);
    }

    public boolean isOrdered(int tableNumber) {
        return findTableByNumber(tableNumber).isOrdered();
    }
}
