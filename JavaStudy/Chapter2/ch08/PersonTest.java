package ch08;

public class PersonTest {
    public static void main(String[] args){
        Person user = new Person();

        user.height = 180;
        user.weight = 78;
        user.gender = "남성";
        user.name = "Tomas";
        user.age = 37;

        System.out.println(user.showInfo());
        //user.showInfo();
    }
}
