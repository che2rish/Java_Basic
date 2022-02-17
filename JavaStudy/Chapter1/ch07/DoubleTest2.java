package ch07;

public class DoubleTest2 {

	public static void main(String[] args) {

		double dnum = 1;
		
		for(int i = 0; i<10000; i++) {
			dnum = dnum + 0.1;
		}
		System.out.println(dnum); // 1001.000000000159 -> 약간의 오류 발생
	}

}
