package ch09;

public class ArrayIndexException {
    public static void main(String[] args){

        int [] arr = {1,2,3,4,5};

//        for(int i = 0; i <= 5; i++){
//            System.out.println(arr[i]); //ArrayIndexOutOfBoundsException
//        }

        try{
            for(int i = 0; i <= 5; i++){
                System.out.println(arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage()); // Exception에 대한 내용 출력 -> Index 5 out of bounds for length 5
            System.out.println(e.toString()); // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        }
        // Exception이 발생해도 계속 돌리기는 함..
        System.out.println("here!!!"); // 출력됨
    }
}
