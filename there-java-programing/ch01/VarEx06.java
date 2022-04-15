package ch01;

// VarEx06 -> main
// Note -> X

class Note {
    int price = 2000; // static으로 하면 X
}

public class VarEx06 {
    public static void main(String[] args) {
        Note note1 = new Note(); // heap공간에 Note클래스가 가지고 있는 모든 데이터를 할당해!! (대신 static은 제외)
        Note note2 = new Note();
        Note note3 = new Note(); // heap 공간

        int age = 25; // main stack 공간
        System.out.println(age);

        note3.price = 30000;
        System.out.println(note1.price);
        System.out.println(note2.price);
        System.out.println(note3.price);
    }
}
