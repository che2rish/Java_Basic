package chapter07;

class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

    SutdaDeck2(){
        for(int i = 0; i < cards.length; i++){
            int num = i%10 + 1;
            boolean isKwang = (num == 1 || num == 3 || num == 8) && (num<10);

            cards[i] = new SutdaCard2(num,isKwang);
        }
    }

    void shuffle(){
        for(int i = 0; i < cards.length; i++){
            int n = (int)(Math.random() * cards.length);

            SutdaCard2 tmp = cards[i];
            cards[i] = cards[n];
            cards[n] = tmp;
        }
    }

    SutdaCard2 pick(int index){
        if(index < 0 || index >= CARD_NUM){
            return null;
        }
        return cards[index];
    }

    SutdaCard2 pick(){
        int index = (int)(Math.random()* cards.length);
        return pick(index);
    }
}

class SutdaCard2 {
    int num;
    boolean isKwang;

    SutdaCard2(){
        this(1,true);
    }

    SutdaCard2(int num,boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    // info()대신 Object클래스의 toString()을 오버라이딩 했다.
    public String toString(){
        return num + (isKwang? "K":"");
    }
}

public class ex02 {
    public static void main(String args[]){
        SutdaDeck2 deck = new SutdaDeck2();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i = 0; i < deck.cards.length; i++){
            System.out.print(deck.cards[i]+",");
        }

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
