import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> egg = new ArrayList<Card>();
    public Deck(){
        for(int s = 1; s<5; s++){
            for(int i = 2; i<=14; i++){
                egg.add(new Card(i, s));
            }
        }
    }
    public ArrayList<Card> getDeck(){
        return egg;
    }
    public void shuffle(){
        Collections.shuffle(egg);
    }

    public static void main(String [] args){
        Deck egg = new Deck();
        System.out.println(egg.getDeck());
        egg.shuffle();
        System.out.println(egg.getDeck());
    }
}
