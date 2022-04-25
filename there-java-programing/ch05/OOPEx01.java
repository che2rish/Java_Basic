package ch05;

// 접근제어자 = 디폴트 접근제어자, public 접근제어자, private 접근제어자
class Player{
    // 상태 = 필드
    String name; // 이름
    private int thirty; // 목마름 (0 ~ 100) -> 외부 클래스에서 접근 불가능

    public Player(String name, int thirty) {
        this.name = name;
        this.thirty = thirty;
    }

    // 행위 = 메서드 = 값을 변경
    void 물마시기(){
        System.out.println("물마시기 행위");
        this.thirty = this.thirty - 50;
    }

    int 목마름상태확인(){
        return this.thirty;
    }
}

public class OOPEx01 {
    public static void main(String[] args) {
        Player p1 = new Player("홍길동", 100);
        System.out.println("이름은 : " + p1.name);
        System.out.println("갈증지수 : " +p1.목마름상태확인());

        // 1. 첫번째 시나리오
//        p1.thirty = 50; // 마법?? -> 원인 없이 갈증지수 변경
//        System.out.println("갈증지수 : " +p1.thirty);

        // 2. 두번째 시나리오 = 상태가 행위를 변경함 (X) -> 이렇게 하면 안됨 (실수할 수 있음)
//        p1.물마시기();
//        System.out.println(p1.thirty);

        // 3. 세번째 시나리오
        p1.물마시기(); // 실수할 수가 없음
        System.out.println("갈증지수 : " + p1.목마름상태확인());
    }
}
