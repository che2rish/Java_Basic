package ch06;

public class VariableTest {

	public static void main(String[] args) {
		
		byte bnum = -128; // -128 ~ 127 -> 128 넣으면 오류
		
		System.out.println(bnum);
		
		//int num = 12345678900; // 범위를 넘어가서 오류
		long lnum = 12345678900L; // long타입을 사용할 때 L,l을 사용
		
		System.out.println(lnum);
	}
}
