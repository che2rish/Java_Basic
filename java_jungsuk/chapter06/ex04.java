package chapter06;

public class ex04 {
    public static void main(String[] args){
        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름: " + s.name);
        System.out.println("총점: " + s.getTotal());
        System.out.println("평균: " + s.getAverage());
    }
}

class Student{

    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal(){
        return kor + eng + math;
    }

    float getAverage(){
        // return getTotal()/3f; -> 소수 둘쨰자리에서 반올림 하려면
        return (int)(getTotal()/3f*10+0.5f)/10f;
    }
}
