package ch06;

class 궁수{
    String name = "궁수";
}

class 전사{
    String name = "전사";
}

public class ObjectEx02 {
    public static void main(String[] args) {
        // 궁수만 저장 가능
        궁수[] s1 = new 궁수[2];
        s1[0] = new 궁수();
        s1[1] = new 궁수();

        System.out.println(s1[0].name);
        System.out.println(s1[1].name);

        // 궁수,전사 둘 다 가능 -> 다운캐스팅해야함
        Object[]s2 = new Object[2];
        s2[0] = new 궁수();
        s2[1] = new 전사();

        궁수 g1 = (궁수)s2[0];
        전사 g2 = (전사)s2[1];

        System.out.println(g1.name);
        System.out.println(g2.name);

    }
}
