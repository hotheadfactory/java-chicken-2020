import controller.ChickenPOSController;
import domain.Menu;
import domain.MenuRepository;
import domain.Table;
import domain.TableRepository;
import view.InputView;
import view.OutputView;

import java.util.List;

public class ChickenPOSApplication {
    // TODO 구현 진행
    public static void main(String[] args) {
        ChickenPOSController controller = new ChickenPOSController();
        controller.run();
    }
}
