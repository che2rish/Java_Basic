package ch06;

import java.util.ArrayList;

public class CollectionEx01 {
    public static void main(String[] args) {

        // int, double, char, boolean => 기본자료형 (값)
        // String, 커스텀 자료형(클래스) => 레퍼런스자료형(주소)
        // 래핑클래스 = Integer, Double, Character, Boolean
        // 제네릭 자리에는 기본자료형 못들어온다.
        ArrayList<Integer> c1 = new ArrayList<>();

        c1.add(1);
        c1.add(2);
        c1.add(3);

        //System.out.println(c1.get(0));

        // for문(반복문) = 리팩토링
        int size = c1.size();
        System.out.println("사이즈 : " + size);
        for (int i = 0; i < size ; i++) {
            System.out.println(c1.get(i));
        }
    }
}
