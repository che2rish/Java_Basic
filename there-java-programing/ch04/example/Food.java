package ch04.example;

public class Food {
    private String name;
    private int price;

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void myPrint(){
        System.out.println(name + " 가격은 " + price +"원 입니다.");
    }
}
