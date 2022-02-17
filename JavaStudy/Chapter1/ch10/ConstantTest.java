package ch10;

public class ConstantTest {
	
	public static void main(String[] args) {
		
		final int MAX_NUM = 100; // 다른 변수와 차별화를 위해 상수는 대문자로 많이 표현
		final int MIN_NUM;
		
		// MAX_NUM = 20; -> 한 번 정해진 값이 바뀔 수 없다.
		MIN_NUM = 0; // 초기화 반드시 필요
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		
	}

}
