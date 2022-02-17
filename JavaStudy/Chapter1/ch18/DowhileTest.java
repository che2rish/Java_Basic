package ch18;

import java.util.Scanner;

public class DowhileTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		
		do { // 일단 수행문을 한 번 실행 후  조건 체크
			input = scanner.nextInt();
			sum += input;
		} while(input != 0);
		
		System.out.println(sum);
	}

}
