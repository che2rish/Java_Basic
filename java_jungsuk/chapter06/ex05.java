package chapter06;

public class ex05 {
    public static void main(String[] args){

        Student2 s = new Student2("홍길동",1,1,100,60,76);

        System.out.println(s.info());
    }

}

class Student2{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student2(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal(){
        return kor + eng + math;
    }

    float getAverage(){
        // return getTotal()/3f; -> 소수 둘쨰자리에서 반올림 하려면
        return (int)(getTotal()/3f*10+0.5f)/10f;
    }

    String info(){
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math+ "," + getTotal() + ","+ getAverage();
    }
}
