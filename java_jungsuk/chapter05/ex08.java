package chapter05;

public class ex08 {
    public static void main(String[] args){
        int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
        int[] counter = new int[4];

        for(int i=0; i<answer.length; i++){
            counter[answer[i]-1]++;
        }

        for(int i=0; i < counter.length; i++){
            System.out.print(counter[i]);
            int count = counter[i];
            for(int j = 0; j< count; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
