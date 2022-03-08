package chapter07;

class Outer{
    class Inner {
        int iv = 100;
    }
}

public class ex25 {
    public static void main(String[] args){
        Outer o = new Outer();

        Outer.Inner i =o.new Inner();

        System.out.println(i.iv);


    }
}
