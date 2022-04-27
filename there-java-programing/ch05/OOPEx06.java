package ch05;

class 프로토스유닛{
    String name = "프로토스유닛";
    void 기본공격(프로토스유닛 e1){} // 무효화됨

    String 이름확인(){ // 무효화됨
        return "?";
    }
}

class 질럿 extends 프로토스유닛{
    String name = "질럿";

    // 오버라이드 = 부모의 메서드를 무효화하다.
    void 기본공격(프로토스유닛 e1){
//        System.out.println("질럿 메서드");
        System.out.println(this.name + "이 " + e1.이름확인() + "을 공격합니다.");
    }
}

class 드라군 extends 프로토스유닛{
    String name = "드라군";

    // 오버라이드 = 부모의 메서드를 무효화하다.
    String 이름확인(){
        return name;
    }
}

class 다크템플러 extends 프로토스유닛{
    String name = "다크템플러";
}

public class OOPEx06 {
    public static void main(String[] args) {
        프로토스유닛 u1 = new 질럿(); // (질럿, 프로토스유닛V)
        프로토스유닛 u2 = new 드라군(); // (드라군, 프로토스유닛V)
        프로토스유닛 u3 = new 다크템플러(); // (다크템플러, 프로토스유닛V)

        u1.기본공격(u2);
    }
}
