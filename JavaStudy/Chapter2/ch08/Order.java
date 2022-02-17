package ch08;

// 다음 설명에 해당되는 객체를 구현하고 해당 정보를 출력해 보세요
// 2. 음식점에 배달 주문이 들어왔습니다.
//      주문 접수 번호 : 202011020003
//      주문 핸드폰 번호 : 01023450001
//      주문 집 주소 : 서울시 강남구 역삼동 111-333
//      주문 날짜 : 20201102
//      주문 시간 : 130258
//      주문 가격 : 35000
//      메뉴 번호 : 0003

public class Order {

    public String orderNumber;
    public String phoneNumber;
    public String address;
    public String orderDate;
    public String orderTime;
    public String price; // int
    public String menuNumber;

    public Order(){

    }

    public void showOrder(){
        System.out.println("주문 접수 번호: " + orderNumber);
        System.out.println("주문 핸드폰 번호: " + phoneNumber);
        System.out.println("주문 집 주소: " + address);
        System.out.println("주문 날짜: " + orderDate);
        System.out.println("주문 시간: " + orderTime);
        System.out.println("주문 가격: " + price);
        System.out.println("메뉴 번호: " + menuNumber);
    }

}
