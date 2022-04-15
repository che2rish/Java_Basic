package ch01;

// MyVar은 클래스 자료형 = 개발자가 만드는 커스텀 자료형
// 여러가지 데이터를 가지고 있는 클래스를 Beans라고 부름
class MyVar{
    static int n1 = 10;
    static char c1 = 'A';
}

public class VarEx04 {

    static int num = 500;

    public static void main(String[] args) {
        System.out.println(MyVar.n1); // . -> 주소를 찾아갈 때 사용하는 연결연산자
        System.out.println(MyVar.c1);
        System.out.println(VarEx04.num); // VarEx04 생략 가능
    }
}
