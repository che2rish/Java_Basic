package ch09;

public class ComputerTest {
    public static void main(String[] args){

        Desktop desktop = new Desktop();
        // Computer desktop = new Desktop();도 가능하지만 Desktop()에서 추가적으로 선언한 메소드는 사용 X
        // 또한 Computer computer  = new Computer();도 사용 불

        desktop.display();
    }
}
