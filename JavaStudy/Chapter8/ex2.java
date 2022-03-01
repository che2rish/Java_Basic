// 02. 정렬된 수에서 하나의 수의 위치 찾기 (이진탐색)

public class ex2 {

    public static void main(String[] args){
        int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};

        int target = 83; // 찾을 수

        int left = 0;
        int right = numbers.length-1; // 제일 끝 위치
        int mid = (left+right)/2; // 중간값의 위치

        int temp = numbers[mid]; // 비교할 내용
        boolean find = false; // 찾았는지 아닌지

        while(left <= right){
            if(target == temp){
                find = true; // 값을 찾았으면
                break;
            }else if(target < temp){ // 중간값보다 작으면
                right = mid - 1; // right 변경
            }else{ // 중간값보다 크면
                left = mid + 1; // left 변경
            }

            mid = (left+right)/2;
            temp = numbers[mid];
        }

        if(find == true){
            mid++;
            System.out.println("찾는 수는 " + mid + "번째 있습니다.");
        } else {
            System.out.println("찾는 수가 없습니다.");
        }

    }

}
