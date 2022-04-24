package ch04.example;

public class FoodApp {
    public static void main(String[] args) {
        Food food1 = new Food("치킨", 2000);
        food1.myPrint();

        Food food2 = new Food("피자", 5000);
        food2.myPrint();
    }
}
