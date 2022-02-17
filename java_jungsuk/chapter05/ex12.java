package chapter05;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args){
        String[][] words = {{"chair","의자"},
                {"computer","컴퓨터"},
                {"integer", "정수"}};

        int count = 0;

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i< words.length; i++){
            System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]); // words[i][0] = 문제

            String tmp = scanner.nextLine();

            if(tmp.equals(words[i][1])){ //words[i][1] = 정답
                System.out.printf("정답입니다. %n%n");
                count++;
            } else{
                System.out.printf("틀렸습니다. 정답은 %s 입니다. %n%n",words[i][1]);
            }

            if(i == words.length-1){
                System.out.println("전체 "+(i+1)+"문제 중 " + count+ "문제 맞추셨습니다.");
            }
        }

    }
}
