package ch12;

public class Person {

    String name;
    int age;

    public Person(){
        // 생성자 호출해서 초기화
        this("no name",1);
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;

    }

    public void showPerson(){
        System.out.println(name + " , " + age);
    }

    public Person getPerson(){
        return this;
    }

    public static void main(String[] args){
        Person person = new Person();
        person.showPerson();

        System.out.println(person); // 자신의 주소를 반환

        Person person2 = person.getPerson();
        System.out.println(person2); // 자신의 주소를 반환
    }
}
