package chapter07;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck(){
        for(int i = 0; i < cards.length; i++){
            int num = i%10 + 1;
            boolean isKwang = (num == 1 || num == 3 || num == 8) && (num<10);

            cards[i] = new SutdaCard(num,isKwang);
        }
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1,true);
    }

    SutdaCard(int num,boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    // info()대신 Object클래스의 toString()을 오버라이딩 했다.
    public String toString(){
        return num + (isKwang? "K":"");
    }
}

public class ex01 {
   public static void main(String argx[]){
       SutdaDeck deck = new SutdaDeck();

       for(int i = 0; i < deck.cards.length; i++){
           System.out.print(deck.cards[i]+",");
       }
   }
}

