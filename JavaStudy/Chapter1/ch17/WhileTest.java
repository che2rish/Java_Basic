package ch17;

public class WhileTest {
	
	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0; // ���������� �ڵ����� �ʱ�ȭ X -> �ʱ�ȭ�� ���־�� ��
		
		while(num <= 10) {
			sum += num; // �ʱ�ȭ ���ϸ� ���� ����
			num++;
		}
		
		System.out.println(sum);
		System.out.println(num);
	}

}
