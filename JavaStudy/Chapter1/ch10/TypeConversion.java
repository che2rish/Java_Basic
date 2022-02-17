package ch10;

public class TypeConversion {

	public static void main(String[] args) {
		
		byte bNum = 125;
		int iNum = bNum; // 자동 형 변환
		
		System.out.println(iNum);
		
		int iNum2 = 255;
		byte bNum2 = (byte)iNum2; // 강제 형 변환
		
		System.out.println(bNum2);
		
		double dNum = 3.14;
		int iNum3 = (int)dNum;
		
		System.out.println(iNum3);
		
		double dNum2 = 1.2;
		float fNum = 0.9f;
		
		int iNum4 = (int)dNum2 + (int)fNum; // 먼저 int로 변환 1 + 0
		int iNum5 = (int)(dNum2 + fNum); // dNum2 + fNum -> double 
		
		// 결과가 다르게 출력
		System.out.println(iNum4);
		System.out.println(iNum5);
		
	}
}
