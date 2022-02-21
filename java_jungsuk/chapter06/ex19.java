package chapter06;

public class ex19 {
    public static void change(String str){
        str += "456";
    }

    public static void main(String[] args){
        String str = "ABC123";
        System.out.println(str);
        change(str); // "ABC123456" -> change메서드는 종료되고, 작업에 사용하던 메모리를 반환하므로 change메서드의 지역변수인 str역시 메모리에서 제거
        System.out.println("After change:" + str); // ABC123 출력
    }
}
