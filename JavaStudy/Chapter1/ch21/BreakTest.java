package ch21;

public class BreakTest {

	public static void main(String[] args) {
		
		int sum = 0;
		int num;
		
		for (num = 1; ; num++) { 
			// if�� ��� for(num = 1; sum<=100; num++)�� ����ϰ� �Ǹ� num�� 15�� ��� (���� �� ���)
			sum += num;
			if(sum >= 100) 
				break;
		}
		
		System.out.println(sum); // 105
		System.out.println(num); // 14
	}
}
