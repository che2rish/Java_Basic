package chapter06;

class MyPoint{
    int x;
    int y;

    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    double getDistance(int x1, int y1){
        return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)); // x, y는 인스턴스 변수
    }

}
public class ex07 {
    public static void main(String[] args){
        MyPoint p = new MyPoint(1,1);

        // p와 (2,2)의 거리를 구한다.
        System.out.println(p.getDistance(2,2));
    }
}
