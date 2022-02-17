package chapter05;

public class ex11 {
    public static void main(String[] args){
        int[][] score = {{100,100,100},
                         {20,20,20},
                         {30,30,30},
                         {40,40,40},
                         {50,50,50}};
        int[][] result = new int[score.length+1][score[0].length+1];

        for (int i=0; i < score.length; i++){
            for(int j=0; j <score[i].length; j++){
                result[i][j] = score[i][j];
                if(j == 2) {
                    for (int k = 0; k < 3; k++) {
                        result[i][3] += result[i][k];
                        result[5][3] += result[i][2];
                    }
                }
                if(i == 4){
                    for(int k = 0; k < 5; k++){
                        result[5][j] += result[k][j];
//                        System.out.println(result[k][j]);
                    }
                }
                // 책 풀이
                result[i][j] = score[i][j];
                result[i][score[0].length] += result[i][j];
                result[score.length][j] += result[i][j];
                result[score.length][score[0].length] += result[i][j];
            }
        }

        for (int i=0; i < result.length; i++){
            for(int j = 0; j < result[i].length; j++){
                System.out.printf("%4d",result[i][j]);
            }
            System.out.println();
        }
    }
}
