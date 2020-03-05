public class Card {
    private int suit;
    private int face;
    public Card(int face, int suit){
        this.face = face;
        this.suit = suit;
    }
    /*
    public Card(){
        this.face = (int)(Math.random()*13+2);
        this.suit = (int)(Math.random()*4);
    }
    */
    public int getFace(){
        return face;
    }
    public int getSuite(){
        return suit;
    }
    public String toString(){
        String result = "";
        result += face<11 ? face : face==11 ? "J": face==12 ? "Q": face==13 ? "K": face==14 ? "A": "";
        result += suit==1? "♡" : suit == 2 ? "♢" : suit == 3 ? "♤" : suit == 4 ? "♧": "";
        return result;
    }
}
