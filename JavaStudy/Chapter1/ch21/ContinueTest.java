package ch21;

public class ContinueTest {

	public static void main(String[] args) {
		
		int num;
		
		for(num = 1; num <=100; num++) {
			if((num%3) != 0) continue; // 조건이 true이면 for문으로  false이면 아래 수행문 실행
			
			System.out.println(num);
		}
	}
}
