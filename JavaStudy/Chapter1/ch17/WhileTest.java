package ch17;

public class WhileTest {
	
	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0; // 지역변수는 자동으로 초기화 X -> 초기화를 해주어야 함
		
		while(num <= 10) {
			sum += num; // 초기화 안하면 수식 오류
			num++;
		}
		
		System.out.println(sum);
		System.out.println(num);
	}

}
