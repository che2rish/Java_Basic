package ch10;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void startCar(){
        System.out.println("시동을 켭니다.");
    }

    public void turnoff(){
        System.out.println("시동을 끕니다.");
    }

    public void washCar(){} // 구현된 메소드 -> 구현 내용이 없는것.. 추상메소드 아님 -> 필요한 경우에 재정의

    final public void run(){ // 필요한 메소드 호출 , 변하면 안됨 -> final (하위클래스에서 재정의 X)
        startCar();
        drive();
        stop();
        turnoff();
        washCar();
    }
}
