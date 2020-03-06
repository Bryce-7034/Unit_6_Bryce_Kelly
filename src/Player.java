import java.util.ArrayList;

public class Player {
    private Deck deck;
    private ArrayList<Card> hand;
    private int num;

    public Player(int num, Deck deck){
        this.num = num;
        this.deck = deck;
        hand = new ArrayList<>();
    }
    public void draw(){
        hand.add(deck.getDeck().remove(0));
    }
    public int getCard(){
        try {
            return hand.get(0).getFace();
        }catch(IndexOutOfBoundsException weg){return -1;}
    }
    public int getWar(){
        return hand.get(hand.size()>= 4? 3:0).getFace();
    }
    public Deck getDeck(){
        return deck;
    }
    public ArrayList<Card> getHand(){
        return hand;
    }
    public void win(Card card){
        hand.add(card);
        hand.add(hand.get(0));
        hand.remove(0);
    }
    public Card lose(){
        if(hand.size()>0) {
            Card hold = hand.get(0);
            hand.remove(0);
            return hold;
        }else{return null;}
    }
    public void winWar(Card[] cards){
        hand.add(cards[0]);
        hand.add(cards[1]);
        hand.add(cards[2]);
        hand.add(cards[3]);
        try {
            for (int i = 0; i == 3; i++)
                hand.add(hand.get(0));
            for (int i = 0; i == 4; i++)
                hand.remove(i);
        }catch(IndexOutOfBoundsException egg){}
    }
    public Card[] loseWar(){
        Card[] hold = {hand.get(0), hand.get(1), hand.get(2), hand.get(3)};
        for(int spider = 0; spider <= 3; spider++) {
            hand.remove(0);
        }
        return hold;
    }
    public void startHand(int cardNum){
        for (int i = 0; i < cardNum; i++) {
            draw();
        }
    }
    public String toString(){
        return "Player " + num + ": " + hand;
    }
}
