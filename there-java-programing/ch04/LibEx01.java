package ch04;

//jar 파일 import
import recipe.MySoup;

// JDK 설치 - JDK(javac, java), JRE(라이브러리), JVM (자바 가상머신)
public class LibEx01 {
    public static void main(String[] args) {
        MySoup m = new MySoup();
        m.김치찌개();
    }
}
