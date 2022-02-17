package chapter05_Array;

import java.util.Scanner;

// p227 단어 맞추기 (영어 단어를 보여주고, 뜻을 맞추는 게임)
public class MultiArrEx4 {
    public static void main(String[] args){
        String[][] words = {{"chair","의자"},
                            {"computer","컴퓨터"},
                            {"integer", "정수"}};

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i< words.length; i++){
            System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]); // words[i][0] = 문제

            String tmp = scanner.nextLine();

            if(tmp.equals(words[i][1])){ //words[i][1] = 정답
                System.out.printf("정답입니다. %n%n");
            } else{
                System.out.printf("틀렸습니다. 정답은 %s 입니다. %n%n",words[i][1]);
            }
        }
    }
}
