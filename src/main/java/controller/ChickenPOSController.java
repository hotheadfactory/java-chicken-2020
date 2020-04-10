package controller;

import domain.Menu;
import domain.MenuRepository;
import domain.Table;
import domain.TableRepository;
import view.InputView;
import view.OutputView;

import java.util.List;

/**
 * 치킨집 포스기 컨트롤러
 *
 * @author hotheadfactory
 * 20. 4. 10.
 */

public class ChickenPOSController {
    public static void run() {
        final List<Table> tables = TableRepository.tables();
        final List<Menu> menus = MenuRepository.menus();
        OutputView.printTables(tables);
        final int tableNumber = InputView.inputTableNumber();
        final int orderedMenu = InputView.inputMenuNumber();
        OutputView.printMenus(menus);
    }
}
