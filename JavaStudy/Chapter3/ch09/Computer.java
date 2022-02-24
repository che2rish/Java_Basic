package ch09;

public abstract class Computer { // 공통으로 사용할 메소드는 구현

    public abstract void display(); // 상속받을 클래스에서 구현??
    public abstract void typing();

    void turnOn(){
        System.out.println("전원을 킵니다");
    }

    void turnOff(){
        System.out.println("전원을 끕니다");
    }
}
