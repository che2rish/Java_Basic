package chapter08;

public class ex06 {
    public static void main(String[] args){
        try{
            method1();
        }catch(Exception e){ // 모든 예외를 처리할 수 있는 catch블럭이 있으므로 예외 처리
            System.out.println(5);
        }
    }

    static void method1() {
        try{
            method2();
            System.out.println(1);
        }catch(ArithmeticException e){
            System.out.println(2);
        }finally {
            System.out.println(3); // try-catch블럭은 있지만 NullPointerException을 처리해줄 블럭이 없으므로 finally블럭만 수행후 종료
        }
        System.out.println(4);
    }

    static void method2() {
        throw new NullPointerException(); // 예외를 처리해줄 try-catch블럭이 없으므로 method2 종료
    }
}
