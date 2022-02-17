package ch13;

public class BitTest {

	public static void main(String[] args) {
		
		int num1 = 5;  	// 00000101
		int num2 = 10; 	// 00001010
				
		System.out.println(num1 | num2); // 00001111
		System.out.println(num1 & num2); // 00000000
		System.out.println(num1 ^ num2); // 00001111
		System.out.println(~num1); // 11111010 => 보수? -6출력
		
		System.out.println();
		System.out.println(num1 << 2); // num1 X 2^n => 여기서 n은 2
		System.out.println(num1); // num1의 값은 변하지 않음
		System.out.println(num2 >> 1); // num2 / 2^n => 여기서 n은 1
		System.out.println(num2);
		System.out.println(num1 <<= 2); // 대입연산자 사용
		System.out.println(num1); // num1의 값이 변함

	}
}
