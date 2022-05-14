// 구구단
public class Ex02 {

    public static void main(String[] args) {

//		for(int i = 2; i < 10; i++) {
//			for(int j = 1; j < 10; j++) {
//				System.out.println(i + " X " + j + " = " + i*j );
//			}
//			System.out.println();
//		}

        for(int i = 1; i < 10; i++) {
            for(int j = 2; j < 10; j++) {
                System.out.print(j + " X " + i + " = " + i*j +"\t");
            }
            System.out.println();
        }

    }

}