package dto;

import domain.Table;

import java.util.List;

/**
 * 테이블들을 전달하는 DTO
 *
 * @author hotheadfactory
 */
public class TablesDto {
    private final List<Table> tables;

    public TablesDto(List<Table> tables) {
        this.tables = tables;
    }

    public List<Table> getTables() {
        return tables;
    }
}
