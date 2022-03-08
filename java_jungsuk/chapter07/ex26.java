package chapter07;

class Outer2{
   static class Inner{
        int iv = 200;
    }
}

public class ex26 {
    public static void main(String[] args){
        Outer2.Inner i = new Outer2.Inner();

        System.out.println(i.iv);

    }
}
