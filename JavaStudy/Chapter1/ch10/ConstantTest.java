package ch10;

public class ConstantTest {
	
	public static void main(String[] args) {
		
		final int MAX_NUM = 100; // �ٸ� ������ ����ȭ�� ���� ����� �빮�ڷ� ���� ǥ��
		final int MIN_NUM;
		
		// MAX_NUM = 20; -> �� �� ������ ���� �ٲ� �� ����.
		MIN_NUM = 0; // �ʱ�ȭ �ݵ�� �ʿ�
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		
	}

}
