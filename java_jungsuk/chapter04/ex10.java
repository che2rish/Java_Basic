package chapter04;

public class ex10 {
    public static void main(String[] args){
        int num = 12345;
        int sum = 0;

        for(int i = 4; i>=0; i--) {
            int num2 = num / (int)Math.pow(10,i);
            num = num - num2 * (int)Math.pow(10,i);
            sum += num2;
        }
        // 책 풀이
//        while(num > 0) {
//            sum += num%10;
//            num /= 10;
//        }
        System.out.println(sum);
    }
}
