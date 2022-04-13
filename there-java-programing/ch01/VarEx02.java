package ch01;

// 패키지 = 자바 파일이 모여있는 폴더
public class VarEx02 {
    public static void main(String[] args) {

        // 참 or 거짓
        boolean b1 = true; // 박스에 1이 저장
        boolean b2 = false; // 박스에 0이 저장

        // 정수형
        int n1 = 1000; // 메모리에 4Byte 공간이 필요

        // 실수형
        double d1 = 1000.1; // 메모리에 8Byte 공간이 필요

        // 문자형
        char c1 = '가'; // 메모리에 2Byte 공간이 필요

        // 모니터에 출력하겠다.
        // c1, n1 => 변수 (값을 변경할 수 있는 수)
        System.out.println(c1); // 가 출력
        System.out.println(n1); // 1000 출력

        n1 = 50; // 값을 변경 
        System.out.println(n1); // 50 출력
    }
}
