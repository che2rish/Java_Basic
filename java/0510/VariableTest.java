public class VariableTest {

    public static void main(String[] args) {
        char ch = 'A';
        String str = "A";
        int n = 100;
        long l = 100L;
        double d = 3.14;
        float f = 3.14f;
        System.out.println(ch);

        boolean b = true;
        int hex = 0x100;
        System.out.println(hex);

        byte b1 = 10;
        byte b2 = 20;
//		byte res = b1+b2; // int + int라 에러
        byte res = (byte)(b1+b2);

        int m = 10;
        m *= 3+5; // m = m*(3+5);
    }

}