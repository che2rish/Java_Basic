package ch06;

public class Student {

    // 멤버 변수는 만들어지면 자동으로 초기화
    public int studentNumber;
    public String studentName;
    public int grade;

    // default 생성자
    public Student(){

    }

    // 넘어온 파라미터를 가지고 초기화
    public Student(int studentNumber, String studentName, int grade){

        this.studentNumber = studentNumber; // this를 이용해서 멤버변수임을 지정
        this.studentName = studentName;
        this.grade = grade;

    }

    public String showStudentInfo(){

        return studentName + "학생의 학번은 "+ studentNumber + "이고, " + grade + "학년 입니다.";
    }
}
