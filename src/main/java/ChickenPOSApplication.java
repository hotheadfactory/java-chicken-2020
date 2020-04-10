import controller.ChickenPOSController;

public class ChickenPOSApplication {
    // TODO 구현 진행
    public static void main(String[] args) {
        try {
            ChickenPOSController controller = new ChickenPOSController();
            controller.run();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            main(args);
        }
    }
}
