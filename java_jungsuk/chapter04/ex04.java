package chapter04;

public class ex04 {
    public static void main(String[] args){

        int sum = 0;
        int s = 1; // 부호를 바꾸는데 사용
        int num = 0;

        for(int i = 1; sum < 100 ; i++,s = -s){
            num = i * s;
            sum += num;
        }
        System.out.println(num);
    }
}
