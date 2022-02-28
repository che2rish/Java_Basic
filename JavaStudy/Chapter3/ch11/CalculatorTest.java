package ch11;

public class CalculatorTest {

    public static void main(String[] args){

        int num1 = 10;
        int num2 = 2;

        Calc calc = new CompleteCalc(); // showInfo()는 CompleteCalc클래스에 선언 -> 인터페이스타입으로 선언되어 있을 경우 볼 수 없다.
        System.out.println(calc.add(num1,num2));
        System.out.println(calc.substract(num1,num2));
        System.out.println(calc.times(num1,num2));
        System.out.println(calc.divide(num1,num2));
    }
}
