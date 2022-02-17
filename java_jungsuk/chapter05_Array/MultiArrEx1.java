package chapter05_Array;

import java.util.Scanner;

// p220 좌표에 X표하기 (입력한 2차원 좌표의 위치에 X를 표시)
public class MultiArrEx1 {
    public static void main(String[] args){
        final int SIZE = 10;
        int x = 0, y = 0;

        char[][] board = new char[SIZE][SIZE];
        // 0은 바다 1은 배가 있는 것
        byte[][] shipBoard = { {0,0,0,0,0,0,1,0,0},
                               {1,1,1,1,0,0,1,0,0},
                               {0,0,0,0,0,0,1,0,0},
                               {0,0,0,0,0,0,1,0,0},
                               {0,0,0,0,0,0,0,0,0},
                               {1,1,0,1,0,0,0,0,0},
                               {0,0,0,1,0,0,0,0,0},
                               {0,0,0,1,0,0,0,0,0},
                               {0,0,0,0,0,1,1,1,0}};

        // 1행에 행번호를, 1열에 열번호를 저장한다.
        for (int i=1; i<SIZE; i++)
            board[0][i] = board[i][0] = (char)(i+'0'); // board는 char배열이므로 숫자를 문자로 변환

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.printf("좌표를 입력하세요. (종료는 00)>");
            String input = scanner.nextLine(); // 화면에 입력받은 내용을 input에 저장

            if(input.length() ==2){ // 두글자를 입력한 경우
                x = input.charAt(0)-'0'; // 문자를 숫자로 변환
                y = input.charAt(1)-'0';

                if(x==0 && y==0) // x와 y가 모두 0인 경우 종료
                    break;
            }
            if(input.length() !=2 || x<=0 || x >=SIZE || y <= 0 || y >= SIZE){
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                continue;
            }

            // shipBoard[x-1][y-1]의 값이 1이면, 'O'를 board[x][y]에 저장한다.
            // board배열과 shipBoard 배열의 좌표는 각각 1씩 차이가 난다.
            board[x][y] = shipBoard[x-1][y-1] ==1 ? 'O':'X'; // 입력받은 배열에 저장된 값이 1이면 'O'를 1이 아니면 'X'

            // 배열 board의 내용을 화면에 출력한다.
            for(int i = 0; i<SIZE; i++)
                System.out.println(board[i]); // board[i]는 1차원 배열 -> println메서드가 char 배열인 경우에만 가능??
            System.out.println();
        }
    }
}
