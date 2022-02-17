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
				break; // break를 사용해야 switch-case문을 빠져나감
				// 만약에 break를 안쓰면 아래의 case문도 실행 
			case 2:
				day = 28;
				break;
				
			case 4: case 6: case 9: case 11: 	
				day = 30;
				break;
			
			default: // 없어도 상관 X
				day = 0;
				System.out.println("존재하지 않는 달 입니다.");

		}
		System.out.println(month + "월은 " + day + "일 입니다.");
	}

}
