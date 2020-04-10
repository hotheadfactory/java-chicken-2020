package domain;

import dto.OrderedMenusDto;
import dto.TablesDto;

import java.util.Collections;
import java.util.List;

/**
 * 현재 존재하는 테이블들을 저장하는 클래스
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

    public OrderedMenusDto checkBillOf(int tableNumber) {
        return findTableByNumber(tableNumber).checkBill();
    }

    public TablesDto toDto() {
        return new TablesDto(Collections.unmodifiableList(tables));
    }
}
