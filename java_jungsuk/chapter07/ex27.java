package chapter07;

class Outer3{
    int value = 10; // Outer3.this.value

    class Inner{
        int value = 20; // this.value
        void method1(){
            int value = 30; // value

            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer3.this.value);
        }
    }
}

public class ex27 {

    public static void main(String[] args) {

        Outer3 outer = new Outer3();
        Outer3.Inner inner = outer.new Inner();

        inner.method1();
    }
}
