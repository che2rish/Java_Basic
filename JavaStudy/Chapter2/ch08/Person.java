package ch08;

// 다음 설명에 해당되는 객체를 구현하고 해당 정보를 출력해 보세요
// 1. 키가 180 이고 몸무게가 78 킬로인 남성이 있습니다. 이름은 Tomas 이고 나이는 37세입니다.
public class Person {

   public int height;
   public int weight;
   public String gender;
   public String name;
   public int age;

    public String showInfo(){
        return "키가 "+ height + "이고 몸무게가 "+ weight+ " 킬로인 " + gender+"이 있습니다. 이름은 " + name + " 이고 나이는 " + age+ "세 입니다";
    }

//    public void showPerson(){
//        System.out.println("키가 " + height + "이고, 몸무게가 " + weight + "킬로인 "+ gender + "이 있습니다.");
//        System.out.println("이름은 " + name + "이고, 나이는 " + age + "세입니다" );
//    }

}
