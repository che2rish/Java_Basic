package ch04;

// jar 파일 import
// 직접 라이브러리 생성
import recipe.MySoup;
// 제공된 라이브러리 사용
import java.util.Random;

// JDK 설치 - JDK(javac, java), JRE(라이브러리), JVM (자바 가상머신)
public class LibEx01 {
    public static void main(String[] args) {
        MySoup m = new MySoup();
        m.김치찌개();

        Random r = new Random();
        System.out.println(r.nextInt());
    }
}
