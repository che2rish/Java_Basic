package ch19;

public class ForTest {
	
	public static void main(String[] args) {
		
		int count = 1;
		int sum = 0;
		
		for(int i = 0; i <10; i++, count++) { // ������ �ϳ� �̻� �� �� ����
			
			sum += count; // 10�� �ݺ��ؼ� 1 ~ 10 �� ��
			
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
