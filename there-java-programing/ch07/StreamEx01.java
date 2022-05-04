package ch07;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {
    public static void main(String[] args) {
        InputStream in = System.in; // System.in (키보드)

        // 1. 키보드는 A를 인코딩해서 01000001으로 컴퓨터에게 전송
        // 2. ByteStream으로 흘러들어간다. (Input)
        // 3. read() 메서드로 01000001 -> 65로 디코딩한다.
        // 4. 65를 -> 문자로 부호화 시킨다.
        // 한번에 1Byte만 전송 가 -> 더 많이 보내도 받지 못함
        try {
           int data = in.read();
            System.out.println(data);
            System.out.println((char)data); // 부호화
        } catch (Exception e) { // 컴파일에러
            e.printStackTrace();
        }
    }
}
