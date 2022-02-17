package ch22;

public class TwoDimensionTest {
    public static void main(String[] args){

        int[][] arr = {{1,2,3},{1,2,3,4}};
        // int [][] arr = new int[3][4]; -> 데이터를 안넣으면 지정을 해야함

        int i,j;

        for(i = 0; i < arr.length; i++){ // arr.length -> 행의 길이
            for(j = 0; j <arr[i].length; j++){
                System.out.print(arr[i][j] + ",");
            }
            System.out.println("\t" + arr[i].length);
        }
    }
}
