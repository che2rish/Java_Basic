public class SwitchTest {

    public static void main(String[] args) {
        int kor = 94, math = 88, eng = 87;
        double avg = (kor+math+eng)/3.0;
        char grade;

        switch((int)avg/10) {
            case 10:
            case 9:
                grade = 'A'; break;
            case 8:
                grade = 'B'; break;
            case 7:
                grade = 'C'; break;
            case 6:
                grade = 'D'; break;
            default:
                grade = 'F';
        }

        System.out.println("평균 : " + avg + ", 학점 :"+grade);
    }

}