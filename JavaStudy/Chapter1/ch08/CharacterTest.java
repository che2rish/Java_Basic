package ch08;

public class CharacterTest {

	public static void main(String[] args) {
		
		char ch1 = 'A';
		
		System.out.println(ch1);
		System.out.println((int)ch1); // 강제 형 변환
		
		char ch2 = 66;
		System.out.println(ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		//char ch = -66; // 음수는 사용 X
		
		char han = '한';
		char ch = '\uD55C'; // 유니코드
				
		System.out.println(han);
		System.out.println(ch);
		
	}
}
