package ch05;

interface RemoconAble{
    public void 초록버튼();
    public void 빨간버튼();
}

class Samsung implements RemoconAble{

    @Override
    public void 초록버튼() {
        System.out.println("전원이 켜짐");
    }

    @Override
    public void 빨간버튼() {
        System.out.println("전원이 꺼짐");
    }
}

class LG implements RemoconAble{

    @Override
    public void 초록버튼() {
        System.out.println("전원이 켜짐");
    }

    @Override
    public void 빨간버튼() {
        System.out.println("전원이 꺼짐");
    }

}

public class ExampleEx01 {

    // 삼성 리모콘 2개 만들기 (new)
    Samsung s1 = new Samsung();
    Samsung s2 = new Samsung();

    // LG 리모콘 2개 만들기 (new)
    LG g1 = new LG();
    LG g2 = new LG();

}
