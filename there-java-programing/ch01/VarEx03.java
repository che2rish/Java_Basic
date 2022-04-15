package ch01;

public class VarEx03 {

    int n2 = 20;
    static int n3 = 20;

    public static void main(String[] args) {
        int n1 = 10; // 실행될 때 10이라는 숫자가 n1이라는 메모리 공간에 할당된다.
        System.out.println(n1); // main이라는 stack 공간의 n1
        // System.out.println(n2); //Non-static field 'n2' cannot be referenced from a static context
        System.out.println(n3); // VarEx03라는 static 공간의 n3
    }
}
