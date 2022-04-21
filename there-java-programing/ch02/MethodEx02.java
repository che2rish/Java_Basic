package ch02;

public class MethodEx02 {

    // void -> 리턴(돌려주지)하지 않겠다.
//    static void add(){ // 호출이 되면 중괄호 내부가 실행된다. 이 때 Stack 공간이 메모리에 만들어진다.
//        int sum = 5 + 6;
//        System.out.println(sum); // 화면에 출력 -> main에서 sum에 접근 X
//    }

    static int add(){
        int sum = 5 + 6;
        return sum;
    }

    public static void main(String[] args) {
       // add(); // add() 메서드 호출
        int result = add();
        System.out.println(result);
    }
}
