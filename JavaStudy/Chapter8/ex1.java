// 01. 나열된 수에서 최솟값과 최댓값 구하기
public class ex1 {
    public static void main(String[] args){
        int num[] = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};

        int max = num[0];
        int min = num[0];

        int maxPos = 0;
        int minPos = 0;

        for(int i = 0; i < num.length; i++){
            if(max < num[i]){
                max = num[i];
                maxPos = i+1;
            }

            if(min >num[i]){
                min = num[i];
                minPos = i+1;
            }
        }
        System.out.println("가장 큰 값 " + max + " 의 위치는 "+ maxPos);
        System.out.println("가장 작은 값 " + min + " 의 위치는 "+ minPos);
    }
}
