package chapter05_Array;

// p201 정렬하기(sort, 오름차순, 내림차순으로 배열을 정렬)
public class ex10 {
    public static void main(String[] args){
        int[] numArr = new int[10];

        for(int i = 0; i < numArr.length; i++){
            System.out.print(numArr[i] = (int)(Math.random() * 10));
        }
        System.out.println();

        for(int i = 0; i < numArr.length-1; i++){ // 배열의 길이 -1번만큼 반복해서 비교
            boolean changed = false; // 자리바꿈이 발생했는지를 체크한다.

            for(int j = 0; j < numArr.length-1-i; j++){ // 비교횟수가 1씩 줄어들어서 i를 빼준다.
                // numArr[j]와 바로 옆의 요소 numArr[j+1]을 비교한다.
                if(numArr[j] > numArr[j+1]){ // 옆의 값이 작으면 서로 바꾼다.
                    int temp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = temp;
                    changed = true; // 자리바꿈이 발생했으니 changed를 true로
                }
            }

            if(!changed) break; // 자리바꿈이 없으면 반복문을 벗어난다. -> 자리바꿈이 없다는 것은 정렬이 완료되었음을 뜻함

            for(int k = 0; k < numArr.length; k++)
                System.out.print(numArr[k]); // 정렬된 결과를 출력한다.
            System.out.println();
        }
    }
}
