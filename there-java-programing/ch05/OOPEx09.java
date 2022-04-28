package ch05;

// 행위에 대한 제약 -> 유지보수하기 좋음??
interface MoveAble{
    // public abstract이 생략되어 있음
    void 위();
    void 아래();
    void 왼쪽();
    void 오른쪽();
    void 냄새맡기();
}

interface MoveAble2{
    // public abstract이 생략되어 있음
    void 위();
    void 아래();
    void 왼쪽();
    void 오른쪽();
    void 땅바닥숨기();
}

abstract class 사나운동물 implements MoveAble{
    abstract void 공격(); // 미완성된 메서드

    @Override
    public void 위() {
        System.out.println("위쪽으로 이동");
    }

    @Override
    public void 아래() {
        System.out.println("아래쪽으로 이동");
    }

    @Override
    public void 왼쪽() {
        System.out.println("왼쪽으로 이동");
    }

    @Override
    public void 오른쪽() {
        System.out.println("오른쪽으로 이동");
    }

    // 완성을 시킨다 -> 이유는 다 코로 냄새맡을거니깐!!
    @Override
    public void 냄새맡기() {
        System.out.println("코로 냄새맡기");
    }
}

abstract class 온순한동물 implements MoveAble2{
    abstract void 채집(); // 미완성된 메서드

    @Override
    public void 위() {
        System.out.println("위쪽으로 이동");
    }

    @Override
    public void 아래() {
        System.out.println("아래쪽으로 이동");
    }

    @Override
    public void 왼쪽() {
        System.out.println("왼쪽으로 이동");
    }

    @Override
    public void 오른쪽() {
        System.out.println("오른쪽으로 이동");
    }

    @Override
    public void 땅바닥숨기() {
        System.out.println("땅바닥으로 숨기");
    }
}

// 구현이 자식 클래스로 위임(위,아래,왼쪽,오른쪽)
class 원숭이 extends 온순한동물{

    @Override // 어노테이션 = JVM이 실행시에 분석해서 확인 = JVM의 힌트
    void 채집() {
        System.out.println("바나나 채집");
    }
}

class 소 extends 온순한동물{

    @Override
    void 채집() {
        System.out.println("풀 채집");
    }
}

class 호랑이 extends 사나운동물{

    @Override
    void 공격() {
        System.out.println("몸통 박치기로 공격");
    }
}

class 코뿔소 extends 사나운동물{

    @Override
    void 공격() {
        System.out.println("이빨로 공격");
    }
}
public class OOPEx09 {
    static void 조이스틱(온순한동물 u1){
        u1.채집();
        u1.땅바닥숨기();
        u1.위();
        u1.아래();
        u1.오른쪽();
        u1.왼쪽();
        System.out.println("================");
    }
    // 오버로딩
    static void 조이스틱(사나운동물 u1){
        u1.공격();
        u1.위();
        u1.아래();
        u1.오른쪽();
        u1.왼쪽();
        u1.냄새맡기();
        System.out.println("================");
    }

    public static void main(String[] args) {
        소 u1 = new 소();
        조이스틱(u1);
        원숭이 u2 = new 원숭이();
        조이스틱(u2);

        호랑이 u3 = new 호랑이();
        조이스틱(u3);
        코뿔소 u4 = new 코뿔소();
        조이스틱(u4);
    }
}
