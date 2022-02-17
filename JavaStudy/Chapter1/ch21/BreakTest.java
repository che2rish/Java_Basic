package ch21;

public class BreakTest {

	public static void main(String[] args) {
		
		int sum = 0;
		int num;
		
		for (num = 1; ; num++) { 
			// if문 대신 for(num = 1; sum<=100; num++)로 사용하게 되면 num이 15로 출력 (증가 후 출력)
			sum += num;
			if(sum >= 100) 
				break;
		}
		
		System.out.println(sum); // 105
		System.out.println(num); // 14
	}
}
