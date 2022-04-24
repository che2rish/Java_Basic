package ch04;

// 상태를 정의할 때는 값을 초기화하지 않는다.
// 값을 초기화하지 않는 이유는 new 할 때마다 다른 상태를 가진 고양이를 만들기 위해서이다.
public class Cat {
    String name;
    String color;

    // Cat() 생성자를 디폴트 생성자라고 한다. (매개변수가 없는 것)
    // 개발자가 적지 않아도 있는 것!! (생략가능한 코드)
    // 내가 직접 생성자를 구현하게 되면 디폴트 생성자가 생략될 수 없다.
    public Cat() {

    }

    // 개발자가 직접 생성자 구현 => 디폴트 생성자가 생기지 않음
    public Cat(String n, String c) { // 생성자 (메서드)
        System.out.println("고양이가 탄생함");
        System.out.println("n : " + n);
        System.out.println("c : " + c);

        // String n, String c는 지역변수 = Cat() 이라는 생성자(메서드)가 가진 지역변수
        name = n;
        color = c;
    }
}

