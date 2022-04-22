package ch04.a;

public class App2 {
    public static void main(String[] args) {
        // Cal과 같은 패키지라서 디폴트 접근 제어자 가능
        Cal c = new Cal();
        c.add();
        c.minus();
//        c.multi(); // 찾을 수 없다 -> 같은 클래스가 아니기 때문
    }
}
