package controller;

import domain.Menu;
import domain.MenuRepository;
import domain.TableRepository;
import domain.Tables;
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
    private final Tables tables = new Tables(TableRepository.tables());
    private final List<Menu> menus = MenuRepository.menus();

    public void run() {
        while (InputView.inputMainScreenCommand() != 3) {
            order();
        }
        checkout();
    }

    private void order() {
        final int tableNumber = askTableNumber();
        OutputView.printMenus(menus);
        final int orderedMenu = InputView.inputMenuNumber();
        final int amount = InputView.inputMenuAmount();
        tables.order(tableNumber, MenuRepository.findByNumber(orderedMenu), amount);
    }

    private void checkout() {
        final int tableNumber = askTableNumber();
        OutputView.printBill(tables.checkBillOf(tableNumber));
        InputView.inputPaymentMethod(tableNumber);
    }

    private int askTableNumber() {
        OutputView.printTables(tables.toDto());
        return InputView.inputTableNumber();
    }
}
