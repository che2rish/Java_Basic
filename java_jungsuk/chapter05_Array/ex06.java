package chapter05_Array;

// p197 배열의 활용 - 최대값과 최소값 (배열의 요소 중에서 제일 큰 값과 제일 작은 값을 찾는다.)
public class ex06 {
    public static void main(String[] args){
        int[] score = {79,88,91,33,100,55,95};

        int max = score[0]; // 배열의 첫번째 값으로 최대값을 초기화한다.
        int min = score[0]; // 배열의 첫번째 값으로 최소값을 초기화한다.

        for(int i = 1; i < score.length; i++){ // 배열의 두 번째 요소부터 읽기 위해서 변수 i의 값을 1로 초기화한다.
            if(score[i] > max){
                max = score[i]; // 배열에 담긴 값이 max에 저장된 값보다 크다면 max에 저장
            }else if (score[i] < min){
                min = score[i]; // 배열에 담긴 값이 min에 저장된 값보다 작다면 min에 저장
            }
        }
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}
