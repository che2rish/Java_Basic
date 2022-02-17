package chapter05_Array;

// p197 배열의 활용 - 섞기(shuffle / 배열의 요소의 순서를 반복해서 바꾼다. (카드섞기))
public class ex07 {
    public static void main(String[] args){
        int[] numArr = new int[10];

        for(int i = 0; i<numArr.length; i++){
            numArr[i] = i; // 배열을 0~9의 숫자로 초기화한다.
            System.out.println(numArr[i]);
        }
        System.out.println();

        for (int i = 0; i < 100; i++){ // 100번 반복??
            int n = (int)(Math.random()*10); // 0~9중의 한 값을 임의로 얻는다.
            // numArr[0]과 numArr[n]의 값을 서로 바꾼다.
            int tmp = numArr[0]; // numArr[0]의 값을 변수 tmp에 저장한다.
            numArr[0] = numArr[n]; // numArr[n]의 값을 numArr[0]에 저장한다.
            numArr[n] = tmp; // tmp의 값을 numArr[n]에 저장한다.
        }
        // 100번 반복 안하고 더 효율적인 방법
        for (int i = 0; i< numArr.length; i++){
            int n = (int)(Math.random()*10); // 0~9중의 한 값을 임의로 얻는다.
            // numArr[i]와 numArr[n의 값을 서로 바꾼다.]
            int tmp = numArr[i];
            numArr[i] = numArr[n];
            numArr[n] = tmp;
        }

        for(int i = 0; i < numArr.length; i++)
            System.out.println(numArr[i]);
    }
}
