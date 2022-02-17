package chapter05_Array;

import java.util.Arrays; // Arrays.toString()를 사용하기 위해 추가

// p200 임의의 값으로 배열 채우기 (연속 또는 불연속적인 값들로 배열을 초기화 한다.)
public class ex09 {
    public static void main(String[] args){
        int[] code = {-4, -1, 3,6,11}; // 불연속적인 값들로 구성된 배열
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++){
            int tmp = (int)(Math.random() * code.length); // tmp에 0,1,2,3,4 중의 하나가 저장된다.
            arr[i] = code[tmp]; // 배열 code에 저장된 값들 중 하나가 임의로 선택되어 저장
        }
        System.out.println(Arrays.toString(arr));
    }
}
