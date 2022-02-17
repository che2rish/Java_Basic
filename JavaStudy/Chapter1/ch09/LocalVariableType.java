package ch09;

public class LocalVariableType {

	public static void main(String[] args) {
		// 자바 10부터 지원됨
		var i = 10; // int
		var j = 10.0; // double
		var str = "hello"; // String
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		//str = 3; 
	}
}
