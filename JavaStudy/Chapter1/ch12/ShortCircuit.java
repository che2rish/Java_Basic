package ch12;

public class ShortCircuit {
	
	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;

		boolean value = ((num1 = num1 + 10)<10) && ((i = i+2)<10);
		
		System.out.println(value); // false
		System.out.println(num1); // 20
		System.out.println(i); // 2 -> 앞의 항이 false이므로 뒤의 항 연산 X
		
		int num2 = 10;
		int i2 = 2;
		
		boolean value2 = ((num2 = num2 + 10) <10) || ((i2 = i2+2)<10);
		System.out.println(value2); // true
		System.out.println(num2); // 20
		System.out.println(i2); //4 
		
		int num3 = 10;
		int i3 = 2;
		
		boolean value3 = ((num3 = num3 + 10) > 10) || ((i3 = i3+2)<10);
		System.out.println(value3); // true
		System.out.println(num3); // 20
		System.out.println(i3); // 2 -> 앞의 항이 true이므로 뒤의 항 연산 X
	}
}
