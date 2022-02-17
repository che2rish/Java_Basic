package ch16;

import java.util.Scanner;

public class SwitchCaseTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int day;
		switch(month) {
		
			case 1: case 3: case 7: case 8: case 10: case 12: 
				day = 31;
				break; // break�� ����ؾ� switch-case���� ��������
				// ���࿡ break�� �Ⱦ��� �Ʒ��� case���� ���� 
			case 2:
				day = 28;
				break;
				
			case 4: case 6: case 9: case 11: 	
				day = 30;
				break;
			
			default: // ��� ��� X
				day = 0;
				System.out.println("�������� �ʴ� �� �Դϴ�.");

		}
		System.out.println(month + "���� " + day + "�� �Դϴ�.");
	}

}
