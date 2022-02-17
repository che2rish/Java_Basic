package ch14;

public class IfElseTest {
	
	public static void main(String[] args) {

		int age = 7;

		//Scanner scanner = new Scanner(System.in);
		//int age = scanner.nextInt();
		
		if( age >= 8) { //statement(?)가 하나이면 중괄호 생략 가능
			System.out.println("학교에 다닙니다");
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}
	}

}
