package chapter05_Array;

// p204 빈도수 구하기(배열에 어떤 값이 몇 개 저장되어 있는지 세어서 보여준다.)
public class ex11 {
    public static void main(String[] args){
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for(int i = 0; i < numArr.length; i++){
            numArr[i] = (int)(Math.random() * 10); // 0~9의 임의의 수를 배열에 저장
            System.out.print(numArr[i]);
        }
        System.out.println();

        for(int i = 0; i <numArr.length; i++){
            counter[numArr[i]]++; // numArr에 저장된 값과 일치하는 인덱스의 요소에 저장된 값을 1 증가
        }

        for(int i = 0; i < numArr.length; i++){
            System.out.println(i + "의 개수 : "+ counter[i]);
        }
    }
}
