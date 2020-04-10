# java-chicken-2019

## 기능 요구 사항
* 치킨집 사장님이 사용하는 간단한 포스(POS) 프로그램을 구현한다.
* [ ] 다음과 같은 기능을 가진다.
    * [x] 주문 등록
    * [ ] 결제하기
    * [ ] 프로그램 종료
* [x] 메뉴 기본 정보가 주어지며 메뉴 번호, 종류, 이름, 가격을 가진다.
* [x] 테이블 기본 정보가 주어지며 테이블 번호를 가진다.
* [ ] 한 테이블에서 주문할 수 있는 한 메뉴의 최대 수량은 99개이다.
* [x] 주문이 등록된 테이블은 결제가 이루어지기 전까지 테이블 목록에 별도로 표시한다.
* [ ] 주문 내역에 대한 계산을 할 때는 결제 유형에 따라 할인율이 달라진다.
* [ ] 치킨 종류 메뉴의 수량 합이 10개가 넘는 경우 10,000원씩 할인된다.
    * e.g. 10개는 10,000원 할인, 20개는 20,000원 할인
* [ ] 현금 결제는 5%가 할인되며 중복 할인이 가능하다.
* [ ] 주문 혹은 결제가 불가능한 경우 그 이유를 보여주고, 다시 주문 혹은 결제가 가능하도록 해야 한다.
* [ ] 최종 결제 금액을 보여준다.

## 제약
* [ ] Menu에 기본 생성자, 인스턴스 변수를 추가할 수 없다. 단 인스턴스 변수 타입 변경은 가능하다.
* [ ] MenuRepository의 기존 코드를 수정할 수 없고 추가만 가능하다.
* [ ] Table의 기본 생성자를 추가할 수 없다.
* [ ] TableRepository의 기존 코드를 수정할 수 없고 추가만 가능하다.
* [ ] 한 메서드에 오직 한 단계의 들여쓰기만 한다.
* [ ] else 예약어를 쓰지 않는다.
* [x] 모든 원시값과 문자열을 포장한다.
* [ ] 한 줄에 점을 하나만 찍는다.
* [ ] 줄여 쓰지 않는다.(축약 금지)
* [ ] 모든 엔티티를 작게 유지한다.
* [ ] 3개 이상의 인스턴스 변수를 가진 클래스를 쓰지 않는다.
* [x] 일급 컬렉션을 쓴다.
* [ ] domain 패키지의 코드 커버리지는 100% classes, 90% lines covered 가 되어야 한다.