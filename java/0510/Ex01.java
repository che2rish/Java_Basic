// 처음으로 sum이 100을 넘었을 때의 sum,i의 값 출력
public class Ex01 {

    public static void main(String[] args) {
        int sum = 0, i = 0;

        while(sum < 100) {
            sum += ++i;
        }

//		for(i = 1; ; i++) {
//			sum += i;
//			if(sum > 100) break;
//		}

        System.out.println("sum = " + sum +", i = " + i);

    }

}