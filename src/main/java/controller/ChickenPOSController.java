package controller;

import domain.Menu;
import domain.MenuRepository;
import domain.TableRepository;
import domain.Tables;
import domain.payment.PaymentMethod;
import domain.payment.PaymentSelector;
import dto.OrderedMenusDto;
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
        int selection = InputView.inputMainScreenCommand();
        if (selection == 3) {
            return;
        }
        if (selection == 1) {
            order();
        }
        if (selection == 2) {
            checkout();
        }
        run();
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
        listOrderedMenus(tableNumber);
        calculatePrice(tableNumber);
        tables.clean(tableNumber);
    }

    private void listOrderedMenus(int tableNumber) {
        OrderedMenusDto orderedMenus = tables.checkBillOf(tableNumber);
        OutputView.printBill(orderedMenus);
    }

    private void calculatePrice(int tableNumber) {
        int paymentChoice = InputView.inputPaymentMethod(tableNumber);
        PaymentMethod paymentMethod = PaymentSelector.getPaymentMethod(paymentChoice);
        int price = paymentMethod.getBill(
                tables.checkOut(tableNumber)
        );
        OutputView.printPrice(price);
    }

    private int askTableNumber() {
        OutputView.printTables(tables.toDto());
        return InputView.inputTableNumber();
    }
}
