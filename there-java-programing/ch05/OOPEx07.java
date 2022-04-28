package ch05;

// 추상클래스 -> 일반 메서드도 가질 수 있다. but 추상메서드는 반드시 자식들이 구현해야 함
abstract class Animal{
    abstract void speak(); // 추상메서드 (몸체{}가 없다) -> {}가 있으면 안됨
}

class Dog extends Animal{
    // 오버라이드 (Animal의 speak()가 무효화된다.)
    void speak(){
        System.out.println("멍멍");
    }
}

class Cat extends Animal{
    // 오버라이드 (Animal의 speak()가 무효화된다.)
    void speak(){
        System.out.println("야옹");
    }
}

class Bird extends Animal{

    // 추상메서드를 부모가 가지고 있으면 자식은 추상메서드를 반드시 구현해야한다.
    @Override
    void speak() {
        System.out.println("짹짹");
    }
}

public class OOPEx07 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Dog();
        a1.speak(); // 동적바인딩 된다. -> 부모의 메서드가 무효화 되어서
        a2.speak();

//        Animal a3 = new Animal(); // 인스턴스로 만들 수 없다?
    }
}
