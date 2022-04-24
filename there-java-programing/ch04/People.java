package ch04;

// this는 자기자신의 heap공간을 가르킨다.
public class People {
    String name;
    int age;

    // 디폴트 생성자 -> .java -> .class 컴파일할 때 자바가 자동으로 코드를 만들어줌
    // 직접 생성자를 정의하면 디폴트 생성자 없음
//    public People(){
//        System.out.println("디폴트 생성자");
//    }

    public People(String name, int age){
        System.out.println("People 메서드 스택 name : " + name);
        System.out.println("People 메서드 스택 age : " + age);
        this.name = name;
        this.age = age;
    }
}
