package ch06;

public class StudentTest {

    public static void main(String[] args){

        // default 생성자가 제공되는 경우는 클래스에 생성자가 하나도 없는 경우 -> 생성자가 있으면 에러
        Student studentLee = new Student();

        System.out.println(studentLee.showStudentInfo());

        Student studentKim = new Student(123456,"Kim",3);
        System.out.println(studentKim.showStudentInfo());
    }
}
