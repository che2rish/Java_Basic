package ch19;

public class ForTest {
	
	public static void main(String[] args) {
		
		int count = 1;
		int sum = 0;
		
		for(int i = 0; i <10; i++, count++) { // 문장이 하나 이상 들어갈 수 있음
			
			sum += count; // 10번 반복해서 1 ~ 10 의 합
			
		}
		
		System.out.println(sum);
		
		int num = 1;
		int total = 0;
		
		while (num <= 10) {
			
			total += num;
			num++;
			
		}
		
		System.out.println(total);
	}

}
