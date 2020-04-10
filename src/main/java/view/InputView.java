package view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputTableNumber() {
        System.out.println("## 주문할 테이블을 선택하세요.");
        return scanner.nextInt();
    }

    public static int inputMenuNumber() {
        System.out.println("## 등록할 메뉴를 입력하세요.");
        return scanner.nextInt();
    }

    public static int inputMenuAmount() {
        System.out.println("## 메뉴의 수량을 입력하세요.");
        return scanner.nextInt();
    }

    public static int inputMainScreenCommand() {
        System.out.println("## 메인화면");
        System.out.println("1. 주문등록");
        System.out.println("2. 결제하기");
        System.out.println("3. 프로그램 종료");
        return scanner.nextInt();
    }

    public static int inputPaymentMethod(int tableNumber) {
        System.out.printf("## %d번 테이블의 결제를 진행합니다.\n", tableNumber);
        System.out.println("## 신용 카드는 1번, 현금은 2번");
        return scanner.nextInt();
    }
}
