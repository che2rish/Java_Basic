package ch13;

public class BitTest {

	public static void main(String[] args) {
		
		int num1 = 5;  	// 00000101
		int num2 = 10; 	// 00001010
				
		System.out.println(num1 | num2); // 00001111
		System.out.println(num1 & num2); // 00000000
		System.out.println(num1 ^ num2); // 00001111
		System.out.println(~num1); // 11111010 => ����? -6���
		
		System.out.println();
		System.out.println(num1 << 2); // num1 X 2^n => ���⼭ n�� 2
		System.out.println(num1); // num1�� ���� ������ ����
		System.out.println(num2 >> 1); // num2 / 2^n => ���⼭ n�� 1
		System.out.println(num2);
		System.out.println(num1 <<= 2); // ���Կ����� ���
		System.out.println(num1); // num1�� ���� ����

	}
}
