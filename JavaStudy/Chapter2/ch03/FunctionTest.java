package ch03;

public class FunctionTest {

    // 매개변수, 반환값 있는 것
    public static int addNum(int num1, int num2){

        int result;
        result = num1 + num2;
        return result;
    }

    // 매개변수는 있고, 반환값은 없는 것
    public static void sayHello(String greeting){
        System.out.println(greeting);
    }

    // 반환값은 있는데, 매개변수가 없는 것
    public static int calcSum(){
        int sum = 0;
        int i;

        for(i = 0; i<=100; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args){

        int n1 = 10;
        int n2 = 20;

        int total = addNum(n1,n2);
        System.out.println(total);

        sayHello("안녕하세요");

        total = calcSum();
        System.out.println(total);
    }
}
